package com.ahmed.eslam.android.gymapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bicebsBtn , tricbsBtn ,legsBtn ,chestBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bicebsBtn = (Button) findViewById(R.id.button);
        tricbsBtn= (Button) findViewById(R.id.button2);
        chestBtn= (Button) findViewById(R.id.button3);
        legsBtn = (Button) findViewById(R.id.button4);


        legsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent legs = new Intent(getBaseContext(),LegsActivity.class);

                startActivity(legs);
            }
        });
        chestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent chest = new Intent(getBaseContext(),ChestActivity.class);

                startActivity(chest);
            }
        });
        bicebsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bicebs = new Intent(getBaseContext(),BiActivity.class);

                startActivity(bicebs);
            }
        });
        tricbsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent tri = new Intent(getBaseContext(),TriActivity.class);

                startActivity(tri);
            }
        });



    }
}
