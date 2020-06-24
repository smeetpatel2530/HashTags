package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Fashion extends AppCompatActivity {
    private TextView textView71;
    private TextView textView72;
    private TextView textView73;
    private TextView textView74;
    private TextView textView75;
    private TextView textView76;
    private TextView textView77;
    private TextView textView78;
    private TextView textView79;
    private TextView textView80;
    private TextView textView81;
    private TextView textView82;
    private TextView textView83;
    private TextView textView84;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fashion);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Fashion");
        textView71 = findViewById(R.id.textView71);
        textView71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,GeneralFashion.class);
                startActivity(intent);
            }
        });
        textView72 = findViewById(R.id.textView72);
        textView72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,FashionGirls.class);
                startActivity(intent);
            }
        });
        textView73 = findViewById(R.id.textView73);
        textView73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,FashionBoys.class);
                startActivity(intent);
            }
        });
        textView74 = findViewById(R.id.textView74);
        textView74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,OOTD.class);
                startActivity(intent);
            }
        });
        textView75 = findViewById(R.id.textView75);
        textView75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,Nails.class);
                startActivity(intent);
            }
        });
        textView76 = findViewById(R.id.textView76);
        textView76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,Hair.class);
                startActivity(intent);
            }
        });
        textView77 = findViewById(R.id.textView77);
        textView77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,Makeup.class);
                startActivity(intent);
            }
        });
        textView78 = findViewById(R.id.textView78);
        textView78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,Jewellery.class);
                startActivity(intent);
            }
        });
        textView79 = findViewById(R.id.textView79);
        textView79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,Bracelets.class);
                startActivity(intent);
            }
        });
        textView80 = findViewById(R.id.textView80);
        textView80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,Earnings.class);
                startActivity(intent);
            }
        });
        textView81 = findViewById(R.id.textView81);
        textView81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,HighHeels.class);
                startActivity(intent);
            }
        });
        textView82= findViewById(R.id.textView82);
        textView82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,Sneakers.class);
                startActivity(intent);
            }
        });
        textView83 = findViewById(R.id.textView83);
        textView83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,Tattoos.class);
                startActivity(intent);
            }
        });
        textView84 = findViewById(R.id.textView84);
        textView84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Fashion.this,Piercings.class);
                startActivity(intent);
            }
        });

    }
}