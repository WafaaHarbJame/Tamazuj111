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

import com.Tamazj.TamazjApp.Adapter.ConsultAdapter;
import com.Tamazj.TamazjApp.Api.MyApplication;
import com.Tamazj.TamazjApp.Fragments.HomeFragment;
import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.Model.Consult;
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
import java.util.Map;

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConsoultUserFragment extends Fragment {

    View view;
    ImageButton blueBack;
    RecyclerView recyclerView;
    List<Consult> consultApplications;
    ConsultAdapter adapter;
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
        Toast.makeText(getContext(), "gg", Toast.LENGTH_SHORT).show();

        sharedPreferences = getActivity().getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
        token = sharedPreferences.getString(AppConstants.token, "default value");
        fcm_token = sharedPreferences.getString(AppConstants.FCM_TOKEN, "default value");
        choosing_langauge = sharedPreferences.getString(AppConstants.LANG_choose, "");


        progressDialog = new ProgressDialog(getActivity());

        if (sharedPreferences != null) {
            token = sharedPreferences.getString(AppConstants.token, "default value");
            fcm_token = sharedPreferences.getString(AppConstants.FCM_TOKEN, "default value");
            choosing_langauge = sharedPreferences.getString(AppConstants.LANG_choose, "");

            ConnectivityManager conMgr = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = conMgr.getActiveNetworkInfo();

            if (networkInfo != null && networkInfo.isConnected()) {

                if (sharedPreferences != null) {
                    if (sharedPreferences.getString(AppConstants.LANG_choose, null) != null) {
                        choosing_langauge = sharedPreferences.getString(AppConstants.LANG_choose, "");
                        Toast.makeText(getContext(), "" + token, Toast.LENGTH_SHORT).show();

                        getUserConsultation(choosing_langauge, token);
                    }
                }


            } else {
                Toast.makeText(getActivity(), "" + getString(R.string.no_internet), Toast.LENGTH_SHORT).show();
            }

            recyclerView = view.findViewById(R.id.rvAdvisorConsult);
            @SuppressLint("WrongConstant") RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
            recyclerView.setLayoutManager(layoutManager);

            consultApplications = new ArrayList<>();

            consultApplications.add(new Consult(true));
            consultApplications.add(new Consult(false));
            consultApplications.add(new Consult(false));
            consultApplications.add(new Consult(true));
            consultApplications.add(new Consult(true));
            consultApplications.add(new Consult(true));

            adapter = new ConsultAdapter(getContext(), consultApplications);
            recyclerView.setAdapter(adapter);

        }

        return view;

    }

    public void getUserConsultation(final String lang, final String token) {
        showDialog();


        StringRequest stringRequest = new StringRequest(Request.Method.GET, AppConstants.user_consultation, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    JSONObject jsonObject = new JSONObject(response);
                    JSONArray jsonArray = jsonObject.getJSONArray("data");
                    Log.e("response", response);

                    for (int i = 0; i < jsonArray.length(); i++) {

                        int id = jsonArray.getJSONObject(i).getInt("id");
                        String status = jsonArray.getJSONObject(i).getString("status");
                        Toast.makeText(getActivity(), "" + status, Toast.LENGTH_SHORT).show();


                    }


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
            public Map<String, String> getHeaders() throws AuthFailureError {
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
