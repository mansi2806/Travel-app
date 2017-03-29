package com.example.android.travel;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TableLayout;

/**
 * Created by Mansi on 2/10/2017.
 */

public class MonumentsActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        //inflate your activity layout here!
//        View contentView = inflater.inflate(R.layout.activity_main, null, false);
//        drawerLayout.addView(contentView, 0);
        super.replaceContentLayout(R.layout.fragment_monuments, R.id.content_layout);
        ViewPager viewPager=(ViewPager)findViewById(R.id.viewpager);
        SimpleFragmentPageAdapter simpleFragmentPageAdapter=new SimpleFragmentPageAdapter(getSupportFragmentManager());
        viewPager.setAdapter(simpleFragmentPageAdapter);

        TabLayout tabLayout=(TabLayout)findViewById(R.id.sliding_tabs);
        tabLayout.setupWithViewPager(viewPager);



    }
}
