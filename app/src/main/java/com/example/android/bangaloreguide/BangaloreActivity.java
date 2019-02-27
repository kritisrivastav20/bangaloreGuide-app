package com.example.android.bangaloreguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BangaloreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bangalore);

        Button explore = (Button) findViewById(R.id.explore);

        // Set a click listener on the button
        explore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent explore = new Intent(BangaloreActivity.this, EntertainmentActivity.class);
                startActivity(explore);
            }
        });
    }
}
