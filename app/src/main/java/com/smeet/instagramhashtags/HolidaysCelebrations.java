package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class HolidaysCelebrations extends AppCompatActivity {
    private TextView textView51;
    private TextView textView52;
    private TextView textView53;
    private TextView textView54;
    private TextView textView55;
    private TextView textView56;
    private TextView textView57;
    private TextView textView58;
    private TextView textView59;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holidays_celebrations);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Holiday/Celebrations");
        textView51 = findViewById(R.id.textView51);
        textView51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HolidaysCelebrations.this,Birthday.class);
                startActivity(intent);
            }
        });
        textView52 = findViewById(R.id.textView52);
        textView52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HolidaysCelebrations.this,Wedding.class);
                startActivity(intent);
            }
        });
        textView53 = findViewById(R.id.textView53);
        textView53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HolidaysCelebrations.this,ThanksGiving.class);
                startActivity(intent);
            }
        });
        textView54 = findViewById(R.id.textView54);
        textView54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HolidaysCelebrations.this,Halloween.class);
                startActivity(intent);
            }
        });
        textView55 = findViewById(R.id.textView55);
        textView55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HolidaysCelebrations.this,FireWork.class);
                startActivity(intent);
            }
        });
        textView56 = findViewById(R.id.textView56);
        textView56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HolidaysCelebrations.this,BlackFriday.class);
                startActivity(intent);
            }
        });
        textView57 = findViewById(R.id.textView57);
        textView57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HolidaysCelebrations.this,Christmas.class);
                startActivity(intent);
            }
        });
        textView58 = findViewById(R.id.textView58);
        textView58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HolidaysCelebrations.this,NewYearsDay.class);
                startActivity(intent);
            }
        });
        textView59 = findViewById(R.id.textView59);
        textView59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HolidaysCelebrations.this,Holiday.class);
                startActivity(intent);
            }
        });
    }
}