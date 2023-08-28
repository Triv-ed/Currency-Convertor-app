package com.example.cc1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class allconvertor extends AppCompatActivity {
    Button buttonus,buttonin,buttonj,buttonc1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_allconvertor);
        buttonus = findViewById(R.id.USA1);
        buttonin = findViewById(R.id.buttonIND);
        buttonj = findViewById(R.id.buttonJPN);
        buttonc1 = findViewById(R.id.buttonCHN);

        buttonus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(allconvertor.this, usaconvert.class);
                startActivity(intent);

            }
        });
        buttonin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(allconvertor.this, Rupee.class);
                startActivity(intent);

            }
        });
        buttonj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(allconvertor.this, yenn.class);
                startActivity(intent);

            }
        });
        buttonc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(allconvertor.this, yuan.class);
                startActivity(intent);

            }
        });
    }
    }