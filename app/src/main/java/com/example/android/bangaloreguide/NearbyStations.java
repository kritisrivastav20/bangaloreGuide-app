package com.example.android.bangaloreguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NearbyStations extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.list);

            // Create a list of places
            final ArrayList<Place> places = new ArrayList<Place>();

            places.add(new Place(R.string.nearby_1, R.string.nearby1, R.drawable.nearby_1));
            places.add(new Place(R.string.nearby_2, R.string.nearby2, R.drawable.nearby_2));
            places.add(new Place(R.string.nearby_3, R.string.nearby3, R.drawable.nearby_3));
            places.add(new Place(R.string.nearby_4, R.string.nearby4, R.drawable.nearby_4));


            PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_nearby);

            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(adapter);
        }
    }