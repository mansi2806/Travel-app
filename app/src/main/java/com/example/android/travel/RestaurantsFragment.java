package com.example.android.travel;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Mansi on 2/8/2017.
 */

public class RestaurantsFragment extends Fragment {

    ListView listView;
    ArrayList<Word>wordArrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragments_restaurants,container,false);
        wordArrayList=new ArrayList<>();
        wordArrayList.add(new Word("R1","L1"));
        wordArrayList.add(new Word("R2","L2"));
        wordArrayList.add(new Word("R3","L3"));
        listView=(ListView)rootView.findViewById(R.id.Restaurantlist);
        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        WordsAdapter itemsAdapter=new WordsAdapter(getActivity(),wordArrayList,R.color.primary_light);
        listView.setAdapter(itemsAdapter);
    }
}
