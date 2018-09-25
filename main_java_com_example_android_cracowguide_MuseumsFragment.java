package com.example.android.cracowguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class MuseumsFragment extends Fragment {



    public MuseumsFragment() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);





        final ArrayList<Sites> places = new ArrayList<>();

        places.add(new Sites(R.drawable.podziemia, "Rynek underground", "Rynek Główny 1, 31-042 Kraków"));
        places.add(new

               Sites(R.drawable.sukiennice, "Sukiennice Museum", "Rynek Główny 3, 31-042 Kraków"));
      places.add(new

              Sites(R.drawable.czartoryscy, "Czartoryski Museum", "św. Jana 19, 31-017 Kraków"));
        places.add(new

                Sites(R.drawable.prl, "PRL Museum", "os. Centrum E 1, 31-934 Kraków"));
      places.add(new

              Sites(R.drawable.fabryka, "Oskar Schindler's Enamel Factory", "Lipowa 4, 30-702 Kraków"));

        SitesAdapter itemsAdapter = new SitesAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }





}