package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Nature extends AppCompatActivity {
    private TextView textView92;
    private TextView textView93;
    private TextView textView94;
    private TextView textView95;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nature);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Nature");
        textView92 = findViewById(R.id.textView92);
        textView92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Nature.this,GeneralNature.class);
                startActivity(intent);
            }
        });
        textView93 = findViewById(R.id.textView93);
        textView93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Nature.this,Beach.class);
                startActivity(intent);
            }
        });
        textView94 = findViewById(R.id.textView94);
        textView94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Nature.this,SunsetSunrise.class);
                startActivity(intent);
            }
        });
        textView95 = findViewById(R.id.textView95);
        textView95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Nature.this,Flowers.class);
                startActivity(intent);
            }
        });
    }
}