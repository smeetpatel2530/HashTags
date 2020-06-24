package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Electronics extends AppCompatActivity {
    private TextView textView133;
    private TextView textView134;
    private TextView textView135;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electronics);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Electronics");
        textView133 = findViewById(R.id.textView133);
        textView133.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Electronics.this,General.class);
                startActivity(intent);
            }
        });
        textView134 = findViewById(R.id.textView134);
        textView134.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Electronics.this,Iphone.class);
                startActivity(intent);
            }
        });
        textView135 = findViewById(R.id.textView135);
        textView135.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Electronics.this,Android.class);
                startActivity(intent);
            }
        });
    }
}