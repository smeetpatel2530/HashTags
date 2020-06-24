package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Animals extends AppCompatActivity {
    private TextView textView104;
    private TextView textView105;
    private TextView textView106;
    private TextView textView107;
    private TextView textView108;
    private TextView textView109;
    private TextView textView110;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animals);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Animals");
        textView104 = findViewById(R.id.textView104);
        textView104.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Animals.this,GeneralAnimals.class);
                startActivity(intent);
            }
        });
        textView105 = findViewById(R.id.textView105);
        textView105.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Animals.this,Dogs.class);
                startActivity(intent);
            }
        });
        textView106 = findViewById(R.id.textView106);
        textView106.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Animals.this,Cats.class);
                startActivity(intent);
            }
        });
        textView107 = findViewById(R.id.textView107);
        textView107.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Animals.this,Horses.class);
                startActivity(intent);
            }
        });
        textView108 = findViewById(R.id.textView108);
        textView108.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Animals.this,Insects.class);
                startActivity(intent);
            }
        });
        textView109 = findViewById(R.id.textView109);
        textView109.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Animals.this,Fish.class);
                startActivity(intent);
            }
        });
        textView110 = findViewById(R.id.textView110);
        textView110.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Animals.this,Monkeys.class);
                startActivity(intent);
            }
        });
    }
}