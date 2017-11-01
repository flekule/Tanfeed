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

public class MagonjwaActivity extends Fragment {
    ViewPager viewpager;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        View view = inflater.inflate(R.layout.activity_magonjwa, container, false);


        ViewPager viewpager  = (ViewPager) getView().findViewById(R.id.pager);
        // or  (ImageView) view.findViewById(R.id.foo);
    return view;

    }


}
