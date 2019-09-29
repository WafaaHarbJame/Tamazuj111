package com.Tamazj.TamazjApp.Activity;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.Tamazj.TamazjApp.AdvisorFragments.AdvisorNotificationsFragment;
import com.Tamazj.TamazjApp.AdvisorFragments.ConsoultAdvisorFragment;
import com.Tamazj.TamazjApp.AdvisorFragments.HomeAdvisorFragment;
import com.Tamazj.TamazjApp.Fragments.MenuFragment;
import com.Tamazj.TamazjApp.R;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AdvisorActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {

                case R.id.navigation_advisor_home:
                    getSupportFragmentManager().beginTransaction().replace(R.id.advisorFragmentsContainer, new HomeAdvisorFragment(), "HomeFragment").commit();

                    return true;
                case R.id.navigation_advisor_notifications:
                    getSupportFragmentManager().beginTransaction().replace(R.id.advisorFragmentsContainer, new AdvisorNotificationsFragment(), "HomeFragment").commit();

                    return true;
                case R.id.navigation__advisor_consult:
                    getSupportFragmentManager().beginTransaction().replace(R.id.advisorFragmentsContainer, new ConsoultAdvisorFragment(), "HomeFragment").commit();

                    return true;

                case R.id.navigation_advisor_menu:
                    getSupportFragmentManager().beginTransaction().replace(R.id.advisorFragmentsContainer, new MenuFragment(), "HomeFragment").commit();

                    return true;
            }
            return false;
        }
    };

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @SuppressLint({"ResourceAsColor", "ResourceType"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advisor);
        getSupportFragmentManager().beginTransaction().replace(R.id.advisorFragmentsContainer, new HomeAdvisorFragment(), "HomeFragment").commit();
        BottomNavigationView navView = findViewById(R.id.nav_view_advisor);
        navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        navView.setItemIconTintList(null);
        navView.setBackgroundTintList(ColorStateList.valueOf(R.color.colorLightBlue));
        View notificationBadge;
        try {
            BottomNavigationMenuView menuView = (BottomNavigationMenuView) navView.getChildAt(0);
            BottomNavigationItemView itemView = (BottomNavigationItemView) menuView.getChildAt(1);
             notificationBadge = LayoutInflater.from(AdvisorActivity.this).inflate(R.layout.badge_layout, menuView, false);
             itemView.addView(notificationBadge);
             //notificationBadge.setVisibility(View.GONE);
        }
        catch (Exception e){

        }

    }
}
