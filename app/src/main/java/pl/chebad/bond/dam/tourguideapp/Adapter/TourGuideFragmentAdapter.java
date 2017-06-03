package pl.chebad.bond.dam.tourguideapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import pl.chebad.bond.dam.tourguideapp.Fragments.CultureFragment;
import pl.chebad.bond.dam.tourguideapp.Fragments.EducationFragment;
import pl.chebad.bond.dam.tourguideapp.Fragments.FunFragment;
import pl.chebad.bond.dam.tourguideapp.Fragments.HealthActivitiesFragment;
import pl.chebad.bond.dam.tourguideapp.Fragments.RestaurantFragment;

/**
 * Created by Damian Bondaruk on 2017-06-03.
 */

public class TourGuideFragmentAdapter extends FragmentPagerAdapter {
    public TourGuideFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0: {
                fragment = new FunFragment();
                break;
            }
            case 1: {
                fragment = new CultureFragment();
                break;
            }
            case 2: {
                fragment = new HealthActivitiesFragment();
                break;
            }
            case 3: {
                fragment = new EducationFragment();
                break;
            }
            case 4: {
                fragment = new RestaurantFragment();
                break;
            }
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 5;
    }
}