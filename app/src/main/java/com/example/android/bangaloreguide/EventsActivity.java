package com.example.android.bangaloreguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EventsActivity extends AppCompatActivity {

        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.list);

            // Create a list of places
            final ArrayList<Place> places = new ArrayList<Place>();

            places.add(new Place(R.string.events_1, R.string.events1, R.drawable.events_1));
            places.add(new Place(R.string.events_2, R.string.events2, R.drawable.events_2));
            places.add(new Place(R.string.events_3, R.string.events3, R.drawable.events_3));
            places.add(new Place(R.string.events_4, R.string.events4, R.drawable.events_4));


            PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_events);

            ListView listView = (ListView) findViewById(R.id.list);
            listView.setAdapter(adapter);
        }
    }
