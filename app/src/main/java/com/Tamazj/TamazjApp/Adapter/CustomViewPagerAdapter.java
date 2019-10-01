package com.Tamazj.TamazjApp.Adapter;

import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.Tamazj.TamazjApp.Fragments.FirstSlideFragment;

public class CustomViewPagerAdapter extends FragmentStatePagerAdapter {
    public CustomViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }



    @Override
    public Fragment getItem(int position) {
        Fragment fragment = new FirstSlideFragment();
//        if (position == 0) {
//            fragment = new FirstSlideFragment();
//        } else if (position == 1) {
//            fragment = new FirstSlideFragment();
//        } else {
//            fragment = new FirstSlideFragment();
//        }
        return new FirstSlideFragment(position);
        //return fragment;
    }

    @Override
    public int getCount() {
        // return the number of your fragments,
        // we have 3 fragments
        return 9;
    }
}