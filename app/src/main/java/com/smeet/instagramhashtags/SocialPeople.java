package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SocialPeople extends AppCompatActivity {
    private TextView textView115;
    private TextView textView116;
    private TextView textView117;
    private TextView textView118;
    private TextView textView119;
    private TextView textView120;
    private TextView textView121;
    private TextView textView122;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social_people);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Social/People");
        textView115 = findViewById(R.id.textView115);
        textView115.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialPeople.this,GeneralSocial.class);
                startActivity(intent);
            }
        });
        textView116 = findViewById(R.id.textView116);
        textView116.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialPeople.this,Selfies.class);
                startActivity(intent);
            }
        });
        textView117 = findViewById(R.id.textView117);
        textView117.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialPeople.this,Girls.class);
                startActivity(intent);
            }
        });
        textView118 = findViewById(R.id.textView118);
        textView118.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialPeople.this,Boys.class);
                startActivity(intent);
            }
        });
        textView119 = findViewById(R.id.textView119);
        textView119.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialPeople.this,Love.class);
                startActivity(intent);
            }
        });
        textView120 = findViewById(R.id.textView120);
        textView120.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialPeople.this,Friends.class);
                startActivity(intent);
            }
        });
        textView121 = findViewById(R.id.textView121);
        textView121.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialPeople.this,GoodMorning.class);
                startActivity(intent);
            }
        });
        textView122 = findViewById(R.id.textView122);
        textView122.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SocialPeople.this,GoodNight.class);
                startActivity(intent);
            }
        });
    }
}