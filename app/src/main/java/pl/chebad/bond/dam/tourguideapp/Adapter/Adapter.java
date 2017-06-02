package pl.chebad.bond.dam.tourguideapp.Adapter;

import android.content.Context;
import android.widget.ArrayAdapter;

import pl.chebad.bond.dam.tourguideapp.Model.ModPlace;

/**
 * Created by Damian Bondaruk on 2017-06-02.
 */

public class Adapter extends ArrayAdapter<ModPlace> {
    public Adapter(Context context, int resource, int activityColorId) {
        super(context, resource);
    }

    public Adapter(Context context, int resource) {
        super(context, resource);
    }
}
