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
public class RestaurantFragment extends Fragment {
    private int[] tabImageOfRestaurantsPlaces = {
            R.drawable.rest_amber_room,
            R.drawable.rest_rozana,
            R.drawable.rest_platter,
            R.drawable.rest_amrit_oriental,
    };

    public RestaurantFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.list_places, container, false);

        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(getString(R.string.rest_amber_room_tittle), getString(R.string.rest_amber_room_description), tabImageOfRestaurantsPlaces[0]));
        places.add(new Place(getString(R.string.rest_rozana_tittle), getString(R.string.rest_rozana_description), tabImageOfRestaurantsPlaces[1]));
        places.add(new Place(getString(R.string.rest_platter_tittle), getString(R.string.rest_platter_description), tabImageOfRestaurantsPlaces[2]));
        places.add(new Place(getString(R.string.rest_amrit_oriental_tittle), getString(R.string.rest_amrit_oriental_description), tabImageOfRestaurantsPlaces[3]));

        Adapter adapter = new Adapter(getActivity(), places);
        ListView listView = (ListView) rootView.findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);

        return rootView;
    }
}