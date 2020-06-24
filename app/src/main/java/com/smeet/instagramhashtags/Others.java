package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Others extends AppCompatActivity {
    private TextView textView173;
    private TextView textView174;
    private TextView textView175;
    private TextView textView176;
    private TextView textView177;
    private TextView textView178;
    private TextView textView179;
    private TextView textView180;
    private TextView textView181;
    private TextView textView182;
    private TextView textView183;
    private TextView textView184;
    private TextView textView185;
    private TextView textView186;
    private TextView textView187;
    private TextView textView188;
    private TextView textView189;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_others);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Others");
        textView173 = findViewById(R.id.textView173);
        textView173.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,School.class);
                startActivity(intent);
            }
        });
        textView174 = findViewById(R.id.textView174);
        textView174.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Work.class);
                startActivity(intent);
            }
        });
        textView175 = findViewById(R.id.textView175);
        textView175.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Funny.class);
                startActivity(intent);
            }
        });
        textView176 = findViewById(R.id.textView176);
        textView176.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Quotes.class);
                startActivity(intent);
            }
        });
        textView177 = findViewById(R.id.textView177);
        textView177.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Poetry.class);
                startActivity(intent);
            }
        });
        textView178 = findViewById(R.id.textView178);
        textView178.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Kik.class);
                startActivity(intent);
            }
        });
        textView179 = findViewById(R.id.textView179);
        textView179.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Tumblr.class);
                startActivity(intent);
            }
        });
        textView180 = findViewById(R.id.textView180);
        textView180.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Snapchat.class);
                startActivity(intent);
            }
        });
        textView181 = findViewById(R.id.textView181);
        textView181.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,AskFm.class);
                startActivity(intent);
            }
        });
        textView182 = findViewById(R.id.textView182);
        textView182.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Moneys.class);
                startActivity(intent);
            }
        });
        textView183 = findViewById(R.id.textView183);
        textView183.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Colorss.class);
                startActivity(intent);
            }
        });
        textView184= findViewById(R.id.textView184);
        textView184.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Spiritual.class);
                startActivity(intent);
            }
        });
        textView185 = findViewById(R.id.textView185);
        textView185.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Hijab.class);
                startActivity(intent);
            }
        });
        textView186 = findViewById(R.id.textView186);
        textView186.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Lyrics.class);
                startActivity(intent);
            }
        });
        textView187 = findViewById(R.id.textView187);
        textView187.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,ForPartyPeople.class);
                startActivity(intent);
            }
        });
        textView188 = findViewById(R.id.textView188);
        textView188.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Fitness.class);
                startActivity(intent);
            }
        });
        textView189 = findViewById(R.id.textView189);
        textView189.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Others.this,Truth.class);
                startActivity(intent);
            }
        });
    }
}