package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Family extends AppCompatActivity {
    private TextView textView41;
    private TextView textView42;
    private TextView textView43;
    private TextView textView44;
    private TextView textView45;
    private TextView textView46;
    private TextView textView47;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Family");
        textView41 = findViewById(R.id.textView41);
        textView41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Family.this,GeneralFamily.class);
                startActivity(intent);
            }
        });
        textView42 = findViewById(R.id.textView42);
        textView42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Family.this,Babies.class);
                startActivity(intent);
            }
        });
        textView43 = findViewById(R.id.textView43);
        textView43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Family.this,Kids.class);
                startActivity(intent);
            }
        });
        textView44 = findViewById(R.id.textView44);
        textView44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Family.this,Dad.class);
                startActivity(intent);
            }
        });
        textView45 = findViewById(R.id.textView45);
        textView45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Family.this,Sister.class);
                startActivity(intent);
            }
        });
        textView46 = findViewById(R.id.textView46);
        textView46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Family.this,Brother.class);
                startActivity(intent);
            }
        });
        textView47 = findViewById(R.id.textView47);
        textView47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Family.this,Mom.class);
                startActivity(intent);
            }
        });
    }
}