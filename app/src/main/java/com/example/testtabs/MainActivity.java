package com.example.testtabs;

import android.os.Bundle;

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

        tabLayout.addTab(tabLayout.newTab().setText("Paris"));
        tabLayout.addTab(tabLayout.newTab().setText("London"));
        tabLayout.addTab(tabLayout.newTab().setText("Rome"));
        tabLayout.addTab(tabLayout.newTab().setText("New York"));
        tabLayout.addTab(tabLayout.newTab().setText("Hong Kong"));
        tabLayout.addTab(tabLayout.newTab().setText("Singapore"));
        tabLayout.addTab(tabLayout.newTab().setText("Dubai"));
        tabLayout.addTab(tabLayout.newTab().setText("Bangkok"));
        tabLayout.addTab(tabLayout.newTab().setText("Tokyo"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager.setAdapter(myAdapter);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setClipToPadding(false);
        viewPager.setPageMargin(30);

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