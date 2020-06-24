package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Celebrities extends AppCompatActivity {
    private TextView textView123;
    private TextView textView124;
    private TextView textView125;
    private TextView textView126;
    private TextView textView127;
    private TextView textView128;
    private TextView textView129;
    private TextView textView130;
    private TextView textView131;
    private TextView textView132;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celebrities);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Celebrities");
        textView123 = findViewById(R.id.textView123);
        textView123.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Celebrities.this,OneDirection.class);
                startActivity(intent);
            }
        });
        textView124 = findViewById(R.id.textView124);
        textView124.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Celebrities.this,JustinBieber.class);
                startActivity(intent);
            }
        });
        textView125 = findViewById(R.id.textView125);
        textView125.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Celebrities.this,LiamPayne.class);
                startActivity(intent);
            }
        });
        textView126 = findViewById(R.id.textView126);
        textView126.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Celebrities.this,TaylorSwift.class);
                startActivity(intent);
            }
        });
        textView127 = findViewById(R.id.textView127);
        textView127.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Celebrities.this,NialHoran.class);
                startActivity(intent);
            }
        });
        textView128 = findViewById(R.id.textView128);
        textView128.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Celebrities.this,Drake.class);
                startActivity(intent);
            }
        });
        textView129 = findViewById(R.id.textView129);
        textView129.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Celebrities.this,Rihanna.class);
                startActivity(intent);
            }
        });
        textView130 = findViewById(R.id.textView130);
        textView130.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Celebrities.this,SelenaGomez.class);
                startActivity(intent);
            }
        });
        textView131 = findViewById(R.id.textView131);
        textView131.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Celebrities.this,DemiLovato.class);
                startActivity(intent);
            }
        });
        textView132= findViewById(R.id.textView132);
        textView132.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Celebrities.this,ArianaGrande.class);
                startActivity(intent);
            }
        });
    }
}