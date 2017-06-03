package pl.chebad.bond.dam.tourguideapp.Animation;

import android.view.animation.Interpolator;

/**
 * Created by Damian Bondaruk on 2017-06-03.
 */

public class BounceInterpolator implements Interpolator {
    private double mAmplitude = 1;
    private double mFrequency = 10;

    public BounceInterpolator(double amplitude, double frequency) {
        mAmplitude = amplitude;
        mFrequency = frequency;
    }

    @Override
    public float getInterpolation(float time) {
        return (float) (-1 * Math.pow(Math.E, -time / mAmplitude) * Math.cos(mFrequency * time) + 1);
    }
}
