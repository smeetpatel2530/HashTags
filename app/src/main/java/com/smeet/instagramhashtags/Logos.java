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

public class Logos extends AppCompatActivity {
    private TextView textView;
    private Button copy,ig,fb,twitter;
    private String Tags = "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶§§§1§§¶¶\n" +
            "¶¶¶¶¶¶_§¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶§1___1§§¶¶¶¶¶\n" +
            "¶¶¶¶§__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶§1______§¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶§___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶§§1_______1§¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶____1¶¶¶¶¶¶¶¶¶¶§11_________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶_______11111____________§¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶____________________§¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶_______________1§¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶__________1§¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶§§§¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ _______________$$$$$$\n" +
            "__________$$$$$_$$$$$$____$\n" +
            "$$$$__________$$$$$$$$$_$$$$$\n" +
            "$$$$$$_____$$$$$$$$$$$$$$__$$$\n" +
            "__$$$$$$____$$$$$$$$$$$$$__$$$\n" +
            "_____$$$$$__$$$$$$$$$$$_$$__$$\n" +
            "_______$$$$$$$$$$$$$$$$__$$__$\n" +
            "_$$$$$$$$$$$$$$$$$$$$_____$\n" +
            "$$$$$$$$$$$$$$$$$$$$$_____$$\n" +
            "_$$$$______$$$$$$$$$$______$\n" +
            "____________$$$$$$$$$$____$$\n" +
            "___________$$$$$$$$$$$$$$$$\n" +
            "__________$$$$$$$$$$$$$$\n" +
            "_________$$$$$$$$$$$$$$$$\n" +
            "________$$$$$$$___$$$$$$$$$\n" +
            "________$$$$$$_______$$$$$$$\n" +
            "___$$$_$$$$$____________$$$$\n" +
            "__$$$$$$$$$_________$$$$$$$$\n" +
            "___$$$$$$$_________$$$$$$$$$__________________________________________________\n" +
            "_________________________¶________________________\n" +
            "________________________¶¶¶_______________________\n" +
            "_______________________¶¶¶¶¶______________________\n" +
            "______________________¶¶¶¶¶¶¶_____________________\n" +
            "_____________________¶¶¶¶¶¶¶¶¶____________________\n" +
            "____________________¶¶¶¶¶¶¶¶¶¶¶___________________\n" +
            "___________________¶¶¶¶¶¶¶¶¶¶¶¶¶__________________\n" +
            "__________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_________________\n" +
            "__________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶________________\n" +
            "____________________¶¶¶¶¶¶¶¶¶¶¶_¶_________________\n" +
            "_____________________¶¶¶¶¶¶¶¶¶_¶__________________\n" +
            "______________________¶¶¶¶¶¶¶_¶___________________\n" +
            "_______________________¶¶¶¶¶_¶____________________\n" +
            "________________________¶¶¶_¶_____________________\n" +
            "_________________________¶_¶______________________\n" +
            "__________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______\n" +
            "_________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶______\n" +
            "________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____\n" +
            "_______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____\n" +
            "______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___\n" +
            "_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶__________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__\n" +
            "___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_\n" +
            "__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶______________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "___________________________$$\n" +
            " _________________________$$$$\n" +
            " _______________________$$$$$$\n" +
            " ______________________$$$$$$\n" +
            " ______________________$$$$\n" +
            " ______________________$$\n" +
            " _________$$$$$$$$$$$$$_$$$$$$$$$$$$$\n" +
            " ______$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " ____$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " ___$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " __$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " _$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " _$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " _$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " _$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " __$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " ___$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " ____$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " _____$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " ______$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " ________$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " __________$$$$$$$$$$$$$$$$$$$$$$$$$\n" +
            " ____________$$$$$$$$$$$$$$$$$$$$$\n" +
            " ______________$$$$$$$$__$$$$$$";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logos);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Logos");



        textView = findViewById(R.id.textView139);
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