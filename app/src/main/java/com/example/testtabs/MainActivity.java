package com.example.testtabs;

import android.os.Bundle;

import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.tabs.TabLayout;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import com.example.testtabs.ui.main.MyAdapter;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        MyAdapter myAdapter = new MyAdapter(this, getSupportFragmentManager());

        tabLayout = (TabLayout)findViewById(R.id.tabs);
        viewPager=(ViewPager)findViewById(R.id.view_pager);

        tabLayout.addTab(tabLayout.newTab().setText("Paris").setIcon(R.drawable.ic_paris));
        tabLayout.addTab(tabLayout.newTab().setText("London").setIcon(R.drawable.ic_london));
        tabLayout.addTab(tabLayout.newTab().setText("Rome").setIcon(R.drawable.ic_rome));
        tabLayout.addTab(tabLayout.newTab().setText("New York").setIcon(R.drawable.ic_new_york));
        tabLayout.addTab(tabLayout.newTab().setText("Hong Kong").setIcon(R.drawable.ic_hong_kong));
        tabLayout.addTab(tabLayout.newTab().setText("Singapore").setIcon(R.drawable.ic_singapore));
        tabLayout.addTab(tabLayout.newTab().setText("Dubai").setIcon(R.drawable.ic_dubai));
        tabLayout.addTab(tabLayout.newTab().setText("Bangkok").setIcon(R.drawable.ic_bangkok));
        tabLayout.addTab(tabLayout.newTab().setText("Tokyo").setIcon(R.drawable.ic_tokyo));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        viewPager.setAdapter(myAdapter);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(30);

        //set the badges
        BadgeDrawable parisBadge, londonBadge,
                romeBadge, newyorkBadge,
                hongkongBadge, singaporeBadge,
                dubaiBadge, bangkokBadge, tokyoBadge;
        parisBadge = tabLayout.getTabAt(0).getOrCreateBadge();
        parisBadge.setVisible(true);
        parisBadge.setNumber(32);

        londonBadge = tabLayout.getTabAt(1).getOrCreateBadge();
        londonBadge.setVisible(true);
        londonBadge.setNumber(25);

        romeBadge = tabLayout.getTabAt(2).getOrCreateBadge();
        romeBadge.setVisible(true);
        romeBadge.setNumber(27);

        newyorkBadge = tabLayout.getTabAt(3).getOrCreateBadge();
        newyorkBadge.setVisible(true);
        newyorkBadge.setNumber(48);

        hongkongBadge = tabLayout.getTabAt(4).getOrCreateBadge();
        hongkongBadge.setVisible(true);
        hongkongBadge.setNumber(29);

        singaporeBadge = tabLayout.getTabAt(5).getOrCreateBadge();
        singaporeBadge.setVisible(true);
        singaporeBadge.setNumber(17);

        dubaiBadge = tabLayout.getTabAt(6).getOrCreateBadge();
        dubaiBadge.setVisible(true);
        dubaiBadge.setNumber(38);

        bangkokBadge = tabLayout.getTabAt(7).getOrCreateBadge();
        bangkokBadge.setVisible(true);
        bangkokBadge.setNumber(26);

        tokyoBadge = tabLayout.getTabAt(8).getOrCreateBadge();
        tokyoBadge.setVisible(true);
        tokyoBadge.setNumber(49);


        //Option 1
        //tabLayout.setupWithViewPager(viewPager);

        //Option 2
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

    }
}