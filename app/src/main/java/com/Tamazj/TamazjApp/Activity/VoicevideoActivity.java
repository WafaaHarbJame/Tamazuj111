package com.Tamazj.TamazjApp.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.Tamazj.TamazjApp.R;
import com.google.firebase.database.DatabaseReference;


public class VoicevideoActivity extends AppCompatActivity {
    private DatabaseReference userRef, newUserRef;
    // private Realm rChatDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voicevideo);


    }

}