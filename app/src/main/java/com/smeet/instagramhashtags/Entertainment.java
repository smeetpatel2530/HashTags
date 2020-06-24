package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Entertainment extends AppCompatActivity {
    private TextView textView85;
    private TextView textView86;
    private TextView textView87;
    private TextView textView88;
    private TextView textView89;
    private TextView textView90;
    private TextView textView91;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entertainment);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Entertainment");
        textView85 = findViewById(R.id.textView85);
        textView85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entertainment.this,Music.class);
                startActivity(intent);
            }
        });

        textView86 = findViewById(R.id.textView86);
        textView86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entertainment.this,Movies.class);
                startActivity(intent);
            }
        });
        textView87 = findViewById(R.id.textView87);
        textView87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entertainment.this,Books.class);
                startActivity(intent);
            }
        });
        textView88 = findViewById(R.id.textView88);
        textView88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entertainment.this,VideoGames.class);
                startActivity(intent);
            }
        });
        textView89 = findViewById(R.id.textView89);
        textView89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entertainment.this,Anime.class);
                startActivity(intent);
            }
        });
        textView90 = findViewById(R.id.textView90);
        textView90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entertainment.this,Disney.class);
                startActivity(intent);
            }
        });
        textView91 = findViewById(R.id.textView91);
        textView91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Entertainment.this,Kpop.class);
                startActivity(intent);
            }
        });
    }
}