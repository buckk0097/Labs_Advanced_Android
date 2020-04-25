package com.example.test.activities;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.test.R;
import com.example.test.adapters.ViewPagerAdabter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout ;
    private ViewPager viewPager ;
    private ViewPagerAdabter adapter ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = (TabLayout) findViewById(R.id.tablayout_id);
        viewPager = (ViewPager) findViewById(R.id.viewpager_id);
        adapter = new ViewPagerAdabter(getSupportFragmentManager());

        // Add Fragment here

        adapter.AddFragment(new FragmentCall(),"News");
        adapter.AddFragment(new FragmentContact(),"Coaches");
        //adapter.AddFragment(new FragmentFav(),"PROFILE");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_dvr);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_directions_bike);
        //tabLayout.getTabAt(2).setIcon(R.drawable.ic_perm_contact);


        // Remove shadow from action bar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);


    }
}
