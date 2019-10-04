package com.Tamazj.TamazjApp.Fragments;

import android.app.ProgressDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.Tamazj.TamazjApp.Activity.UserprofileActivity;
import com.Tamazj.TamazjApp.Adapter.Areas_Counseling_adapter;
import com.Tamazj.TamazjApp.Adapter.CustomViewPagerAdapter;
import com.Tamazj.TamazjApp.Adapter.Distinguished_Advisors_Adapter;
import com.Tamazj.TamazjApp.Api.MyApplication;
import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.Model.Areas_Counseling_Model;
import com.Tamazj.TamazjApp.Model.Distinguished_Advisors_Model;
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

public class HomeFragment extends Fragment {
    View view;
    private CardView mCardview;
    private TextView mPercent;
    private ImageView mProfileimage;
    private TextView mProfileName;
    private TextView mProfileDsc;
    private ImageView mAskasteschar;
    private ImageView mImageView;
    private TextView mTextView;
    String lang;
    ImageView personalprofile;
    private RecyclerView mAreasCounseling;
    private TextView mTextView2;
    String token;
    private RecyclerView mDistinguishedAdvisors;
    LinearLayoutManager mDistinguishedAdvisorsmanager ;
    LinearLayoutManager mAreasCounselingmanager ;
    List<Areas_Counseling_Model> areas_counseling_models=new ArrayList<>();
    Areas_Counseling_adapter areas_counseling_adapter;
    ProgressDialog progressDialog;
    private ImageView consulta_back;

