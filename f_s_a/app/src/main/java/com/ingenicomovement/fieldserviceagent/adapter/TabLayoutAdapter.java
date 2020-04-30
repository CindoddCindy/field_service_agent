package com.ingenicomovement.fieldserviceagent.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.ingenicomovement.fieldserviceagent.fragment.Bulan;
import com.ingenicomovement.fieldserviceagent.fragment.Done;
import com.ingenicomovement.fieldserviceagent.fragment.Minggu;
import com.ingenicomovement.fieldserviceagent.fragment.Revisit;

public class TabLayoutAdapter extends FragmentStatePagerAdapter {
    private int tabJum;
    public TabLayoutAdapter(@NonNull FragmentManager fm, int tabJum) {
        super(fm);
        this.tabJum=tabJum;
    }
/*
    public TabLayoutAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

 */

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                return new Minggu();
            case 1:
                return new Bulan();
            case 2:
                return new Done();
            case 3:
                return new Revisit();
            default:
                //return null;
                return null;
        }
    }

    @Override
    public int getCount() {
        return  tabJum;
    }
}
