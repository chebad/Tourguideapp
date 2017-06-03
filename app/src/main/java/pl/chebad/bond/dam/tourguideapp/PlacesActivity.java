package pl.chebad.bond.dam.tourguideapp;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import pl.chebad.bond.dam.tourguideapp.Adapter.TourGuideFragmentAdapter;

public class PlacesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_places);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        TourGuideFragmentAdapter fragmentAdapter = new TourGuideFragmentAdapter(getSupportFragmentManager());

        viewPager.setAdapter(fragmentAdapter);
    }
}
