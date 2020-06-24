package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Food extends AppCompatActivity {
    private TextView textView61;
    private TextView textView62;
    private TextView textView63;
    private TextView textView64;
    private TextView textView65;
    private TextView textView66;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Food");
        textView61 = findViewById(R.id.textView61);
        textView61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this,FoodGeneral.class);
                startActivity(intent);
            }
        });
        textView62 = findViewById(R.id.textView62);
        textView62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this,Dessert.class);
                startActivity(intent);
            }
        });
        textView63 = findViewById(R.id.textView63);
        textView63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this,Drinks.class);
                startActivity(intent);
            }
        });
        textView64 = findViewById(R.id.textView64);
        textView64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this,Coffee.class);
                startActivity(intent);
            }
        });
        textView65 = findViewById(R.id.textView65);
        textView65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this,Tea.class);
                startActivity(intent);
            }
        });
        textView66 = findViewById(R.id.textView66);
        textView66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Food.this,FastFood.class);
                startActivity(intent);
            }
        });
    }
}