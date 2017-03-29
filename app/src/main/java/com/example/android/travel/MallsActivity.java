package com.example.android.travel;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Mansi on 2/10/2017.
 */

public class MallsActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //        LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        //inflate your activity layout here!
//        View contentView = inflater.inflate(R.layout.activity_main, null, false);
//        drawerLayout.addView(contentView, 0);
        super.replaceContentLayout(R.layout.fragments_malls, R.id.content_layout);

    }
}
