package com.Tamazj.TamazjApp.Model;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.Tamazj.TamazjApp.Activity.ActivateCodeActivity;
import com.Tamazj.TamazjApp.Activity.SignUpActivity;
import com.Tamazj.TamazjApp.Api.MyApplication;
import com.Tamazj.TamazjApp.R;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;



public class RequestConsultation {

    Context context;

    public String requestConsultation (final String communication, final String problem, final int sessionId,
                                       final String categoryId, final String consultantId, final String subCategoryId,
                                       final String status, final String lang, final String token, Context context){
        final String[] message = new String[0];
        this.context = context;

        showDialog();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.user_consultation,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject r = new JSONObject(response);
                            message[0] = r.getString("message");
                            int status = r.getInt("status");
                            Log.e("WAFAA",response);

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
        })
        {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String,String> map = new HashMap();
                map.put("means_of_communication", communication);
                map.put("summary_problem", problem);
                map.put("session_id", sessionId+"");
                map.put("category_id", categoryId);
                map.put("consultant_id", consultantId);
                map.put("sub_category_id", subCategoryId);
                map.put("status", status);
                return map;

            }

            @Override
            public Map<String, String> getHeaders() {
                HashMap<String, String> headers = new HashMap<>();
                headers.put("Authorization", "Bearer" + "  " + token);
                headers.put("lang", lang);
                return headers;

            }

        }
                ;

        MyApplication.getInstance().addToRequestQueue(stringRequest);

       // return message[0];
        return AppConstants.SUCCESS;
    }

    ProgressDialog progressDialog;

    public void showDialog() {
        progressDialog = new ProgressDialog(context);
        progressDialog.setMessage(context.getString(R.string.load_login));
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    public void hideDialog() {

        if (progressDialog.isShowing()) progressDialog.dismiss();
    }

}
