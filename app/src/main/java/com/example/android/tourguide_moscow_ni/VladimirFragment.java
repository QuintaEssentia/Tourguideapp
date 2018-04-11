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
public class VladimirFragment extends Fragment {


    public VladimirFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.object_list, container, false);
        final ArrayList<List> list = new ArrayList<>();

        list.add(new List(getString(R.string.vla_AssumpCath_name),R.drawable.vla_assumpcath, getString(R.string.category_vladimir), getString(R.string.vla_AssumpCath_adr), getString(R.string.vla_AssumpCath_des)));
        list.add(new List(getString(R.string.vla_OldVladMus_name), R.drawable.vla_oldvladmus, getString(R.string.category_vladimir), getString(R.string.vla_OldVladMus_adr), getString(R.string.vla_OldVladMus_des)));
        list.add(new List(getString(R.string.vla_CathStDmitry_name), R.drawable.vla_cathstdmitry, getString(R.string.category_vladimir), getString(R.string.vla_CathStDmitry_adr), getString(R.string.vla_CathStDmitry_des)));
        list.add(new List(getString(R.string.vla_GeorgUl_name), R.drawable.vla_georgul, getString(R.string.category_vladimir), getString(R.string.vla_GeorgUl_adr), getString(R.string.vla_GeorgUl_des)));
        list.add(new List(getString(R.string.vla_HisMus_name), R.drawable.vla_hismus, getString(R.string.category_vladimir), getString(R.string.vla_HisMus_adr), getString(R.string.vla_HisMus_des)));
        list.add(new List(getString(R.string.vla_GoldGate_name), R.drawable.vla_goldgate, getString(R.string.category_vladimir), getString(R.string.vla_GoldGate_adr), getString(R.string.vla_GoldGate_des)));
        list.add(new List(getString(R.string.vla_CrysLacEm_name), R.drawable.vla_cryslacem, getString(R.string.category_vladimir), getString(R.string.vla_CrysLacEm_adr), getString(R.string.vla_CrysLacEm_des)));
        list.add(new List(getString(R.string.vla_SobPl_name), R.drawable.vla_sobpl, getString(R.string.category_vladimir), getString(R.string.vla_SobPl_adr), getString(R.string.vla_SobPl_des)));

        final ListAdapter itemsAdapter = new ListAdapter(getActivity(), list, R.color.Vladimir);

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
