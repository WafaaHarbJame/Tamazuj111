package com.Tamazj.TamazjApp.Fragments;


import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.Tamazj.TamazjApp.Api.MyApplication;
import com.Tamazj.TamazjApp.Model.AdvisoeDeailsBottomDialog;
import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.Model.Distinguished_Advisors_Model;
import com.Tamazj.TamazjApp.R;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstSlideFragment extends Fragment {
    ImageView profileimage;
    TextView percent;
    TextView profile_name;
    TextView profile_dsc;
    ImageView askasteschar;
    View view;
    CardView cardview;
    int ADVISOR_POSITION;
    String lang, token;
    String name, photo, rating, status;


    public FirstSlideFragment() {
        // Required empty public constructor
//        if(ADVISOR_POSITION > 8){
//            ADVISOR_POSITION = 1;
//        } else {
//            ADVISOR_POSITION++;
//        }
    }

    public FirstSlideFragment(int ADVISOR_POSITION) {
        // Required empty public constructor
        this.ADVISOR_POSITION = ADVISOR_POSITION;



        // Toast.makeText(getContext(), ""+ADVISOR_POSITION, Toast.LENGTH_SHORT).show();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

                view=inflater.inflate(R.layout.fragment_first_slide, container, false);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
        if(sharedPreferences != null && sharedPreferences.getString(AppConstants.LANG_choose, Locale.getDefault().getLanguage()) != null){
            lang = sharedPreferences.getString(AppConstants.LANG_choose,Locale.getDefault().getLanguage());
        } else {
            lang = Locale.getDefault().getLanguage();
        }
        if(sharedPreferences != null && sharedPreferences.getString(AppConstants.token, Locale.getDefault().getLanguage()) != null){
            token = sharedPreferences.getString(AppConstants.token,"");
        }


        percent = view.findViewById(R.id.percent);
        profileimage = view.findViewById(R.id.profileimage);
        profile_name = view.findViewById(R.id.profile_name);
        profile_dsc = view.findViewById(R.id.profile_dsc);
        askasteschar=view.findViewById(R.id.askasteschar);
        cardview=view.findViewById(R.id.cardview);

        getConsultants(lang, token, ADVISOR_POSITION);

        askasteschar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AdvisoeDeailsBottomDialog advisoeDeailsBottomDialog = new AdvisoeDeailsBottomDialog();
                advisoeDeailsBottomDialog.show(getFragmentManager(), advisoeDeailsBottomDialog.getTag());

            }
        });

        cardview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new CategoriesdetailsFragment(), "HomeFragment").commit();


            }
        });

        profileimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        return view;

    }

    private void getConsultants(final String lang, final String token, final int ADVISOR_POSITION) {

        //showDialog();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.HOME, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject r = new JSONObject(response);
                    JSONArray jsonArray = r.getJSONArray("bestRating");

                   // for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject jsonObject = jsonArray.getJSONObject(ADVISOR_POSITION);
                            Log.e("WAFAA", jsonObject.toString());
                            String id = jsonObject.get("id").toString();
                            name = jsonObject.get("name").toString();
                            rating = jsonObject.get("rating").toString();
                            photo = jsonObject.get("photo").toString();
                            status = jsonObject.get("status").toString();
                            // if(status.matches(AppConstants.ACTIVE)) {

                            Picasso.with(getContext()).load(photo).into(profileimage);
                            profile_name.setText(name);
                            percent.setText(rating+"%");
//                            Toast.makeText(getContext(), ""+rating, Toast.LENGTH_SHORT).show();

                            // }
//                            JSONArray jsonArrayCategory = jsonObject.getJSONArray("category");
//                            String category = "";
//                            try {
//                                JSONObject jsonObject2 = jsonArrayCategory.getJSONObject(0);
//                                if (lang.equals("ar"))
//                                    category = jsonObject2.get("name_ar").toString();
//                                else category = jsonObject2.get("name_en").toString();
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }


                  //  }
            } catch (JSONException e) {
                e.printStackTrace();
            }

                //}
                Log.e("WAFAA", response.toString());


              //  hideDialog();


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                //hideDialog();
                //Toast.makeText(getContext(), getString(R.string.tryAgain), Toast.LENGTH_SHORT).show();
                Log.e("WAFAA", error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap();
                map.put("lang", lang);
                return map;

            }


            @Override
            public Map<String, String> getHeaders() {
                HashMap<String, String> headers = new HashMap<>();
                headers.put("Authorization", "Bearer" + "  " + token);
                headers.put("lang", lang);
                return headers;

            }

        };

        MyApplication.getInstance().addToRequestQueue(stringRequest);


    }


}