    List<Distinguished_Advisors_Model> distinguished_advisors_models=new ArrayList<>();
    Distinguished_Advisors_Adapter distinguished_advisors_adapter;
    private static final long SLIDER_TIMER = 2000; // change slider interval
    private int currentPage = 0; // this will tell us the current page available on the view pager
    // please see ViewPager Listener on the onPageSelected method to see how we are updating
    // currentPage variable
    private boolean isCountDownTimerActive = false; // let the timer start if and only if it has completed previous task
    private Handler handler;
    private ViewPager viewPager;
    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if (!isCountDownTimerActive) {
                automateSlider();
            }
            handler.postDelayed(runnable, 1000);
            // our runnable should keep running for every 1000 milliseconds (1 seconds)
        }
    };
    private ImageView advisor_back;

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);
        initView();
        handler = new Handler();
        handler.postDelayed(runnable, 1000);
        runnable.run();
        viewPager = view.findViewById(R.id.view_pager_slider);
        progressDialog = new ProgressDialog(getContext());

        CustomViewPagerAdapter viewPagerAdapter = new CustomViewPagerAdapter(getActivity().getSupportFragmentManager());
        viewPager.setAdapter(viewPagerAdapter);
        // now it's time to think about our sliders
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }
            @Override
            public void onPageSelected(int position) {
//                if (position == 0) {
//                    currentPage = 0;
//                } else if (position == 1) {
//                    currentPage = 1;
//                } else {
//                    currentPage = 2;
//                }
                currentPage = position;
            }
            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });


        SharedPreferences sharedPreferences = getActivity().getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
        if (sharedPreferences != null && sharedPreferences.getString(AppConstants.LANG_choose, Locale.getDefault().getLanguage()) != null && sharedPreferences.getString(AppConstants.token, "default  value") != null) {
            lang = sharedPreferences.getString(AppConstants.LANG_choose, Locale.getDefault().getLanguage());
            token = sharedPreferences.getString(AppConstants.token, "default value");

        } else {
            lang = Locale.getDefault().getLanguage();
        }

        mDistinguishedAdvisorsmanager = new LinearLayoutManager(getContext());
        mDistinguishedAdvisorsmanager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mDistinguishedAdvisors.setLayoutManager(mDistinguishedAdvisorsmanager);
        mDistinguishedAdvisors.setHasFixedSize(true);
        mAreasCounselingmanager = new LinearLayoutManager(getContext());
        mAreasCounselingmanager.setOrientation(LinearLayoutManager.HORIZONTAL);
        mAreasCounseling.setLayoutManager(mAreasCounselingmanager);
        mAreasCounseling.setHasFixedSize(true);
        getConsultants(lang, token);
        getcategory(lang, token);


        areas_counseling_adapter=new Areas_Counseling_adapter(getContext(),areas_counseling_models);
        mAreasCounseling.setAdapter(areas_counseling_adapter);
        distinguished_advisors_adapter=new Distinguished_Advisors_Adapter(getContext(),distinguished_advisors_models);
        mDistinguishedAdvisors.setAdapter(distinguished_advisors_adapter);
        mAreasCounseling.setAdapter(areas_counseling_adapter);
        personalprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(getActivity(), UserprofileActivity.class);
                getActivity().startActivity(intent);
            }
        });






        return view;
    }

    private void automateSlider() {
        isCountDownTimerActive = true;
        new CountDownTimer(SLIDER_TIMER, 2000) {
            @Override
            public void onTick(long millisUntilFinished) {
            }

            @Override
            public void onFinish() {
                int nextSlider = currentPage + 1;

                if (nextSlider == 9) {
                    nextSlider = 0; // if it's last Image, let it go to the first image
                }
                viewPager.setCurrentItem(nextSlider);
                isCountDownTimerActive = false;
            }
        }.start();
    }

    @Override
    public void onStop() {
        super.onStop();
        handler.removeCallbacks(runnable);
    }

    private void initView() {
        mCardview = view.findViewById(R.id.cardview);
        mPercent = view.findViewById(R.id.percent);
        mProfileimage = view.findViewById(R.id.profileimage);
        mProfileName = view.findViewById(R.id.profile_name);
        mProfileDsc = view.findViewById(R.id.profile_dsc);
        mAskasteschar = view.findViewById(R.id.askasteschar);
        mImageView = view.findViewById(R.id.imageView);
        mTextView = view.findViewById(R.id.textView);
        advisor_back = view.findViewById(R.id.advisor_back);
        mAreasCounseling = view.findViewById(R.id.Areas_Counseling);
        mTextView2 = view.findViewById(R.id.textView2);
        consulta_back = view.findViewById(R.id.consulta_back);
        mDistinguishedAdvisors = view.findViewById(R.id.Distinguished_Advisors);
        personalprofile=view.findViewById(R.id.personalprofile);
        consulta_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new CategoriesFragment(), "HomeFragment").commit();


            }
        });
        advisor_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new MyConsultationragment(), "HomeFragment").commit();


            }
        });



    }

    private void getConsultants(final String lang, final String token) {

        showDialog();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.HOME, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject r = new JSONObject(response);
                    JSONArray jsonArray = r.getJSONArray("bestConsultant");
                    for (int i = 0; i < jsonArray.length(); i++) {
                        try {
                            JSONObject jsonObject = jsonArray.getJSONObject(i);
                            String id = jsonObject.get("id").toString();
                            String name = jsonObject.get("name").toString();
                            String photo = jsonObject.get("photo").toString();
                            String status = jsonObject.get("status").toString();
                            JSONArray jsonArrayCategory = jsonObject.getJSONArray("category");
                            String category = "";
                            try {
                                JSONObject jsonObject2 = jsonArrayCategory.getJSONObject(0);
                                if (lang.equals("ar"))
                                    category = jsonObject2.get("name_ar").toString();
                                else category = jsonObject2.get("name_en").toString();
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                            //  }

                            distinguished_advisors_models.add(new Distinguished_Advisors_Model(photo, name, category, id));

                           /* if(status.matches(AppConstants.ACTIVE)) {
                                distinguished_advisors_models.add(new Distinguished_Advisors_Model(photo, name, category, id));
                            }*/
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                    distinguished_advisors_adapter.notifyDataSetChanged();


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

    private void getcategory(final String lang, final String token) {

        // showDialog();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.HOME, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject r = new JSONObject(response);
                    JSONArray jsonArray = r.getJSONArray("category");
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
                    areas_counseling_adapter.notifyDataSetChanged();
                } catch (JSONException e) {
                    e.printStackTrace();
                    Log.e("WAFAA", e.toString());
                }

                Log.e("WAFAA", response.toString());


                // hideDialog();


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