package pl.chebad.bond.dam.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import pl.chebad.bond.dam.tourguideapp.Adapter.TourGuideFragmentAdapter;

public class PlacesActivity extends AppCompatActivity {
    private int[] tabIcons = {
            R.drawable.tab_color_selector_culture,
            R.drawable.tab_color_selector_fun,
            R.drawable.tab_color_selector_health_activity,
            R.drawable.tab_color_selector_restaurant,
            R.drawable.tab_color_selector_school
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_places);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.sliding_tabs);
        TourGuideFragmentAdapter fragmentAdapter = new TourGuideFragmentAdapter(getSupportFragmentManager());

        getSupportActionBar().setElevation(0);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        viewPager.setAdapter(fragmentAdapter);
        tabLayout.setupWithViewPager(viewPager);

        for (int i = 0; i < tabIcons.length; i++) {
            tabLayout.getTabAt(i).setIcon(tabIcons[i]);
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}