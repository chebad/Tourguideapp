package pl.chebad.bond.dam.tourguideapp.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import pl.chebad.bond.dam.tourguideapp.Model.Place;
import pl.chebad.bond.dam.tourguideapp.R;

/**
 * Created by Damian Bondaruk on 2017-06-02.
 */

public class Adapter extends ArrayAdapter<Place> {
    private final int NO_COLOR_PROVIDED = -1;
    private int mColorResourceId = NO_COLOR_PROVIDED;

    public Adapter(Context context, ArrayList<Place> places, int activityColorId) {
        super(context, 0, places);

        mColorResourceId = activityColorId;
    }

    public Adapter(Context context, ArrayList<Place> places) {
        super(context, 0, places);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.model_place, parent, false
            );
        }

        Place currentPlace = getItem(position);
        TextView simpleInformation = (TextView) listItemView.findViewById(R.id.simple_information_view);
        TextView moreInformation = (TextView) listItemView.findViewById(R.id.more_information_view);
        ImageView imagePlace = (ImageView) listItemView.findViewById(R.id.image_view);
        RelativeLayout relativeLayout = (RelativeLayout) listItemView.findViewById(R.id.relative_model_place);

        simpleInformation.setText(currentPlace.getSimpleInformation());
        moreInformation.setText(currentPlace.getExplication());
        if (currentPlace.hasImage()) {
            imagePlace.setImageResource(currentPlace.getPictureID());
            imagePlace.setVisibility(View.VISIBLE);
        } else {

            imagePlace.setVisibility(View.GONE);
        }

        if (mColorResourceId != NO_COLOR_PROVIDED) {
            relativeLayout.setBackgroundColor(mColorResourceId);
        }

        return listItemView;
    }
}