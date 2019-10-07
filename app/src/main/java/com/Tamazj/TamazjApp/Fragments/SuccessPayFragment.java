package com.Tamazj.TamazjApp.Fragments;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.Tamazj.TamazjApp.Activity.SessionActivity;
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

import static android.content.Context.MODE_PRIVATE;

/**
 * A simple {@link Fragment} subclass.
 */
public class SuccessPayFragment extends Fragment {

    View view;
    Button buttonStartSession;
    String sessionType = AppConstants.FIRST_SESSION;
    String cost;
    TextView tvBillSupDetails;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor_signUp;
    String choosing_langauge;
    String token;
    String userphone;
    String username;
    private DatabaseReference userRef, newUserRef;
    private boolean authInProgress;
    private Realm rChatDb;
    private Helper helper;




    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_success_pay, container, false);

        tvBillSupDetails = view.findViewById(R.id.tvBillSupDetails);

        Bundle bundle = getArguments();
        if (bundle != null && bundle.getString(AppConstants.SESSION_TYPE) != null) {
            sessionType = bundle.getString(AppConstants.SESSION_TYPE);
        }

        switch (sessionType) {
            case AppConstants.FIRST_SESSION:
                cost = getString(R.string.RS50);
                tvBillSupDetails.setText(cost);
                break;
            case AppConstants.SECOND_SESSION:
                cost = getString(R.string.RS100);
                tvBillSupDetails.setText(cost);
                break;
            case AppConstants.THIRD_SESSION:
                cost = getString(R.string.RS200);
                tvBillSupDetails.setText(cost);
                break;
            case AppConstants.SPECIAL_SESSION:
                cost = getString(R.string.RS500);
                tvBillSupDetails.setText(cost);
                break;
        }


        Toast.makeText(getContext(), "" + cost, Toast.LENGTH_SHORT).show();
        tvBillSupDetails.setText(cost);


        buttonStartSession = view.findViewById(R.id.buttonStartSession);
        buttonStartSession.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), SessionActivity.class);
                intent.putExtra(AppConstants.SESSION_TYPE, sessionType);
                getActivity().startActivity(intent);
                getActivity().finish();
            }
        });
        return view;
    }

    private void login() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        userRef = firebaseDatabase.getReference(Helper.REF_USERS).child(userphone);
        newUserRef = firebaseDatabase.getReference(Helper.REF_NEW_USER);
        userRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
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
                Toast.makeText(getContext(), R.string.error_create_user, Toast.LENGTH_LONG).show();
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
        getActivity().startActivity(new Intent(getContext(), MainChatActivity.class));
        getActivity().finish();
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

                    sharedPreferences = getActivity().getSharedPreferences(AppConstants.KEY_SIGN_UP, MODE_PRIVATE);
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