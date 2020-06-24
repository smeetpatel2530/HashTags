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

public class Loves extends AppCompatActivity {
    private TextView textView;
    private Button copy,ig,fb,twitter;
    private String Tags = "────(♥)(♥)(♥)────(♥)(♥)(♥) __ ɪƒ ƴσυ'ʀє αʟσηє,\n" +
            "──(♥)██████(♥)(♥)██████(♥) ɪ'ʟʟ ɓє ƴσυʀ ѕɧα∂σѡ.\n" +
            "─(♥)████████(♥)████████(♥) ɪƒ ƴσυ ѡαηт тσ cʀƴ,\n" +
            "─(♥)██████████████████(♥) ɪ'ʟʟ ɓє ƴσυʀ ѕɧσυʟ∂єʀ.\n" +
            "──(♥)████████████████(♥) ɪƒ ƴσυ ѡαηт α ɧυɢ,\n" +
            "────(♥)████████████(♥) __ ɪ'ʟʟ ɓє ƴσυʀ ρɪʟʟσѡ.\n" +
            "──────(♥)████████(♥) ɪƒ ƴσυ ηєє∂ тσ ɓє ɧαρρƴ,\n" +
            "────────(♥)████(♥) __ ɪ'ʟʟ ɓє ƴσυʀ ѕɱɪʟє.\n" +
            "─────────(♥)██(♥) ɓυт αηƴтɪɱє ƴσυ ηєє∂ α ƒʀɪєη∂,\n" +
            "───────────(♥) __ ɪ'ʟʟ ʝυѕт ɓє ɱє.\n" +
            "´´´´¶¶¶¶¶¶´´´´´´¶¶¶¶¶¶\n" +
            "´´¶¶¶¶¶¶¶¶¶¶´´¶¶¶¶¶¶¶¶¶¶\n" +
            "´¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶´´´´¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶´´´´¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶´´¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ ´¶¶¶¶¶´\n" +
            "´´¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "´´´´´¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "´´´´´´´¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "´´´´´´´´´¶¶¶¶¶¶¶¶\n" +
            "´´´´´´´´´´´¶¶¶¶\n" +
            "───▄▄▄▄▄▄─────▄▄▄▄▄▄\n" +
            "─▄█▓▓▓▓▓▓█▄─▄█▓▓▓▓▓▓█▄\n" +
            "▐█▓▓▒▒▒▒▒▓▓█▓▓▒▒▒▒▒▓▓█▌\n" +
            "█▓▓▒▒░╔╗╔═╦═╦═╦═╗░▒▒▓▓█\n" +
            "█▓▓▒▒░║╠╣╬╠╗║╔╣╩╣░▒▒▓▓█\n" +
            "▐█▓▓▒▒╚═╩═╝╚═╝╚═╝▒▒▓▓█▌\n" +
            "─▀█▓▓▒▒░░░░░░░░░▒▒▓▓█▀\n" +
            "───▀█▓▓▒▒░░░░░▒▒▓▓█▀\n" +
            "─────▀█▓▓▒▒░▒▒▓▓█▀\n" +
            "──────▀█▓▓▒▓▓█▀\n" +
            "────────▀█▓█▀\n" +
            "──────────▀ ___d88888888b_____d88888888b\n" +
            "__d88?____d88b___d88b____`88b\n" +
            "_d8?_________d888b_________`8b\n" +
            "_8b_________________________d8\n" +
            "_b8__________________d8888b___d8888b\n" +
            "__d8________________d8?__d8b_d8b__`8b\n" +
            "___8ba_____________d8?_____d8b_____`8b\n" +
            "____`8da___________8b_______________d8\n" +
            "______`Y8b__________d8_____________8b\n" +
            "________`8b__________8ba_________ad8\n" +
            "__________`88_____88__`8da_____ab8?\n" +
            "____________8b___d8_____`Y8___8Y?\n" +
            "_____________`b_d?________`8_8?\n" +
            "______________`8?__________`8?\n" +
            "_______________\"____________\"";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loves);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Love");



        textView = findViewById(R.id.textView146);
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