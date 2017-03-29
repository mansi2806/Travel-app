package com.example.android.travel;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.android.travel.R.id.container;

/**
 * Created by Mansi on 2/10/2017.
 */

public class RestaurantsActivity extends BaseActivity {
    ListView listView;
    ArrayList<Word> wordArrayList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
             //   LayoutInflater inflater = (LayoutInflater) this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//
//        //inflate your activity layout here!
//        View contentView = inflater.inflate(R.layout.activity_main, null, false);
//        drawerLayout.addView(contentView, 0);
        super.replaceContentLayout(R.layout.fragments_restaurants, R.id.content_layout);
        wordArrayList=new ArrayList<>();
        wordArrayList.add(new Word("R1","L1"));
        wordArrayList.add(new Word("R2","L2"));
        wordArrayList.add(new Word("R3","L3"));
        listView=(ListView)findViewById(R.id.Restaurantlist);
        WordsAdapter itemsAdapter=new WordsAdapter(this,wordArrayList,R.color.primary_light);
        listView.setAdapter(itemsAdapter);
    }


}
