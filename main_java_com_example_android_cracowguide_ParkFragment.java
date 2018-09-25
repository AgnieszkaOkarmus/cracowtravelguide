package com.example.android.cracowguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;



public class ParkFragment extends Fragment {
    public ParkFragment() {
        // Required empty public constructor
    }






    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);





        final ArrayList<Sites> places = new ArrayList<>();

        places.add(new Sites(R.drawable.ojcow, "Ojców National Park", "Ojców 9, 32-045 Sułoszowa"));
       places.add(new

               Sites(R.drawable.planty, "Planty Park", "Planty Park, 30-001 Kraków"));
       places.add(new

               Sites(R.drawable.wolski, "Wolski Forest", "Wolski Forest, 30-001 Kraków"));
       places.add(new

               Sites(R.drawable.kopiec, "Kościuszko Mound", "al. Waszyngtona 1, 30-204 Kraków"));
       places.add(new

               Sites(R.drawable.skalki, "Zakrzówek", "Zakrzówek,  30-001 Kraków"));

        SitesAdapter itemsAdapter = new SitesAdapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);

        return rootView;
    }






}
