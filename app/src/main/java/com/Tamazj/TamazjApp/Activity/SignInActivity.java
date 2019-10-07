package com.Tamazj.TamazjApp.Activity;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.Tamazj.TamazjApp.Api.MyApplication;
import com.Tamazj.TamazjApp.MainActivity;
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
import com.verbosetech.yoohoo.models.User;
import com.verbosetech.yoohoo.utils.Helper;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import io.realm.Realm;

public class SignInActivity extends AppCompatActivity {

    EditText email, password;
    Button sign, signUp;
    ProgressDialog progressDialog;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor_signUp;
    TextView forgetpassward;
    private String[] languages = { "English", "Arabic" };
    boolean choose_langaue=false;
    String token;
    String userphone;
    String username;
    private Realm rChatDb;
    private Helper helper;

    Spinner langauage;

    String choosing_langauge;
    private DatabaseReference userRef, newUserRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        FirebaseApp.initializeApp(this);
        Realm.init(this);

        // rChatDb = Helper.getRealmInstance();
        helper = new Helper(this);

        User user = helper.getLoggedInUser();
        if (user != null) {    //Check if user if logged in
            done(user);
        }
        email = findViewById(R.id.etSignInEmail);
        password = findViewById(R.id.etSignInPassword);
        langauage = findViewById(R.id.langauage);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, languages);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        langauage.setAdapter(adapter);
        langauage.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                choose_langaue=true;
                return false;
            }
        });
        sharedPreferences = getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);

        langauage.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> arg0, View arg1,
                                       int arg2, long arg3) {

                choose_langaue=true;
                Configuration config = new Configuration();
                switch (arg2) {
                    case 0:
                        config.locale = Locale.ENGLISH;

                        sharedPreferences = getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
                        editor_signUp = sharedPreferences.edit();
                        editor_signUp.putString(AppConstants.LANG_choose, "en");
                        editor_signUp.apply();
                        editor_signUp.commit();
                        break;
                    case 1:
                        Locale arabic = new Locale("ar", "ar");
                        config.locale = arabic;
                        editor_signUp = sharedPreferences.edit();
                        editor_signUp.putString(AppConstants.LANG_choose, "ar");
                        editor_signUp.apply();
                        editor_signUp.commit();
                        break;
                    default:
                        Locale arabiclocal = new Locale("ar", "ar");
                        config.locale = arabiclocal;
                        editor_signUp = sharedPreferences.edit();
                        editor_signUp.putString(AppConstants.LANG_choose, "ar");
                        editor_signUp.apply();
                        editor_signUp.commit();
                        break;
                }
                getResources().updateConfiguration(config, null);
            }

            public void onNothingSelected(AdapterView<?> arg0) {
                // TODO Auto-generated method stub

            }
        });
        sign = findViewById(R.id.buttonSignInSign);
        signUp = findViewById(R.id.buttonSignInSignUp);
        forgetpassward = findViewById(R.id.forgetpassward);
        forgetpassward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, ResetPassActivity.class);
                startActivity(intent);
                finish();
            }
        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (email.getText().equals(null) || email.getText().equals("")) {
                    Toast.makeText(SignInActivity.this, "" + getString(R.string.emailRequired), Toast.LENGTH_SHORT).show();

                } else if (!isEmailValid(email.getText().toString())) {
                    Toast.makeText(SignInActivity.this, getString(R.string.enter__correct_email), Toast.LENGTH_SHORT).show();

                } else if (password.getText().equals(null) || password.getText().equals("")) {
                    Toast.makeText(SignInActivity.this, "" + getString(R.string.passwordRequired), Toast.LENGTH_SHORT).show();
                } else {
                    ConnectivityManager conMgr = (ConnectivityManager) SignInActivity.this.getSystemService(Context.CONNECTIVITY_SERVICE);
                    NetworkInfo networkInfo = conMgr.getActiveNetworkInfo();

                    if (networkInfo != null && networkInfo.isConnected()) {

                        if(choose_langaue) {
                            sharedPreferences = getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
                            if (sharedPreferences != null) {
                                if (sharedPreferences.getString(AppConstants.LANG_choose, null) != null) {
                                    choosing_langauge = sharedPreferences.getString(AppConstants.LANG_choose, "");
                                    loginuser(email.getText().toString(), password.getText().toString(), choosing_langauge);

                                }
                            }

                        }
                        else {
                            Toast.makeText(SignInActivity.this, ""+getString(R.string.choose_lanague), Toast.LENGTH_SHORT).show();
                        }

                    }



                    else {
                        Toast.makeText(SignInActivity.this, ""+getString(R.string.no_internet), Toast.LENGTH_SHORT).show();
                    }


                }
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


    public static boolean isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }


    public void loginuser(final String email, final String password,final String lang) {
        showDialog();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.USER_LOGIN, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject register_response = new JSONObject(response);
                    int status = register_response.getInt("status");
                    //  String message = register_response.getString("message");
                    String token = register_response.getString("token");
                    Log.e("WAFAA", response);


                    if (status == 1) {
                        // Toast.makeText(SignInActivity.this, ""+message, Toast.LENGTH_SHORT).show();
                        sharedPreferences = getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
                        editor_signUp = sharedPreferences.edit();
                        editor_signUp.putString(AppConstants.EMAIL, email.toString());
                        editor_signUp.putString(AppConstants.PASSWORD, password.toString());
                        editor_signUp.putString(AppConstants.token, token);
                        editor_signUp.putBoolean(AppConstants.ISLOGIN, true);
                        editor_signUp.apply();
                        editor_signUp.commit();
                        Intent main = new Intent(SignInActivity.this, com.verbosetech.yoohoo.activities.SignInActivity.class);
                        startActivity(main);
                        finish();


                    } else {
                        hideDialog();
                        //Toast.makeText(SignInActivity.this, " "+message, Toast.LENGTH_SHORT).show();

                    }


                    hideDialog();


                } catch (JSONException e) {
                    e.printStackTrace();
                    hideDialog();
                    Toast.makeText(SignInActivity.this, "رقم الجوال او كلمة المرور غير صحيحة ", Toast.LENGTH_SHORT).show();

                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                hideDialog();
                Toast.makeText(SignInActivity.this, "رقم الجوال او كلمة المرور غير صحيحة ", Toast.LENGTH_SHORT).show();


            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap();
                map.put("email", email);
                map.put("password", password);

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

    public void loginconsultation(final String email, final String password) {
        showDialog();
        StringRequest stringRequest = new StringRequest(Request.Method.POST, AppConstants.USER_LOGIN, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    JSONObject register_response = new JSONObject(response);
                    JSONObject auto = register_response.getJSONObject("auth");

                    boolean status = register_response.getBoolean("status");
                    String type = register_response.getString("type");
                    int user_id = auto.getInt("id");
                    if (status) {


                        Intent main = new Intent(SignInActivity.this, MainActivity.class);
                        sharedPreferences = getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
                        editor_signUp = sharedPreferences.edit();
                        startActivity(main);
                        finish();


                    } else {
                        hideDialog();
                        Toast.makeText(SignInActivity.this, "رقم الجوال او كلمة المرور غير صحيحة ", Toast.LENGTH_SHORT).show();

                    }


                    hideDialog();


                } catch (JSONException e) {
                    e.printStackTrace();
                    hideDialog();
                    Toast.makeText(SignInActivity.this, "رقم الجوال او كلمة المرور غير صحيحة ", Toast.LENGTH_SHORT).show();

                }


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                hideDialog();
                Toast.makeText(SignInActivity.this, "رقم الجوال او كلمة المرور غير صحيحة ", Toast.LENGTH_SHORT).show();


            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> map = new HashMap();
                map.put("email", email);
                map.put("password", password);

                return map;

            }
        };

        MyApplication.getInstance().addToRequestQueue(stringRequest);


    }

    public void showDialog() {
        progressDialog = new ProgressDialog(SignInActivity.this);
        progressDialog.setMessage(getString(R.string.load_login));
        progressDialog.setCancelable(false);
        progressDialog.show();
    }

    public void hideDialog() {

        if (progressDialog.isShowing()) progressDialog.dismiss();
    }


    private void login() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        userRef = firebaseDatabase.getReference(Helper.REF_USERS).child(userphone);
        newUserRef = firebaseDatabase.getReference(Helper.REF_NEW_USER);
        userRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                progressDialog.dismiss();
                if (dataSnapshot.exists() && dataSnapshot.getChildrenCount() > 0) {
                    try {
                        User user = dataSnapshot.getValue(User.class);
                        if (User.validate(user)) {
                            helper.setLoggedInUser(user);
                            done(user);
                        } else {
                            createUser(new User(userphone, username, getString(R.string.app_name), ""));
                        }
                    } catch (Exception ex) {
                        createUser(new User(userphone, username, getString(R.string.app_name), ""));
                    }
                } else {
                    createUser(new User(userphone, username, getString(R.string.app_name), ""));
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

    }


    private void createUser(final User newUser) {
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
                Toast.makeText(SignInActivity.this, R.string.error_create_user, Toast.LENGTH_LONG).show();
            }
        });
    }

    private void done(User userMe) {
        userMe.setNameInPhone("You");
        User userMeInDb = rChatDb.where(User.class).equalTo("id", userMe.getId()).findFirst();
        if (userMeInDb == null) {
            rChatDb.beginTransaction();
            rChatDb.copyToRealm(userMe);
            rChatDb.commitTransaction();
        }
        startActivity(new Intent(this, MainActivity.class));
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

