package com.Tamazj.TamazjApp.Activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.Tamazj.TamazjApp.Api.MyApplication;
import com.Tamazj.TamazjApp.Model.AppConstants;
import com.Tamazj.TamazjApp.R;
import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.verbosetech.yoohoo.activities.MainChatActivity;
import com.verbosetech.yoohoo.models.User;
import com.verbosetech.yoohoo.utils.Helper;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

import io.realm.Realm;

public class VoicevideoActivity extends AppCompatActivity {
    private DatabaseReference userRef, newUserRef;
    private Realm rChatDb;
    private Helper helper;
    ProgressDialog progressDialog;

    String token;
    String userphone;
    String username;

    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor_signUp;
    String choosing_langauge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voicevideo);
        sharedPreferences = getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);

        if (sharedPreferences != null) {
            token = sharedPreferences.getString(AppConstants.token, "default value");
            choosing_langauge = sharedPreferences.getString(AppConstants.LANG_choose, "");

            ConnectivityManager conMgr = (ConnectivityManager) this.getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo networkInfo = conMgr.getActiveNetworkInfo();

            if (networkInfo != null && networkInfo.isConnected()) {

                if (sharedPreferences != null) {
                    if (sharedPreferences.getString(AppConstants.LANG_choose, null) != null) {
                        choosing_langauge = sharedPreferences.getString(AppConstants.LANG_choose, "");
                        getUserProfile(token, choosing_langauge);


                    }
                }


            } else {
                Toast.makeText(VoicevideoActivity.this, "" + getString(R.string.no_internet), Toast.LENGTH_SHORT).show();
            }


        }
        FirebaseApp.initializeApp(this);
        Realm.init(this);

        //rChatDb = Helper.getRealmInstance();
        helper = new Helper(this);
        login();


    }

    private void login() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        userRef = firebaseDatabase.getReference(com.verbosetech.yoohoo.utils.Helper.REF_USERS).child(userphone);
        newUserRef = firebaseDatabase.getReference(com.verbosetech.yoohoo.utils.Helper.REF_NEW_USER);
        userRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                progressDialog.dismiss();
                if (dataSnapshot.exists() && dataSnapshot.getChildrenCount() > 0) {
                    try {
                        com.verbosetech.yoohoo.models.User user = dataSnapshot.getValue(com.verbosetech.yoohoo.models.User.class);
                        if (com.verbosetech.yoohoo.models.User.validate(user)) {
                            helper.setLoggedInUser(user);
                            done(user);
                        } else {
                            createUser(new com.verbosetech.yoohoo.models.User(userphone, username, getString(R.string.app_name), ""));
                        }
                    } catch (Exception ex) {
                        createUser(new com.verbosetech.yoohoo.models.User(userphone, username, getString(R.string.app_name), ""));
                    }
                } else {
                    createUser(new com.verbosetech.yoohoo.models.User(userphone, username, getString(R.string.app_name), ""));
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }


    private void createUser(final com.verbosetech.yoohoo.models.User newUser) {
        userRef.setValue(newUser).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                helper.setLoggedInUser(newUser);
                done(newUser);
                newUserRef.setValue(newUser);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(VoicevideoActivity.this, R.string.error_create_user, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void done(com.verbosetech.yoohoo.models.User userMe) {
        userMe.setNameInPhone("You");
        com.verbosetech.yoohoo.models.User userMeInDb = rChatDb.where(User.class).equalTo("id", userMe.getId()).findFirst();
        if (userMeInDb == null) {
            rChatDb.beginTransaction();
            rChatDb.copyToRealm(userMe);
            rChatDb.commitTransaction();
        }
        startActivity(new Intent(this, MainChatActivity.class));
        finish();
    }


    public void getUserProfile(final String token, final String lang) {

        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.USER_PROFILE, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Log.e("HZM", response);

                try {
                    JSONObject task_respnse = new JSONObject(response);
                    JSONObject taskarray = task_respnse.getJSONObject("data");
                    userphone = taskarray.getString("phone");
                    username = taskarray.getString("name");

                    sharedPreferences = getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
                    editor_signUp = sharedPreferences.edit();
                    editor_signUp.putString(AppConstants.USER_PHONE, userphone);
                    editor_signUp.putString(AppConstants.USER_NAME, username);

                    editor_signUp.apply();
                    editor_signUp.commit();


                } catch (JSONException e1) {
                    e1.printStackTrace();

                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {


            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                HashMap<String, String> headers = new HashMap<>();
                headers.put("Authorization", "Bearer" + "  " + token);

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

}