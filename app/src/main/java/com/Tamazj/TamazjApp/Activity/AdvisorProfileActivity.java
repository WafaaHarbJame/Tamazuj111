package com.Tamazj.TamazjApp.Activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.Tamazj.TamazjApp.AdvisorFragments.AdvisorProfileFragment;
import com.Tamazj.TamazjApp.R;

public class AdvisorProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advisor_profile);

        getSupportFragmentManager().beginTransaction().replace(R.id.advisorProfileContainer, new AdvisorProfileFragment(), "HomeFragment").commit();
    }
}
