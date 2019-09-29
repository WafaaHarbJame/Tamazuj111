package com.Tamazj.TamazjApp.Fragments;


import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.Tamazj.TamazjApp.Activity.UserprofileActivity;
import com.Tamazj.TamazjApp.Adapter.Areas_Counseling_adapter;
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
public class CategoriesFragment extends Fragment {
    View view;
    private RecyclerView mAreasCounseling;
    GridLayoutManager mAreasCounselingmanager ;
    List<Areas_Counseling_Model> areas_counseling_models=new ArrayList<>();
    Areas_Counseling_adapter areas_counseling_adapter;
    ImageView personalprofile;
    String lang;



    public CategoriesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
                view=inflater.inflate(R.layout.fragment_categories, container, false);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
        if(sharedPreferences != null && sharedPreferences.getString(AppConstants.LANG_choose, Locale.getDefault().getLanguage()) != null){
            lang = sharedPreferences.getString(AppConstants.LANG_choose,Locale.getDefault().getLanguage());
        } else {
            lang = Locale.getDefault().getLanguage();
        }


        mAreasCounseling = view.findViewById(R.id.Areas_Counseling);

        mAreasCounselingmanager = new GridLayoutManager(getContext(),3);
        mAreasCounseling.setLayoutManager(mAreasCounselingmanager);
        mAreasCounseling.setHasFixedSize(true);

        fillList();

//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","استشارات أسرية "));
//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","استشارات نفسية "));
//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","السمو بالنفس "));
//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","استشارات أسرية "));
//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","استشارات نفسية "));
//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","السمو بالنفس "));
//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","استشارات أسرية "));
//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","استشارات نفسية "));
//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","السمو بالنفس "));
//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","استشارات أسرية "));
//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","استشارات نفسية "));
//        areas_counseling_models.add(new Areas_Counseling_Model("https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file","السمو بالنفس "));
//
        areas_counseling_adapter=new Areas_Counseling_adapter(getContext(),areas_counseling_models);
        mAreasCounseling.setAdapter(areas_counseling_adapter);

        personalprofile=view.findViewById(R.id.personalprofile);
        personalprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), UserprofileActivity.class);
                getActivity().startActivity(intent);
            }
        });
        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mAreasCounseling = view.findViewById(R.id.Areas_Counseling);
    }

    //----------------------------------------------------------------------------------------------

    private void fillList() {

        showDialog();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.CATEGORIES, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject r = new JSONObject(response);
                    JSONArray jsonArray = r.getJSONArray("data");
                    for(int i=0;i<jsonArray.length();i++){
                        try {
                            JSONObject jsonObject =  jsonArray.getJSONObject(i);
                            String id =jsonObject.get("id").toString();
                            String category = "";
                            if(lang.equals("ar"))
                                category =jsonObject.get("name_ar").toString();
                            else category =jsonObject.get("name_en").toString();
                            //Toast.makeText(getContext(), ""+ category, Toast.LENGTH_SHORT).show();
                            String image = jsonObject.get("image").toString();

//                            JSONArray jsonArraySubCategory = jsonObject.getJSONArray("sup_category");
//                            for(int j=0;j<jsonArraySubCategory.length();j++){
//                            try {
//                                JSONObject jsonObject2 =  jsonArraySubCategory.getJSONObject(j);
//                                String subcategory;
//                                if(lang.equals("ar"))
//                                    subcategory =jsonObject2.get("name_ar").toString();
//                                else subcategory =jsonObject2.get("name_en").toString();
//                                Toast.makeText(getContext(), ""+ category, Toast.LENGTH_SHORT).show();
//                                String subImage = jsonObject.get("image").toString();
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//                              }
                            areas_counseling_models.add(new Areas_Counseling_Model(image, category, id));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    areas_counseling_adapter.notifyDataSetChanged();

//                    for (int j = 0; j < consultants.size(); j++) {
//                        String name = consultants.get(0).getData().get(j).getName();
//                        String photo = consultants.get(0).getData().get(j).getPhoto();
//                        distinguished_advisors_models.add(new Distinguished_Advisors_Model(photo, name, "استشارات  أسرية "));
//
//
//                    }
                }catch (JSONException e) {
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
        };

        MyApplication.getInstance().addToRequestQueue(stringRequest);



    }

    //----------------------------------------------------------------------------------------------

    ProgressDialog progressDialog;

    public void showDialog() {
        progressDialog = new ProgressDialog(getContext());
        progressDialog.setMessage(getString(R.string.load_login));
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    public void hideDialog() {

        if (progressDialog.isShowing()) progressDialog.dismiss();
    }

    //----------------------------------------------------------------------------------------------


}
