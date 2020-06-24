package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TravelActiveSports extends AppCompatActivity {
    private TextView textView147;
    private TextView textView148;
    private TextView textView149;
    private TextView textView150;
    private TextView textView151;
    private TextView textView152;
    private TextView textView153;
    private TextView textView154;
    private TextView textView155;
    private TextView textView156;
    private TextView textView157;
    private TextView textView158;
    private TextView textView159;
    private TextView textView160;
    private TextView textView161;
    private TextView textView162;
    private TextView textView163;
    private TextView textView164;
    private TextView textView165;
    private TextView textView166;
    private TextView textView167;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_active_sports);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Travel/Active/Sports");
        textView147 = findViewById(R.id.textView147);
        textView147.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Travel.class);
                startActivity(intent);
            }
        });
        textView148 = findViewById(R.id.textView148);
        textView148.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Cars.class);
                startActivity(intent);
            }
        });
        textView149 = findViewById(R.id.textView149);
        textView149.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Motorcycles.class);
                startActivity(intent);
            }
        });
        textView150 = findViewById(R.id.textView150);
        textView150.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,SkateBoarding.class);
                startActivity(intent);
            }
        });
        textView151 = findViewById(R.id.textView151);
        textView151.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,HealthFitness.class);
                startActivity(intent);
            }
        });
        textView152 = findViewById(R.id.textView152);
        textView152.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Bodybuilding.class);
                startActivity(intent);
            }
        });
        textView153 = findViewById(R.id.textView153);
        textView153.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Sport.class);
                startActivity(intent);
            }
        });
        textView154 = findViewById(R.id.textView154);
        textView154.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Running.class);
                startActivity(intent);
            }
        });
        textView155 = findViewById(R.id.textView155);
        textView155.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Dance.class);
                startActivity(intent);
            }
        });
        textView156 = findViewById(R.id.textView156);
        textView156.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Cheerleading.class);
                startActivity(intent);
            }
        });
        textView157 = findViewById(R.id.textView157);
        textView157.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Gymnastics.class);
                startActivity(intent);
            }
        });
        textView158 = findViewById(R.id.textView158);
        textView158.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Basketball.class);
                startActivity(intent);
            }
        });
        textView159 = findViewById(R.id.textView159);
        textView159.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Soccer.class);
                startActivity(intent);
            }
        });
        textView160 = findViewById(R.id.textView160);
        textView160.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Football.class);
                startActivity(intent);
            }
        });
        textView161 = findViewById(R.id.textView161);
        textView161.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Baseball.class);
                startActivity(intent);
            }
        });
        textView162 = findViewById(R.id.textView162);
        textView162.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Hockey.class);
                startActivity(intent);
            }
        });
        textView163 = findViewById(R.id.textView163);
        textView163.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Volleyball.class);
                startActivity(intent);
            }
        });
        textView164 = findViewById(R.id.textView164);
        textView164.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Rugby.class);
                startActivity(intent);
            }
        });
        textView165 = findViewById(R.id.textView165);
        textView165.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,SuperBowl.class);
                startActivity(intent);
            }
        });
        textView166 = findViewById(R.id.textView166);
        textView166.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,HealthandFitness.class);
                startActivity(intent);
            }
        });
        textView167 = findViewById(R.id.textView167);
        textView167.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TravelActiveSports.this,Swimming.class);
                startActivity(intent);
            }
        });


    }
}