package com.example.testtabs.ui.main;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.testtabs.fragments.BangkokFragment;
import com.example.testtabs.fragments.DubaiFragment;
import com.example.testtabs.fragments.HongKongFragment;
import com.example.testtabs.fragments.NewYorkFragment;
import com.example.testtabs.fragments.ParisFragment;
import com.example.testtabs.fragments.LondonFragment;
import com.example.testtabs.fragments.RomeFragment;
import com.example.testtabs.fragments.SingaporeFragment;
import com.example.testtabs.fragments.TokyoFragment;

public class MyAdapter extends FragmentPagerAdapter {

    private int tabs_size = 9;
    private final Context mContext;

    public MyAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                ParisFragment parisFragment = new ParisFragment();
                return parisFragment;
            case 1:
                LondonFragment londonFragment = new LondonFragment();
                return londonFragment;
            case 2:
                RomeFragment romeFragment = new RomeFragment();
                return romeFragment;
            case 3:
                NewYorkFragment newyorkFragment = new NewYorkFragment();
                return newyorkFragment;
            case 4:
                HongKongFragment hongkongFragment = new HongKongFragment();
                return hongkongFragment;
            case 5:
                SingaporeFragment singaporeFragment = new SingaporeFragment();
                return singaporeFragment;
            case 6:
                DubaiFragment dubaiFragment = new DubaiFragment();
                return dubaiFragment;
            case 7:
                BangkokFragment bangkokFragment = new BangkokFragment();
                return bangkokFragment;
            case 8:
                TokyoFragment tokyoFragment = new TokyoFragment();
                return tokyoFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabs_size;
    }

    @Override
    public float getPageWidth (int position) {
        return 0.93f;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return "Page " + position;
    }
}