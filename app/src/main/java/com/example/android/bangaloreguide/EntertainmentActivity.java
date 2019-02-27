package com.example.android.bangaloreguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class EntertainmentActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list);

        // Create a list of places
        final ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(R.string.Place_1, R.string.Desc_1, R.drawable.enter_1));
        places.add(new Place(R.string.Place_2, R.string.Desc_2, R.drawable.enter_2));
        places.add(new Place(R.string.Place_3, R.string.Desc_3, R.drawable.enter_3));
        places.add(new Place(R.string.Place_4, R.string.Desc_4, R.drawable.enter_4));


        PlaceAdapter adapter = new PlaceAdapter(this, places, R.color.category_entertainment);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}

