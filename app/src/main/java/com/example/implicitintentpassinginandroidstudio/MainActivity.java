package com.example.implicitintentpassinginandroidstudio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    // 1- step is find the Ids
    TabLayout TLtab;
    ViewPager VPviewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 2- step is to init the objects
        init();

        ViewPagerMessengerAdapter adapter = new ViewPagerMessengerAdapter(getSupportFragmentManager());

        VPviewPager.setAdapter(adapter);

        TLtab.setupWithViewPager(VPviewPager);
    }

    void init(){


        VPviewPager = findViewById(R.id.VPviewPager);
        TLtab = findViewById(R.id.TLtab);
    }

}