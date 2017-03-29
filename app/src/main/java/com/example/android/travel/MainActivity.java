package com.example.android.travel;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Mansi on 2/11/2017.
 */

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        //inflate your activity layout here!
//        View contentView = inflater.inflate(R.layout.activity_main, null, false);
//        drawerLayout.addView(contentView, 0);
        super.replaceContentLayout(R.layout.activity_main, R.id.content_layout);

    }
}
