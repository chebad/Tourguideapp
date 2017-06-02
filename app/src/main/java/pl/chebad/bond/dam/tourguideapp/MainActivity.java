package pl.chebad.bond.dam.tourguideapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tourMeButton = (Button) findViewById(R.id.tour_me_button);

        tourMeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNewActivity = new Intent(getBaseContext(), PlacesActivity.class);
                startActivity(openNewActivity);
            }
        });
    }
}
