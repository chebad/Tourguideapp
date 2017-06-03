package pl.chebad.bond.dam.tourguideapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import pl.chebad.bond.dam.tourguideapp.Fragments.FunFragment;

/**
 * Created by Damian Bondaruk on 2017-06-03.
 */

public class TourGuideFragmentAdapter extends FragmentPagerAdapter {
    public TourGuideFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new FunFragment();
    }

    @Override
    public int getCount() {
        return 1;
    }
}
