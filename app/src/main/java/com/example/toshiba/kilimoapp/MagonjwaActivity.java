package com.example.toshiba.kilimoapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;

/**
 * Created by user on 9/20/2017.
 */

public class MagonjwaActivity extends FragmentActivity {
    ViewPager viewpager;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magonjwa);
        viewpager = (ViewPager) findViewById(R.id.pager);
        PagerAdapter padapter = new PagerAdapter(getSupportFragmentManager());
        viewpager.setAdapter(padapter);
    }


}




