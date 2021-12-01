package com.example.testtabs.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.testtabs.R;
import com.example.testtabs.fragments.ArtFragment;
import com.example.testtabs.fragments.GamesFragment;
import com.example.testtabs.fragments.TrendingFragment;

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
public class MyAdapter extends FragmentPagerAdapter {

    private final Context mContext;

    public MyAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ArtFragment artFragment = new ArtFragment();
                return artFragment;
            case 1:
                GamesFragment gamesFragment = new GamesFragment();
                return gamesFragment;
            case 2:
                TrendingFragment trendingFragment = new TrendingFragment();
                return trendingFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}