package pl.chebad.bond.dam.tourguideapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

import pl.chebad.bond.dam.tourguideapp.Adapter.Adapter;
import pl.chebad.bond.dam.tourguideapp.Model.Place;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_places);

        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place("test test test", "test test test test test test test test test test test test", R.mipmap.ic_launcher_round));
        places.add(new Place("test test test", "test test test test test test test test test test test test", R.mipmap.ic_launcher_round));
        places.add(new Place("test test test", "test test test test test test test test test test test test", R.mipmap.ic_launcher_round));
        places.add(new Place("test test test", "test test test test test test test test test test test test", R.mipmap.ic_launcher_round));
        places.add(new Place("test test test", "test test test test test test test test test test test test", R.mipmap.ic_launcher_round));

        Adapter adapter = new Adapter(this, places);
        ListView listView = (ListView) findViewById(R.id.places_list_view);
        listView.setAdapter(adapter);
    }
}
