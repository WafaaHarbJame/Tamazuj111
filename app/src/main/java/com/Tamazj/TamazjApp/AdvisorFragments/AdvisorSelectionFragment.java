package com.Tamazj.TamazjApp.AdvisorFragments;


import android.app.ProgressDialog;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.Tamazj.TamazjApp.Adapter.CategoriesAdapter;
import com.Tamazj.TamazjApp.Adapter.CategoriesAdapterwithouttype;
import com.Tamazj.TamazjApp.Adapter.SupCategoriesAdapter;
import com.Tamazj.TamazjApp.Api.MyApplication;
import com.Tamazj.TamazjApp.Fragments.HomeFragment;
import com.Tamazj.TamazjApp.Model.AdvisoeDeailsBottomDialog;
import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.Model.Areas_Counseling_Model;
import com.Tamazj.TamazjApp.Model.Categories;
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
public class AdvisorSelectionFragment extends Fragment {
    View view;
    private RecyclerView categoriesrecycler;
    LinearLayoutManager linearLayout ;
    List<Categories> categories=new ArrayList<>();
    CategoriesAdapterwithouttype categoriesAdapterwithouttype;
    ImageButton buttonsearch;
    ImageButton buttonCancel;
    String lang, token;



    public AdvisorSelectionFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
         view= inflater.inflate(R.layout.fragment_advisor_selection, container, false);
        categoriesrecycler = view.findViewById(R.id.categoriesrecycler);
        linearLayout = new LinearLayoutManager(getContext());
        categoriesrecycler.setLayoutManager(linearLayout);
        categoriesrecycler.setHasFixedSize(true);
        buttonCancel=view.findViewById(R.id.buttonCancel);
        buttonsearch=view.findViewById(R.id.buttonsearch);

        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
        if(sharedPreferences != null && sharedPreferences.getString(AppConstants.LANG_choose, Locale.getDefault().getLanguage()) != null){
            lang = sharedPreferences.getString(AppConstants.LANG_choose,Locale.getDefault().getLanguage());
        } else {
            lang = Locale.getDefault().getLanguage();
        }

        if(sharedPreferences != null && sharedPreferences.getString(AppConstants.token, Locale.getDefault().getLanguage()) != null){
            token = sharedPreferences.getString(AppConstants.token,Locale.getDefault().getLanguage());
        }


        buttonCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new HomeFragment(), "HomeFragment").commit();


            }
        });

        Bundle bundle = getArguments();
        if(bundle != null && bundle.getString(AppConstants.CATEGORY_ID) != null){
            fillList(bundle.getString(AppConstants.CATEGORY_ID));

        }

