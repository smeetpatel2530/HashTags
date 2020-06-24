package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Urban extends AppCompatActivity {
    private TextView textView111;
    private TextView textView112;
    private TextView textView113;
    private TextView textView114;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_urban);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Urban");
        textView111 = findViewById(R.id.textView111);
        textView111.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Urban.this,Architecture.class);
                startActivity(intent);
            }
        });
        textView112 = findViewById(R.id.textView112);
        textView112.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Urban.this,SteelArt.class);
                startActivity(intent);
            }
        });
        textView113 = findViewById(R.id.textView113);
        textView113.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Urban.this,VSCO.class);
                startActivity(intent);
            }
        });
        textView114 = findViewById(R.id.textView114);
        textView114.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Urban.this,VSCOII.class);
                startActivity(intent);
            }
        });
    }
}