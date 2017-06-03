package pl.chebad.bond.dam.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

import pl.chebad.bond.dam.tourguideapp.Animation.BounceInterpolator;

public class MainActivity extends AppCompatActivity {
    private long mLastClickTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button tourMeButton = (Button) findViewById(R.id.tour_me_button);

        tourMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final long delay = 500L;
                final double amplitude = 0.15;
                final long frequency = 27;
                // mis-clicking prevention, using threshold of delay variable
                if (SystemClock.elapsedRealtime() - mLastClickTime < delay) {
                    return;
                }
                mLastClickTime = SystemClock.elapsedRealtime();

                Animation animation = AnimationUtils.loadAnimation(getBaseContext(), R.anim.bounce);
                BounceInterpolator interpolator = new BounceInterpolator(amplitude, frequency);
                animation.setInterpolator(interpolator);
                tourMeButton.startAnimation(animation);
                tourMeButton.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent openNewActivity = new Intent(getBaseContext(), PlacesActivity.class);
                        startActivity(openNewActivity);
                    }
                }, delay);
            }
        });
    }
}