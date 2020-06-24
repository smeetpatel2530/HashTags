package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WeatherSeasons extends AppCompatActivity {
    private TextView textView96;
    private TextView textView97;
    private TextView textView98;
    private TextView textView99;
    private TextView textView100;
    private TextView textView101;
    private TextView textView102;
    private TextView textView103;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_seasons);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Weather/Seasons");
        textView96 = findViewById(R.id.textView96);
        textView96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeatherSeasons.this,Sunny.class);
                startActivity(intent);
            }
        });
        textView97 = findViewById(R.id.textView97);
        textView97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeatherSeasons.this,Cloudy.class);
                startActivity(intent);
            }
        });
        textView98 = findViewById(R.id.textView98);
        textView98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeatherSeasons.this,Raining.class);
                startActivity(intent);
            }
        });
        textView99 = findViewById(R.id.textView99);
        textView99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeatherSeasons.this,Snowing.class);
                startActivity(intent);
            }
        });
        textView100 = findViewById(R.id.textView100);
        textView100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeatherSeasons.this,Spring.class);
                startActivity(intent);
            }
        });
        textView101= findViewById(R.id.textView101);
        textView101.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeatherSeasons.this,Summer.class);
                startActivity(intent);
            }
        });
        textView102 = findViewById(R.id.textView102);
        textView102.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeatherSeasons.this,Fall.class);
                startActivity(intent);
            }
        });
        textView103 = findViewById(R.id.textView103);
        textView103.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WeatherSeasons.this,Winter.class);
                startActivity(intent);
            }
        });

    }
}