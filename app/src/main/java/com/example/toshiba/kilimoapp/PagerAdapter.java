package com.example.toshiba.kilimoapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by user on 11/1/2017.
 */

public  class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int arg0){
        switch (arg0) {
            case 0:
                return new MagonjwaOne();
            case 1:
                return new MagonjwaTwo();
            case 2:
                return new MagonjwaThree();
            default:
                break;
        }

        return null;
    }

    @Override
    public int getCount(){
        return 3;
    }



}

