package com.example.android.tourguide_moscow_ni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
Button explore = findViewById(R.id.button);
explore.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent exploreIntent = new Intent(MainActivity.this, ExploreActivity.class);
        startActivity(exploreIntent);
    }
});
    }

}
