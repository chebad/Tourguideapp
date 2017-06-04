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
public class EducationFragment extends Fragment {
    private int[] tabImageOfEducationPlaces = {
            R.drawable.edu_army,
            R.drawable.edu_copernicus,
            R.drawable.edu_national,
            R.drawable.edu_pawiak,
            R.drawable.edu_uprising
    };

    public EducationFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);

        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.edu_museum_polish_army_tittle), getString(R.string.edu_museum_polish_army_description), tabImageOfEducationPlaces[0]));
        places.add(new Place(getString(R.string.edu_copernicus_science_centre_tittle), getString(R.string.edu_copernicus_science_centre_description), tabImageOfEducationPlaces[1]));
        places.add(new Place(getString(R.string.edu_national_museum_tittle), getString(R.string.edu_national_museum_description), tabImageOfEducationPlaces[2]));
        places.add(new Place(getString(R.string.edu_national_museum_tittle), getString(R.string.edu_museum_of_prison_pawiak_description), tabImageOfEducationPlaces[3]));
        places.add(new Place(getString(R.string.edu_warsaw_uprising_museum_tittle), getString(R.string.edu_warsaw_uprising_museum_description), tabImageOfEducationPlaces[4]));

        Adapter adapter = new Adapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }
}