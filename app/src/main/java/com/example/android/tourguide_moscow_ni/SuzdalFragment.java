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
public class SuzdalFragment extends Fragment {


    public SuzdalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);
        final ArrayList<List> list = new ArrayList<>();

        list.add(new List(getString(R.string.suz_SaviourMon_name), R.drawable.suz_saviourmon, getString(R.string.category_suzdal), getString(R.string.suz_SaviourMon_adr), getString(R.string.suz_SaviourMon_des)));
        list.add(new List(getString(R.string.suz_Kremlin_name), R.drawable.suz_kremlin, getString(R.string.category_suzdal), getString(R.string.suz_Kremlin_adr), getString(R.string.suz_Kremlin_des)));
        list.add(new List(getString(R.string.suz_WoodArch_name), R.drawable.suz_woodarch, getString(R.string.category_suzdal), getString(R.string.suz_WoodArch_adr), getString(R.string.suz_WoodArch_des)));
        list.add(new List(getString(R.string.suz_NatVirg_name), R.drawable.suz_natvirg, getString(R.string.category_suzdal), getString(R.string.suz_NatVirg_adr),getString(R.string.suz_NatVirg_des)));
        list.add(new List(getString(R.string.suz_TorgPl_name), R.drawable.suz_torgpl, getString(R.string.category_suzdal), getString(R.string.suz_TorgPl_adr), getString(R.string.suz_TorgPl_des)));
        list.add(new List(getString(R.string.suz_HolyIntConv_name), R.drawable.suz_holyintconv, getString(R.string.category_suzdal), getString(R.string.suz_HolyIntConv_adr), getString(R.string.suz_HolyIntConv_des)));
        list.add(new List(getString(R.string.suz_ChurchAssump_name), R.drawable.suz_churchassump, getString(R.string.category_suzdal), getString(R.string.suz_ChurchAssump_adr), getString(R.string.suz_ChurchAssump_des)));

        ListAdapter itemsAdapter = new ListAdapter(getActivity(), list, R.color.Suzdal);

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
