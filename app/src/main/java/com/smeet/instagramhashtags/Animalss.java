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

public class Animalss extends AppCompatActivity {
    private TextView textView;
    private Button copy,ig,fb,twitter;
    private String Tags = "___________¶¶¶¶¶¶¶¶¶¶¶\n" +
            "________¶¶¶¶¶________¶¶¶¶¶¶\n" +
            "_____¶¶¶¶_________________¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "____¶¶_______________________¶¶¶__¶¶¶¶¶¶¶\n" +
            "___¶¶___________________________¶¶_¶¶¶¶¶¶¶¶\n" +
            "___¶¶_____¶¶¶¶____________________¶_______¶¶\n" +
            "___¶¶_____¶0_¶_____________________¶¶_¶¶¶¶¶¶¶\n" +
            "_¶¶_____¶________¶¶¶¶_______________¶¶_¶¶\n" +
            "¶¶_____¶___¶¶¶¶¶¶¶¶¶¶¶________¶______¶_¶¶\n" +
            "¶¶__¶¶¶¶¶¶¶¶¶¶_____¶¶_¶_____¶__¶¶_____¶_¶¶\n" +
            "_¶¶¶¶¶¶¶______¶_¶¶__¶_¶_____¶¶¶__¶_______¶\n" +
            "______________¶_¶¶¶¶¶_¶_____¶¶¶¶__¶¶_____¶¶\n" +
            "______________¶_¶¶¶¶¶¶_¶____¶__¶¶¶¶¶¶_____¶\n" +
            "______________¶¶¶¶¶__¶_¶____¶____¶¶¶¶¶____¶¶\n" +
            "_______________¶¶¶___¶¶_¶___¶¶¶¶__¶¶¶¶¶___¶¶\n" +
            "______________________¶__¶__¶¶_¶¶¶__¶¶¶¶___¶\n" +
            "_______________________¶¶¶¶__¶___¶¶__¶¶¶___¶\n" +
            "_________________________¶¶¶¶¶_____¶_¶¶¶¶__¶¶\n" +
            "____________________________________¶_¶¶¶__¶¶\n" +
            "_____________________________________¶¶¶¶¶_¶¶\n" +
            "______________________________________¶¶¶¶_¶¶\n" +
            "______________________________________¶¶¶¶_¶¶\n" +
            "_______________________________________¶_¶_¶\n" +
            "_______________________________________¶___¶\n" +
            "_______________________________________¶¶_¶¶\n" +
            "___________________________________¶¶¶¶¶¶_¶¶¶¶\n" +
            "__________________________________¶¶________¶¶¶¶\n" +
            "_________________________________¶¶___________¶¶¶\n" +
            "_________________________________¶¶_¶_¶¶¶_______¶¶\n" +
            "__________________________________¶¶_¶¶_¶¶¶¶____¶¶\n" +
            "____________________________________________¶¶___¶\n" +
            "_____________________________________________¶__¶\n" +
            "_______________________________________________¶¶_ /╲ ︵ ╱\\\n" +
            "l (◉) (◉) l\n" +
            "\\ ︶ V︶ /\n" +
            "/↺↺↺↺\\\n" +
            "↺↺↺↺↺\n" +
            "\\↺↺↺↺/\n" +
            "¯¯/\\¯/\\¯ ░░▒░░█░ \n" +
            "░░▒░█ \n" +
            "░░░█ \n" +
            "░░█░░░░███████ \n" +
            "░██░░░██▓▓███▓██▒ \n" +
            "██░░░█▓▓▓▓▓▓▓█▓███ \n" +
            "██░░██▓▓▓(◐)▓█▓▓█▓█ \n" +
            "███▓▓▓█▓▓▓▓▓█▓█▓▓▓▓█ \n" +
            "▀██▓▓█░██▓▓▓▓██▓▓▓▓▓█ \n" +
            "░▀██▀░░█▓▓▓▓▓▓▓▓▓▓▓▓▓█ \n" +
            "░░░░▒░░░█▓▓▓▓▓█▓▓▓▓▓▓█ \n" +
            "░░░░▒░░░█▓▓▓▓█▓█▓▓▓▓▓█ \n" +
            "░▒░░▒░░░█▓▓▓█▓▓▓█▓▓▓▓█ \n" +
            "░▒░░▒░░░█▓▓▓█░░░█▓▓▓█ \n" +
            "░▒░░▒░░██▓██░░░██▓▓██";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animalss);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Animals");



        textView = findViewById(R.id.textView137);
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