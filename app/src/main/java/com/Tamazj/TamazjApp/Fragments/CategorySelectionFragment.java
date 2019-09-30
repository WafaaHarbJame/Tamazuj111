package com.Tamazj.TamazjApp.Fragments;


import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.Tamazj.TamazjApp.Adapter.Areas_Counseling_selection_adapter;
import com.Tamazj.TamazjApp.Api.MyApplication;
import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.Model.Areas_Counseling_Model;
import com.Tamazj.TamazjApp.R;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 */
public class CategorySelectionFragment extends Fragment {
    View view;
    private RecyclerView mAreasCounseling;
    LinearLayoutManager linearLayoutManager ;
    List<Areas_Counseling_Model> areas_counseling_models=new ArrayList<>();
    Areas_Counseling_selection_adapter areas_counseling_selection_adapter;
    ImageView blueBack;
    ImageButton buttonCancel;
    String token;
    String lang;




    public CategorySelectionFragment() {
        // Required empty public constructor
    }

    ProgressDialog progressDialog;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        view=inflater.inflate(R.layout.fragment_category_selection, container, false);
        mAreasCounseling = view.findViewById(R.id.categoriesrecycler);
        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
        if (sharedPreferences != null && sharedPreferences.getString(AppConstants.LANG_choose, Locale.getDefault().getLanguage()) != null && sharedPreferences.getString(AppConstants.token, "default  value") != null) {
            lang = sharedPreferences.getString(AppConstants.LANG_choose, Locale.getDefault().getLanguage());
            token = sharedPreferences.getString(AppConstants.token, "default value");

        } else {
            lang = Locale.getDefault().getLanguage();
        }

        getcategory(lang, token);
        linearLayoutManager = new LinearLayoutManager(getContext());
        mAreasCounseling.setLayoutManager(linearLayoutManager);
        mAreasCounseling.setHasFixedSize(true);
        areas_counseling_selection_adapter=new Areas_Counseling_selection_adapter(getContext(),areas_counseling_models);
        mAreasCounseling.setAdapter(areas_counseling_selection_adapter);
        buttonCancel=view.findViewById(R.id.buttonCancel);
        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new HomeFragment(), "HomeFragment").commit();


            }
        });


        return view;
    }

    private void getcategory(final String lang, final String token) {

        showDialog();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.CATEGORIES, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject r = new JSONObject(response);
                    JSONArray jsonArray = r.getJSONArray("data");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        try {
                            JSONObject jsonObject = jsonArray.getJSONObject(i);
                            String id = jsonObject.get("id").toString();
                            String category = "";
                            if (lang.equals("ar")) category = jsonObject.get("name_ar").toString();
                            else category = jsonObject.get("name_en").toString();
                            //Toast.makeText(getContext(), ""+ category, Toast.LENGTH_SHORT).show();
                            String image = jsonObject.get("image").toString();

                            areas_counseling_models.add(new Areas_Counseling_Model(image, category, id));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    areas_counseling_selection_adapter.notifyDataSetChanged();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.e("WAFAA", e.toString());
                    hideDialog();
                }


                //}
                Log.e("WAFAA", response.toString());


                hideDialog();


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                hideDialog();
                Toast.makeText(getContext(), getString(R.string.tryAgain), Toast.LENGTH_SHORT).show();
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

    public void showDialog() {
        progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage(getString(R.string.load_login));
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    public void hideDialog() {

        if (progressDialog.isShowing()) progressDialog.dismiss();
    }



}
