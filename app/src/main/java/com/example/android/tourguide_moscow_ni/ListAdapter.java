package com.example.android.tourguide_moscow_ni;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends ArrayAdapter<List> {
    private static final String LOG_TAG = ListAdapter.class.getSimpleName();
    private int mColorResID;

    public ListAdapter(Activity context, ArrayList<List> list, int backgroundColor) {
        super(context, 0, list);
        mColorResID = backgroundColor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        List currentObject = getItem(position);

        TextView objectName = (TextView) listItemView.findViewById(R.id.objectTextview);
        objectName.setText(currentObject.getmObjectName());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.image);
        iconView.setImageResource(currentObject.getMimageResourceID());
        iconView.setVisibility(View.VISIBLE);

        View textContainer = listItemView.findViewById(R.id.objectTextview);
        int color = ContextCompat.getColor(getContext(), mColorResID);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}

