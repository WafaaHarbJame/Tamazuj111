package com.Tamazj.TamazjApp.Activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.Tamazj.TamazjApp.Api.MyApplication;
import com.Tamazj.TamazjApp.Model.AppConstants;
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

public class ResetPassActivity extends AppCompatActivity {

    private EditText mEditPhone;
    private Button mResetpass;
    ProgressDialog progressDialog;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor_signUp;
    String choosing_langauge;
    ImageView back;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_pass);

        mEditPhone = findViewById(R.id.editPhone);
        mResetpass = findViewById(R.id.resetpass);
        progressDialog = new ProgressDialog(ResetPassActivity.this);

        sharedPreferences = getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
        back = findViewById(R.id.advisor_back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResetPassActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
            }
        });


        mResetpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mEditPhone.getText().equals(null) || mEditPhone.getText().equals("")){
                    Toast.makeText(ResetPassActivity.this, ""+getString(R.string.phoneRequired), Toast.LENGTH_SHORT).show();
                }
                else{

                    ConnectivityManager conMgr = (ConnectivityManager) ResetPassActivity.this.getSystemService(Context.CONNECTIVITY_SERVICE);
                    NetworkInfo networkInfo = conMgr.getActiveNetworkInfo();

                    if (networkInfo != null && networkInfo.isConnected()) {
                        if (sharedPreferences != null) {
                            if (sharedPreferences.getString(AppConstants.LANG_choose, null) != null) {
                                choosing_langauge = sharedPreferences.getString(AppConstants.LANG_choose, "");
                                resetPass(mEditPhone.getText().toString(),choosing_langauge);

                            }
                        }



                    }
                    else {
                        Toast.makeText(ResetPassActivity.this, ""+getString(R.string.no_internet), Toast.LENGTH_SHORT).show();
                    }



                }
            }
        });
    }



    public void resetPass(final String phone,final  String lang) {
        showDialog();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.resetPass, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject register_response = new JSONObject(response);
                    String message = register_response.getString("message");
                    int status = register_response.getInt("status");
                    Log.e("WAFAA",response);


                    if (status == 1) {
                        Toast.makeText(ResetPassActivity.this, "" + message, Toast.LENGTH_SHORT).show();
                        Intent login = new Intent(ResetPassActivity.this, SignInActivity.class);
                        startActivity(login);
                        finish();

                    } else {
                        Toast.makeText(ResetPassActivity.this, " " + message, Toast.LENGTH_SHORT).show();

                    }

                    hideDialog();
                } catch (JSONException e) {
                    e.printStackTrace();
                    hideDialog();
                    Toast.makeText(ResetPassActivity.this, " ", Toast.LENGTH_SHORT).show();

                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                hideDialog();
                Toast.makeText(ResetPassActivity.this, "error", Toast.LENGTH_SHORT).show();


            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap();
                map.put("phone", phone);


                return map;

            }
            @Override
            public Map<String, String> getHeaders() {
                HashMap<String, String> headers = new HashMap<>();
                headers.put("lang", lang);
                return headers;
            }
        };

        MyApplication.getInstance().addToRequestQueue(stringRequest);


    }


    public void showDialog() {
        progressDialog = new ProgressDialog(ResetPassActivity.this);
        progressDialog.setMessage(getString(R.string.load_login));
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    public void hideDialog() {

        if (progressDialog.isShowing()) progressDialog.dismiss();
    }
}
