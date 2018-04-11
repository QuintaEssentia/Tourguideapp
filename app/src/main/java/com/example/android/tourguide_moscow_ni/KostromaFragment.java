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
public class KostromaFragment extends Fragment {


    public KostromaFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);
            final ArrayList<List> list = new ArrayList<>();

            list.add(new List(getString(R.string.kos_MonIpaty_name), R.drawable.kos_monipaty, getString(R.string.category_kostroma), getString(R.string.kos_MonIpaty_adr), getString(R.string.kos_MonIpaty_des)));
            list.add(new List(getString(R.string.kos_MuseumWood_name), R.drawable.kos_museumwood, getString(R.string.category_kostroma), getString(R.string.kos_MuseumWood_adr), getString(R.string.kos_MuseumWood_des)));
            list.add(new List(getString(R.string.kos_SusanPl_name), R.drawable.kos_susanpl, getString(R.string.category_kostroma), getString(R.string.kos_SusanPl_adr), getString(R.string.kos_SusanPl_des)));
            list.add(new List(getString(R.string.kos_Guardhouse_name), R.drawable.kos_guardhouse, getString(R.string.category_kostroma), getString(R.string.kos_Guardhouse_adr), getString(R.string.kos_Guardhouse_des)));
            list.add(new List(getString(R.string.kos_MonEpiphany_name), R.drawable.kos_monepiphany, getString(R.string.category_kostroma), getString(R.string.kos_MonEpiphany_adr), getString(R.string.kos_MonEpiphany_des)));



            ListAdapter itemsAdapter = new ListAdapter(getActivity(), list, R.color.Kostroma);

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
