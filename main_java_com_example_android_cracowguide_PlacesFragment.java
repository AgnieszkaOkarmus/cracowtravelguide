package com.example.android.cracowguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class PlacesFragment extends Fragment {


    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);


        final ArrayList<Sites> places = new ArrayList<>();

        places.add(new Sites(R.drawable.wawel, "Wawel Castle", "Wawel 5, 31-001 Kraków"));
       places.add(new

               Sites(R.drawable.old_city, "Kraków Old City", "Rynek Główny 1-3, 30-001 Kraków"));
       places.add(new

               Sites(R.drawable.kazimierz, "Kazimierz, The Old Jewish Quarter", "plac Nowy, 133-332 Kraków"));
       places.add(new

               Sites(R.drawable.bulwary, "Vistulan Boulevards in Kraków", "Bulwary Wiślane, 30-001 Kraków"));
       places.add(new

               Sites(R.drawable.blonie, "Błonia Park", "Błonia, 30-001 Kraków"));

        SitesAdapter itemsAdapter = new SitesAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }
}





