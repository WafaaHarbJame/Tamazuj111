package com.Tamazj.TamazjApp.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.Tamazj.TamazjApp.MainActivity;
import com.Tamazj.TamazjApp.Model.Helper;
import com.Tamazj.TamazjApp.Model.User;
import com.Tamazj.TamazjApp.R;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import io.realm.Realm;

public class VoicevideoActivity extends AppCompatActivity {
    private DatabaseReference userRef, newUserRef;
    private Realm rChatDb;
    private Helper helper;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voicevideo);
        FirebaseApp.initializeApp(this);
        Realm.init(this);

        rChatDb = Helper.getRealmInstance();
        helper = new Helper(this);


    }

    private void login() {
        FirebaseDatabase firebaseDatabase = FirebaseDatabase.getInstance();
        userRef = firebaseDatabase.getReference(Helper.REF_USERS).child("+9720598271758");
        newUserRef = firebaseDatabase.getReference(Helper.REF_NEW_USER);
        userRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                if (dataSnapshot.exists() && dataSnapshot.getChildrenCount() > 0) {
                    try {
                        User user = dataSnapshot.getValue(User.class);
                        if (User.validate(user)) {
                            // helper.setLoggedInUser(user);
                            done(user);
                        } else {
                            createUser(new User("+9720598271758", "+9720598271758", getString(R.string.app_name), ""));
                        }
                    } catch (Exception ex) {
                        createUser(new User("+9720598271758", "+9720598271758", getString(R.string.app_name), ""));
                    }
                } else {
                    createUser(new User("+9720598271758", "+9720598271758", getString(R.string.app_name), ""));
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

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


    private void createUser(final User newUser) {
        userRef.setValue(newUser).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void aVoid) {
                //  helper.setLoggedInUser(newUser);
                done(newUser);
                newUserRef.setValue(newUser);
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(VoicevideoActivity.this, "jjjjj", Toast.LENGTH_LONG).show();
            }
        });
    }
}