package pl.chebad.bond.dam.tourguideapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import pl.chebad.bond.dam.tourguideapp.Adapter.Adapter;
import pl.chebad.bond.dam.tourguideapp.Model.Place;
import pl.chebad.bond.dam.tourguideapp.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HealthActivitiesFragment extends Fragment {
    private int[] tabHealthActivityPlaces = {
            R.drawable.heath_national_stadium,
            R.drawable.heath_orlen_marathon,
            R.drawable.heath_vetrurilo,
            R.drawable.heath_wodny_park
    };

    public HealthActivitiesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);

        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.health_national_stadium_tittle), getString(R.string.health_national_stadium_description), tabHealthActivityPlaces[0]));
        places.add(new Place(getString(R.string.health_orlen_marathon_tittle), getString(R.string.health_orlen_marathon_description), tabHealthActivityPlaces[1]));
        places.add(new Place(getString(R.string.health_veturilo_tittle), getString(R.string.health_verturilo_bikes_description), tabHealthActivityPlaces[2]));
        places.add(new Place(getString(R.string.health_wodny_park_tittle), getString(R.string.health_wodny_park_description), tabHealthActivityPlaces[3]));

        Adapter adapter = new Adapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }
}