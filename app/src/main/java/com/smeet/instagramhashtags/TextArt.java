package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class TextArt extends AppCompatActivity {
    private TextView textView136;
    private TextView textView137;
    private TextView textView138;
    private TextView textView139;
    private TextView textView140;
    private TextView textView141;
    private TextView textView142;
    private TextView textView143;
    private TextView textView144;
    private TextView textView145;
    private TextView textView146;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_art);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Text Art");
        textView136 = findViewById(R.id.textView136);
        textView136.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextArt.this,Memes.class);
                startActivity(intent);
            }
        });
        textView137 = findViewById(R.id.textView137);
        textView137.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextArt.this,Animalss.class);
                startActivity(intent);
            }
        });
        textView138 = findViewById(R.id.textView138);
        textView138.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextArt.this,Chars.class);
                startActivity(intent);
            }
        });
        textView139 = findViewById(R.id.textView139);
        textView139.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextArt.this,Logos.class);
                startActivity(intent);
            }
        });
        textView140 = findViewById(R.id.textView140);
        textView140.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextArt.this,Tattooss.class);
                startActivity(intent);
            }
        });
        textView141 = findViewById(R.id.textView141);
        textView141.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextArt.this,Sports.class);
                startActivity(intent);
            }
        });
        textView142 = findViewById(R.id.textView142);
        textView142.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextArt.this,Building.class);
                startActivity(intent);
            }
        });
        textView143 = findViewById(R.id.textView143);
        textView143.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextArt.this,Transports.class);
                startActivity(intent);
            }
        });
        textView144 = findViewById(R.id.textView144);
        textView144.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextArt.this,Stuff.class);
                startActivity(intent);
            }
        });
        textView145 = findViewById(R.id.textView145);
        textView145.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextArt.this,Musics.class);
                startActivity(intent);
            }
        });
        textView146 = findViewById(R.id.textView146);
        textView146.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TextArt.this,Loves.class);
                startActivity(intent);
            }
        });
    }
}