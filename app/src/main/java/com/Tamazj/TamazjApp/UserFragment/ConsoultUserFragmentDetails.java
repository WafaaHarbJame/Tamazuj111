package com.Tamazj.TamazjApp.UserFragment;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import com.Tamazj.TamazjApp.Api.MyApplication;
import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.Model.Consults;
import com.Tamazj.TamazjApp.R;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import static android.content.Context.MODE_PRIVATE;


public class ConsoultUserFragmentDetails extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    View view;
    String choosing_langauge;
    SharedPreferences sharedPreferences;
    ProgressDialog progressDialog;
    String token;
    String fcm_token;
    String Consultation_ID;
    private ImageView mFilter;
    private ImageView mAstesharticontoolbar;
    private TextView mToolbartiltle;
    private ImageView mBlueBack;
    private LinearLayout mLinaree;
    private Toolbar mToolbar;
    private ImageView mConsultImage;
    private TextView mTvConsultName;
    private TextView mTvConsultType;
    private TextView mTvConsultTime;
    private TextView mTvConsultStatus;
    private TextView mMeansOfCommunication;
    private TextView mTvmeansOfCommunication;
    private TextView mSummaryProblem;
    private TextView mTvsummaryProblem;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_consoult_user_fragment_details, container, false);

        mFilter = view.findViewById(R.id.filter);
        mAstesharticontoolbar = view.findViewById(R.id.astesharticontoolbar);
        mToolbartiltle = view.findViewById(R.id.toolbartiltle);
        mBlueBack = view.findViewById(R.id.blueBack);
        mLinaree = view.findViewById(R.id.linaree);
        mToolbar = view.findViewById(R.id.toolbar);
        mConsultImage = view.findViewById(R.id.consultImage);
        mTvConsultName = view.findViewById(R.id.tvConsultName);
        mTvConsultType = view.findViewById(R.id.tvConsultType);
        mTvConsultTime = view.findViewById(R.id.tvConsultTime);
        mTvConsultStatus = view.findViewById(R.id.tvConsultStatus);
        mMeansOfCommunication = view.findViewById(R.id.means_of_communication);
        mTvmeansOfCommunication = view.findViewById(R.id.tvmeans_of_communication);
        mSummaryProblem = view.findViewById(R.id.summary_problem);
        mTvsummaryProblem = view.findViewById(R.id.tvsummary_problem);
        progressDialog = new ProgressDialog(getActivity());


        mBlueBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new ConsoultUserFragment(), "HomeFragment").commit();
            }
        });
        sharedPreferences = getActivity().getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
        if (sharedPreferences != null) {
            token = sharedPreferences.getString(AppConstants.token, "default value");
            fcm_token = sharedPreferences.getString(AppConstants.FCM_TOKEN, "default value");
            choosing_langauge = sharedPreferences.getString(AppConstants.LANG_choose, Locale.getDefault().getLanguage());
        }

        ConnectivityManager conMgr = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = conMgr.getActiveNetworkInfo();

        if (networkInfo != null && networkInfo.isConnected()) {

            final Bundle bundle = getArguments();
            if (bundle != null && bundle.getString(AppConstants.Consultation_ID) != null) {
                Consultation_ID = bundle.getString(AppConstants.Consultation_ID);
                //Toast.makeText(getContext(), ""+ADVISOR_ID, Toast.LENGTH_SHORT).show();
                getUserConsultationDetails(Consultation_ID, choosing_langauge, token);

            } else {
                Toast.makeText(getContext(), "" + getString(R.string.tryAgain), Toast.LENGTH_SHORT).show();
            }


        } else {
            Toast.makeText(getActivity(), "" + getString(R.string.no_internet), Toast.LENGTH_SHORT).show();
        }
        return view;

    }

    public void getUserConsultationDetails(String ID, final String lang, final String token) {
        showDialog();


        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.user_consultation_details + ID, new Response.Listener<String>() {
            @SuppressLint("WrongConstant")
            @Override
            public void onResponse(String response) {

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONObject data = jsonObject.getJSONObject("data");

                    Log.e("response", response);
                    String arabic_catogoryname = "", english_catogoryname = "", catogoryname = "";
                    int id = data.getInt("id");
                    String status = data.getString("status");
                    String means_of_communication = data.getString("means_of_communication");
                    String summary_problem = data.getString("summary_problem");
                    JSONObject session = data.getJSONObject("session_time");
                    String time = session.getString("time");
                    JSONObject catogory = data.getJSONObject("category_id");
                    JSONObject consultant_data = data.getJSONObject("consultant_id");
                    JSONObject sup_category_data = data.getJSONObject("sub_category_id");
                    if (sup_category_data != null) {
                        if (lang.equals("ar")) {
                            arabic_catogoryname = sup_category_data.getString("name_ar");
                            catogoryname = sup_category_data.getString("name_ar");
                            ;

                        } else {
                            english_catogoryname = sup_category_data.getString("name_en");
                            catogoryname = sup_category_data.getString("name_en");
                        }


                    } else {
                        if (lang.equals("ar")) {
                            arabic_catogoryname = catogory.getString("name_ar");
                            catogoryname = catogory.getString("name_ar");
                            ;

                        } else {
                            english_catogoryname = catogory.getString("name_en");
                            catogoryname = catogory.getString("name_en");
                        }

                    }

                    String photo = consultant_data.getString("photo");
                    String consultant_name = consultant_data.getString("name");

                    mTvmeansOfCommunication.setText(means_of_communication);
                    mTvConsultName.setText(consultant_name);
                    mTvsummaryProblem.setText(summary_problem);
                    mTvConsultTime.setText(time);
                    mTvConsultStatus.setText(status);
                    mTvConsultType.setText(catogoryname);
                    Picasso.with(getContext()).
                            load(photo).
                            error(R.drawable.image).resize(90, 100).into(mConsultImage);
                    Log.e("photo", "" + photo);
                    int consultant_id = consultant_data.getInt("id");
                    if (lang.equals("ar")) {
                        arabic_catogoryname = catogory.getString("name_ar");
                    } else {
                        english_catogoryname = catogory.getString("name_en");
                    }

                    Consults.DataBean consults = new Consults.DataBean();
                    Consults.DataBean.SessionTimeBean sessionTimeBean = new Consults.DataBean.SessionTimeBean();
                    Consults.DataBean.ConsultantIdBean consultantIdBean = new Consults.DataBean.ConsultantIdBean();
                    Consults.DataBean.CategoryIdBean categoryIdBean = new Consults.DataBean.CategoryIdBean();
                    categoryIdBean.setName_ar(arabic_catogoryname);
                    categoryIdBean.setName_en(english_catogoryname);
                    consultantIdBean.setName(consultant_name);
                    consultantIdBean.setPhoto(photo);
                    sessionTimeBean.setTime(time);
                    consults.setStatus(status);
                    consults.setSession_time(sessionTimeBean);
                    consults.setCategory_id(categoryIdBean);
                    consults.setId(id);
                    consults.setConsultant_id(consultantIdBean);


                    hideDialog();


                } catch (JSONException e1) {
                    e1.printStackTrace();
                    hideDialog();

                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                hideDialog();


            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<>();
                headers.put("Authorization", "Bearer" + "  " + token);
                headers.put("lang", lang);
                return headers;
            }


            @Override
            public Map<String, String> getHeaders() {
                HashMap<String, String> headers = new HashMap<>();
                headers.put("Authorization", "Bearer" + "  " + token);
                headers.put("lang", lang);
                return headers;

            }

            ;
        };

        MyApplication.getInstance().addToRequestQueue(stringRequest);

    }


    public void showDialog() {
        progressDialog = new ProgressDialog(getActivity());
        progressDialog.setMessage(getString(R.string.load_data));
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    public void hideDialog() {

        if (progressDialog.isShowing()) progressDialog.dismiss();
    }


}