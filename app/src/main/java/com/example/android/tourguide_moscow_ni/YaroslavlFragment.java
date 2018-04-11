package com.example.android.tourguide_moscow_ni;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class YaroslavlFragment extends Fragment {


    public YaroslavlFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //TextView textView = new TextView(getActivity());
        //textView.setText(R.string.hello_blank_fragment);
        //return textView;
        View rootView = inflater.inflate(R.layout.object_list, container, false);
        final ArrayList<List> list = new ArrayList<>();

        list.add(new List (getString(R.string.yar_MonasterySav_name),R.drawable.yar_monasterysav, getString(R.string.category_yaroslavl), getString(R.string.yar_MonasterySav_adr), getString(R.string.yar_MonasterySav_des)));
        list.add(new List(getString(R.string.yar_JohnBaptist_name), R.drawable.yar_johnbaptist, getString(R.string.category_yaroslavl), getString(R.string.yar_JohnBaptist_adr), getString(R.string.yar_JohnBaptist_des)));
        list.add(new List(getString(R.string.yar_CathTrans_name), R.drawable.yar_cathtrans, getString(R.string.category_yaroslavl), getString(R.string.yar_CathTrans_adr), getString(R.string.yar_CathTrans_des)));
        list.add(new List(getString(R.string.yar_ArtGov_name), R.drawable.yar_artgov, getString(R.string.category_yaroslavl), getString(R.string.yar_ArtGov_adr), getString(R.string.yar_ArtGov_des)));
        list.add(new List(getString(R.string.yar_ChurchElijah_name), R.drawable.yar_churchelijah, getString(R.string.category_yaroslavl), getString(R.string.yar_ChurchElijah_adr), getString(R.string.yar_ChurchElijah_des)));
        list.add(new List(getString(R.string.yar_ArtMetro_name), R.drawable.yar_artmetro, getString(R.string.category_yaroslavl), getString(R.string.yar_ArtMetro_adr), getString(R.string.yar_ArtMetro_des)));
        list.add(new List(getString(R.string.yar_BellTower_name), R.drawable.yar_belltower, getString(R.string.category_yaroslavl), getString(R.string.yar_BellTower_adr), getString(R.string.yar_BellTower_des)));
        list.add(new List(getString(R.string.yar_AnnCath_name), R.drawable.yar_anncath, getString(R.string.category_yaroslavl), getString(R.string.yar_AnnCath_adr), getString(R.string.yar_AnnCath_des)));

        ListAdapter itemsAdapter = new ListAdapter(getActivity(), list, R.color.Yaroslavl);

        ListView listView = (ListView) rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Intent intent = new Intent(getActivity(), ObjectDetailsActivity.class);
                intent.putExtra("Details", list.get(position));
                startActivity(intent);
            }

        });



        return rootView;
    }

}
