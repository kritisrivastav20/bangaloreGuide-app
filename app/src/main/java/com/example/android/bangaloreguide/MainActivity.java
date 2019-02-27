package com.example.android.bangaloreguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView restaurant = (TextView) findViewById(R.id.restaurant);

        // Set a click listener on that View
        restaurant.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent restaurant = new Intent(MainActivity.this, RestaurantsActivity.class);
                startActivity(restaurant);
            }
        });
        TextView city = (TextView) findViewById(R.id.city);
        // Set a click listener on that View
        city.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent city = new Intent(MainActivity.this, BangaloreActivity.class);
                // Start the new activity
                startActivity(city);
            }
        });
        TextView entert = (TextView) findViewById(R.id.entertainment);
        // Set a click listener on that View
        entert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent entert = new Intent(MainActivity.this, EntertainmentActivity.class);
                // Start the new activity
                startActivity(entert);
            }
        });

        TextView events = (TextView) findViewById(R.id.events);
        // Set a click listener on that View
        events.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent events = new Intent(MainActivity.this, EventsActivity.class);
                // Start the new activity
                startActivity(events);
            }
        });

        TextView nearby = (TextView) findViewById(R.id.nearby);
        // Set a click listener on that View
        nearby.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent nearby = new Intent(MainActivity.this, NearbyStations.class);
                // Start the new activity
                startActivity(nearby);
            }
        });

        TextView share = (TextView) findViewById(R.id.share);
        // Set a click listener on that View
        share.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = "Gives you all the information about fun places and tourist spots.";
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Bangalore Guide app");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share via"));
            }
        });
    }
}

