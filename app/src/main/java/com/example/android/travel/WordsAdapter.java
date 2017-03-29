package com.example.android.travel;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mansi on 2/8/2017.
 */

public class WordsAdapter extends ArrayAdapter<Word> {

    private int colorId;

    public WordsAdapter(Activity context, ArrayList<Word>w,int color){
        super(context,0,w);
        colorId=color;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Word currentWord = getItem(position);
        View listItemView=convertView;
        if(listItemView==null)
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        TextView upperTextView=(TextView)listItemView.findViewById(R.id.upper_text_view);
        upperTextView.setText(currentWord.getUpper());
        TextView lowerTextView=(TextView)listItemView.findViewById(R.id.lower_text_view);
        lowerTextView.setText(currentWord.getLower());
        return listItemView;

    }
}
