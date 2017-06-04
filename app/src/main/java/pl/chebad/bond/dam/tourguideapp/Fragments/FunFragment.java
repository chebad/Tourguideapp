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
public class FunFragment extends Fragment {
    private int[] tabImageOfFunPlaces = {
            R.drawable.fun_beach_warsaw,
            R.drawable.fun_bowling,
            R.drawable.fun_ice_skating,
            R.drawable.fun_warsaw_clubs,
    };

    public FunFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);

        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.fun_beach_warsaw_tittle), getString(R.string.fun_beach_warsaw_description), tabImageOfFunPlaces[0]));
        places.add(new Place(getString(R.string.fun_bowling_warsaw_tittle), getString(R.string.fun_warsaw_bowling_description), tabImageOfFunPlaces[1]));
        places.add(new Place(getString(R.string.fun_ice_skating_tittle), getString(R.string.fun_ice_skating_description), tabImageOfFunPlaces[2]));
        places.add(new Place(getString(R.string.fun_warsaw_clubs_tittle), getString(R.string.fun_warsaw_clubs_description), tabImageOfFunPlaces[3]));

        Adapter adapter = new Adapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }
}