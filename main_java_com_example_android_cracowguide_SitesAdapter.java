package com.example.android.cracowguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SitesAdapter extends ArrayAdapter<Sites> {

    private static final String LOG_TAG = SitesAdapter.class.getSimpleName();


    public SitesAdapter(Activity context, ArrayList<Sites> places) {
        super(context, 0, places);

    }

    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        View listItemView;
        listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.simple_list_item_1, parent, false);
        }
        Sites currentWord = getItem(position);


        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);

        descriptionTextView.setText(currentWord.getDescription());

        TextView adressTextView = (TextView) listItemView.findViewById(R.id.address);

        adressTextView.setText(currentWord.getAdress());
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        iconView.setImageResource(currentWord.getPicture());
        View textContainer = listItemView.findViewById(R.id.text_container);


        return listItemView;
    }


}
