package com.example.android.cracowguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class EatingFragment extends Fragment {
    public EatingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);


        final ArrayList<Sites> places = new ArrayList<>();

        places.add(new Sites(R.drawable.zapiekanki, "Endzior", "plac Nowy 4B, 31-056 Kraków"));
       places.add(new

               Sites(R.drawable.frytki, "Belgian Fries in Kraków", "Świętego Wawrzyńca 16, 31-060 Kraków"));
      places.add(new

              Sites(R.drawable.lody, "Polish Icecreams ", "Starowiślna 83, 33-332 Kraków"));
      places.add(new

              Sites(R.drawable.obwarzanek, "Interactive Museum of Obwarzanek", "ul. I.Paderewskiego 4, 31-157 Kraków"));
       places.add(new

               Sites(R.drawable.mlyny, "Chillout Time", "Dolnych Młynów 10, 33-332 Kraków"));

        SitesAdapter itemsAdapter = new SitesAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);


        return rootView;
    }
}





