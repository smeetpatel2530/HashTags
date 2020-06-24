package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Music extends AppCompatActivity {
    private TextView textView;
    private Button copy,ig,fb,twitter;
    private String Tags = "#music #genre #song #songs #melody #hiphop #rnb #pop #love #rap #dubstep #instagood #beat #beats #jam #myjam #party #partymusic #newsong #lovethissong #remix #favoritesong #bestsong #photooftheday #bumpin #repeat #listentothis #goodmusic #instamusic";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Music");



        textView = findViewById(R.id.textView85);
        textView.setText(Tags);

        copy = findViewById(R.id.copy);
        ig = findViewById(R.id.ig);
        fb = findViewById(R.id.fb);
        twitter = findViewById(R.id.tw);

        copy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Quote", Tags );
                clipboard.setPrimaryClip(clip);
                Context context = getApplicationContext();
                Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Quote", Tags );
                clipboard.setPrimaryClip(clip);
                Context context = getApplicationContext();
                Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        fb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Quote", Tags );
                clipboard.setPrimaryClip(clip);
                Context context = getApplicationContext();
                Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Quote", Tags );
                clipboard.setPrimaryClip(clip);
                Context context = getApplicationContext();
                Toast.makeText(context, "Copied to clipboard", Toast.LENGTH_SHORT).show();
            }
        });

    }
}