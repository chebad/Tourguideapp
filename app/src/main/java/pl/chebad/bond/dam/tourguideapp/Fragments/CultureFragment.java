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
public class CultureFragment extends Fragment {
    private int[] tabImageOfCulturePlaces = {
            R.drawable.cul_grave_of_unknow_soldiers,
            R.drawable.cul_lazienki_park,
            R.drawable.cul_royal_palace,
            R.drawable.cul_syren_warsaw,
            R.drawable.cul_theatre_comedy,
            R.drawable.cul_theatre_national
    };

    public CultureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);

        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.cul_tomb_of_unknown_soldier_tittle), getString(R.string.cul_tomb_of_unknown_soldier_description), tabImageOfCulturePlaces[0]));
        places.add(new Place(getString(R.string.cul_lazienki_park_tittle), getString(R.string.cul_lazienki_park_description), tabImageOfCulturePlaces[1]));
        places.add(new Place(getString(R.string.cul_royal_castle_tittle), getString(R.string.cul_royal_castle_description), tabImageOfCulturePlaces[2]));
        places.add(new Place(getString(R.string.cul_warsaw_mermaid_tittle), getString(R.string.cul_warsaw_mermaid_description), tabImageOfCulturePlaces[3]));
        places.add(new Place(getString(R.string.cul_comedy_theatre_tittle), getString(R.string.cul_warsaw_comedy_theatre_description), tabImageOfCulturePlaces[4]));
        places.add(new Place(getString(R.string.cul_national_theatre_tittle), getString(R.string.cul_warsaw_national_theatre_description), tabImageOfCulturePlaces[5]));

        Adapter adapter = new Adapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }
}
