package com.example.android.bangaloreguide;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.string.Hotel_1, R.string.Details_1, R.drawable.rest_1));
        places.add(new Place(R.string.Hotel_2, R.string.Details_2, R.drawable.rest_2));
        places.add(new Place(R.string.Hotel_3, R.string.Details_3, R.drawable.rest_3));
        places.add(new Place(R.string.Hotel_4, R.string.Details_4, R.drawable.rest_4));

        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_restaurants);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