//        categories.add(new Categories(getResources().getString(R.string._84_percent_of)," https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file ",getResources().getString(R.string.abu_dall_mohammed_omar),getResources().getString(R.string.educational_consultant_holding_an_international_certificate_in_education),getResources().getString(R.string.consultType)));
//        categories.add(new Categories(getResources().getString(R.string._84_percent_of)," https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file ",getResources().getString(R.string.abu_dall_mohammed_omar),getResources().getString(R.string.educational_consultant_holding_an_international_certificate_in_education),getResources().getString(R.string.consultType)));
//        categories.add(new Categories(getResources().getString(R.string._84_percent_of)," https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file ",getResources().getString(R.string.abu_dall_mohammed_omar),getResources().getString(R.string.educational_consultant_holding_an_international_certificate_in_education),getResources().getString(R.string.consultType)));
//        categories.add(new Categories(getResources().getString(R.string._84_percent_of)," https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file ",getResources().getString(R.string.abu_dall_mohammed_omar),getResources().getString(R.string.educational_consultant_holding_an_international_certificate_in_education),getResources().getString(R.string.consultType)));
//        categories.add(new Categories(getResources().getString(R.string._84_percent_of)," https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file ",getResources().getString(R.string.abu_dall_mohammed_omar),getResources().getString(R.string.educational_consultant_holding_an_international_certificate_in_education),getResources().getString(R.string.consultType)));
//        categories.add(new Categories(getResources().getString(R.string._84_percent_of)," https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file ",getResources().getString(R.string.abu_dall_mohammed_omar),getResources().getString(R.string.educational_consultant_holding_an_international_certificate_in_education),getResources().getString(R.string.consultType)));
//        categories.add(new Categories(getResources().getString(R.string._84_percent_of)," https://www.mediafire.com/view/yyfa6yue2aaqkhs/asteshartosari.png/file ",getResources().getString(R.string.abu_dall_mohammed_omar),getResources().getString(R.string.educational_consultant_holding_an_international_certificate_in_education),getResources().getString(R.string.consultType)));
//
        categoriesAdapterwithouttype=new CategoriesAdapterwithouttype(getContext(),categories);
        categoriesrecycler.setAdapter(categoriesAdapterwithouttype);


        return view;
    }

    //----------------------------------------------------------------------------------------------

    private void fillList(String ID) {

        showDialog();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.CATEGORY+ID, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject r = new JSONObject(response);
                    JSONObject jsonObject = r.getJSONObject("data");
// for(int i=0;i<jsonArray.length();i++){
                    try {
                        //JSONObject jsonObject =  jsonArray.getJSONObject(i);
                        String id =jsonObject.get("id").toString();
                        String category = "";
                        if(lang.equals("ar"))
                            category =jsonObject.get("name_ar").toString();
                        else category =jsonObject.get("name_en").toString();
                        String image = jsonObject.get("image").toString();

                        JSONArray jsonArraySubCategory = jsonObject.getJSONArray("sup_category");
                    }  catch (JSONException e) {
                                    e.printStackTrace();
                                }
//                                            for(int j=0;j<jsonArraySubCategory.length();j++) {
//                                                try {
//                                                    JSONObject jsonObject2 = jsonArraySubCategory.getJSONObject(j);
//                                                    String subId = jsonObject2.get("id").toString();
//                                                    String subcategory;
//                                                    if (lang.equals("ar"))
//                                                        subcategory = jsonObject2.get("name_ar").toString();
//                                                    else
//                                                        subcategory = jsonObject2.get("name_en").toString();
                            //Toast.makeText(getContext(), ""+ subcategory, Toast.LENGTH_SHORT).show();
                            //String subImage = jsonObject2.get("image").toString();
                            JSONArray jsonArrayAdvisor = jsonObject.getJSONArray("consultant");
                            Log.e("kh", jsonArrayAdvisor.toString());

                            for (int k = 0; k < jsonArrayAdvisor.length(); k++) {
                                try {
                                    JSONObject jsonObjectAdvisor = jsonArrayAdvisor.getJSONObject(k);
                                    Log.e("kh", jsonArrayAdvisor.toString());
                                    String AdId = jsonObjectAdvisor.get("id").toString();
                                    //Toast.makeText(getContext(), ""+ AdId, Toast.LENGTH_SHORT).show();
                                    String AdName = jsonObjectAdvisor.get("name").toString();
                                    String Adcategory;
                                    JSONArray jsonArrayCategory = jsonObjectAdvisor.getJSONArray("category");
                                    JSONObject jsonObjectCategory = jsonArrayCategory.getJSONObject(0);

                                    String id =jsonObjectCategory.get("id").toString();
                                    if (lang.equals("ar"))
                                        Adcategory = jsonObjectCategory.get("name_ar").toString();
                                    else
                                        Adcategory = jsonObjectCategory.get("name_en").toString();
                                    //Toast.makeText(getContext(), ""+ category, Toast.LENGTH_SHORT).show();
                                    String AdPhoto = jsonObjectAdvisor.get("photo").toString();
                                    String rating = jsonObjectAdvisor.get("rating").toString()+"%";
                                    String status = jsonObjectAdvisor.get("status").toString();
                                    String biography = jsonObjectAdvisor.get("biography").toString();
                                    if (biography.matches("") || biography.equals(null)) {
                                        biography = "";
                                    }


                                    // Toast.makeText(getContext(), ""+status, Toast.LENGTH_SHORT).show();
                                    if (status.equals(AppConstants.ACTIVE)) {
                                        categories.add(new Categories(rating, AdPhoto, AdName, biography, Adcategory, AdId, id));
                                        Log.e("kh", categories.toString());
                                    }


                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }


                    categoriesAdapterwithouttype.setIClickListener(new CategoriesAdapterwithouttype.IClickListener() {
                                @Override
                                public void onItemClick(int position, List<Categories> areas_counseling_models) {
                                    AdvisoeDeailsBottomDialog advisoeDeailsBottomDialog = new AdvisoeDeailsBottomDialog();
                                    Bundle bundle = new Bundle();
                                    bundle.putString(AppConstants.ADVISOR_ID, categories.get(position).getId());
                                    bundle.putString(AppConstants.CATEGORY_ID, categories.get(position).getCategoryId());
                                    bundle.putString(AppConstants.CATEGORY_TYPE, categories.get(position).getCatoroytype());
                                    advisoeDeailsBottomDialog.setArguments(bundle);
                                    advisoeDeailsBottomDialog.show(getFragmentManager(), advisoeDeailsBottomDialog.getTag());

                                }
                            });
                            categoriesrecycler.setAdapter(categoriesAdapterwithouttype);
//                                                } catch (JSONException e) {
//                                                    e.printStackTrace();
//                                                }
//                                            }


                        //areas_counseling_models.add(new Areas_Counseling_Model(image, category, id));
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    // }
                    //categoriesAdapter.notifyDataSetChanged();

//                    for (int j = 0; j < consultants.size(); j++) {
//                        String name = consultants.get(0).getData().get(j).getName();
//                        String photo = consultants.get(0).getData().get(j).getPhoto();
//                        distinguished_advisors_models.add(new Distinguished_Advisors_Model(photo, name, "استشارات  أسرية "));
//
//
//                    }




                //}
                // Log.e("WAFAA", response.toString());


                hideDialog();


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                hideDialog();
                Toast.makeText(getContext(), getString(R.string.tryAgain), Toast.LENGTH_SHORT).show();
                // Log.e("WAFAA", error.toString());
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
