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
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.Tamazj.TamazjApp.Adapter.ConsultUserAdapter;
import com.Tamazj.TamazjApp.Api.MyApplication;
import com.Tamazj.TamazjApp.Fragments.HomeFragment;
import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.Model.Consults;
import com.Tamazj.TamazjApp.R;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
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
public class ConsoultUserFragment extends Fragment {

    View view;
    ImageButton blueBack;
    RecyclerView recyclerView;
    List<Consults.DataBean> consultApplications;
    ConsultUserAdapter adapter;
    String choosing_langauge;
    SharedPreferences sharedPreferences;
    ProgressDialog progressDialog;
    String token;
    String fcm_token;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_consoult_advisor, container, false);
        blueBack = view.findViewById(R.id.blueBack);

        blueBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainContainer, new HomeFragment(), "HomeFragment").commit();
            }
        });


        sharedPreferences = getActivity().getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
        token = sharedPreferences.getString(AppConstants.token, "default value");
        fcm_token = sharedPreferences.getString(AppConstants.FCM_TOKEN, "default value");
        choosing_langauge = sharedPreferences.getString(AppConstants.LANG_choose, "");


        progressDialog = new ProgressDialog(getActivity());

        if (sharedPreferences != null) {
            token = sharedPreferences.getString(AppConstants.token, "default value");
            fcm_token = sharedPreferences.getString(AppConstants.FCM_TOKEN, "default value");
            choosing_langauge = sharedPreferences.getString(AppConstants.LANG_choose, "");
            recyclerView = view.findViewById(R.id.rvAdvisorConsult);
            @SuppressLint("WrongConstant") RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(layoutManager);

            consultApplications = new ArrayList<>();

            adapter = new ConsultUserAdapter(getContext(), consultApplications);



            ConnectivityManager conMgr = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = conMgr.getActiveNetworkInfo();

            if (networkInfo != null && networkInfo.isConnected()) {

                if (sharedPreferences != null) {
                    if (sharedPreferences.getString(AppConstants.LANG_choose, Locale.getDefault().getLanguage()) != null) {
                        choosing_langauge = sharedPreferences.getString(AppConstants.LANG_choose, "");

                        //  getUserConsultation(choosing_langauge, "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6ImM2OTMxZDNkM2U3ZTViYzEwZDg0NDhmNDBlODQ3NTBmYWRmNGI5MTNmODA5NGQ2NmM1ZjhlMDAwYjdmYzgxM2MwODNmZDdjNGRhMjk4MzczIn0.eyJhdWQiOiIxIiwianRpIjoiYzY5MzFkM2QzZTdlNWJjMTBkODQ0OGY0MGU4NDc1MGZhZGY0YjkxM2Y4MDk0ZDY2YzVmOGUwMDBiN2ZjODEzYzA4M2ZkN2M0ZGEyOTgzNzMiLCJpYXQiOjE1Njc5OTE0NDcsIm5iZiI6MTU2Nzk5MTQ0NywiZXhwIjoxNTk5NjEzODQ3LCJzdWIiOiIyIiwic2NvcGVzIjpbXX0.Tfw3ex_BnGdr26Vr4U9X2jcsBa2kKddf8xf-Go0kALnQn1PJpqJuXoxou9WjRtODtRUDvwPoW3U4vn0EpTzZVU6udBxi9J7MaiDqKL3QTlt1OHLoby9T8pSoHMl0PMTlfg28mSthoAf8O0jijaO4Nb1_btKzcTS5-dro2g_jATTmw_RuVQGsG1nXgHvUm6H3hlQyA8WNA17OraOUzOk8oadTXDcT5X7aO5avk8skxLH_rA9-4FfgyzVY_HGSxFmbva3LJ0KCVkXWt9IbkdssBd2L3f0kkc8UkuC3tL5SioG_IjaO1lkmdL6bR_LdD9gELe1V9u1aJR6wab3LjrEh1zcXVaiJfEUVwJuMNs3PQ6-BaUVbcKQTo98MtrgmnoUGNCkBcFqINPIBxiVo3EfK_pajuHpQx6X83Gp4XakXqG6lu4hyPRWyEUvJXeJPM6t3ElAs6jffbnOz9p3sD53NtCpbKeC4v7LVcwxfGTYY4cjei0ShJyhsxPT05Lx6JZ564Rm4QTRsMaSwr262y1X6pe0vMGBk4TcA5FZ5IbbzD3-pmxE9H-INiLf2kpMX93WH6cd1vei16mvjcO8IGyR3bI2_omKPHmRD3qxAYxavMlpStVR7UAA35zBuS5eVqIJne4xP6f0Ekl9q9doIhBhz9LgmuCJ1_jyoXOgZsYSgDbU");
                        getUserConsultation(choosing_langauge, token);

                    }

                }


            } else {
                Toast.makeText(getActivity(), "" + getString(R.string.no_internet), Toast.LENGTH_SHORT).show();
            }




        }

        return view;

    }


    public void getUserConsulatant(final String lang, final String access_token) {
        showDialog();


        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, AppConstants.user_consultation, null, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {


                Log.e("WAFAAUPDATE", String.valueOf(response));

                try {

                    JSONArray jsonArray = response.getJSONArray("data");
                    Log.e("WAFAAUPDATE", String.valueOf(response));

                    for (int i = 0; i < jsonArray.length(); i++) {
                        Toast.makeText(getContext(), "" + jsonArray.getJSONObject(i).getString("id"), Toast.LENGTH_SHORT).show();


                    }

                    hideDialog();


                } catch (JSONException e) {
                    e.printStackTrace();
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
                HashMap<String, String> map = new HashMap<>();
                map.put("Authorization", "Bearer" + "   " + access_token);


                return map;

            }

            @Override
            public Map<String, String> getHeaders() {
                HashMap<String, String> headers = new HashMap<>();
                headers.put("Authorization", "Bearer" + "  " + access_token);
                return headers;
            }

        };
        MyApplication.getInstance().addToRequestQueue(jsonObjectRequest);
    }



    public void getUserConsultation(final String lang, final String token) {
        showDialog();


        StringRequest stringRequest = new StringRequest(Request.Method.GET, AppConstants.user_consultation, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("data");
                    //Log.e("response", response);

                    for (int i = 0; i < jsonArray.length(); i++) {
                        String arabic_catogoryname = "", english_catogoryname = "";

                        int id = jsonArray.getJSONObject(i).getInt("id");
                        String status = jsonArray.getJSONObject(i).getString("status");
                        Toast.makeText(getActivity(), "" + status, Toast.LENGTH_SHORT).show();
                        JSONObject session = jsonArray.getJSONObject(i).getJSONObject("session_time");
                        String time = session.getString("time");
                        JSONObject catogory = jsonArray.getJSONObject(i).getJSONObject("category_id");
                        JSONObject consultant_data = jsonArray.getJSONObject(i).getJSONObject("consultant_id");
                        String consultant_name = consultant_data.getString("name");
                        String photo = consultant_data.getString("photo");
                        int consultant_id = consultant_data.getInt("id");
                        if (lang.equals("ar")) {
                            arabic_catogoryname = catogory.getString("name_ar");
                        } else {
                            english_catogoryname = jsonObject.get("name_en").toString();
                        }

                        Consults.DataBean consults = new Consults.DataBean();
                        Consults.DataBean.SessionTimeBean sessionTimeBean = new Consults.DataBean.SessionTimeBean();
                        Consults.DataBean.ConsultantIdBean consultantIdBean = new Consults.DataBean.ConsultantIdBean();
                        Consults.DataBean.CategoryIdBean categoryIdBean = new Consults.DataBean.CategoryIdBean();
                        categoryIdBean.setName_ar(arabic_catogoryname);
                        categoryIdBean.setName_en(english_catogoryname);

                        consultantIdBean.setName(consultant_name);
                        sessionTimeBean.setTime(time);
                        consults.setStatus(status);
                        consults.setSession_time(sessionTimeBean);
                        consults.setId(id);
                        consults.setConsultant_id(consultantIdBean);
                        consultApplications.add(consults);

                    }

                    recyclerView.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                    adapter.notifyDataSetChanged();



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
