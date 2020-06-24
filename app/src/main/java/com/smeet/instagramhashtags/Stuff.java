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

public class Stuff extends AppCompatActivity {
    private TextView textView;
    private Button copy,ig,fb,twitter;
    private String Tags = "___________00_____________________7_______________\n" +
            "________0000_____________________777______________\n" +
            "______0000______________________77777_____________\n" +
            "____00000______________________7777777____________\n" +
            "___00000______________________777777777___________ \n" +
            "__000000____________77777777777777777777777777777 \n" +
            "_0000000______________7777777777777777777777777___ \n" +
            "_0000000_______________7777777777777777777777_____ \n" +
            "_0000__00_________________77777777777777777_______ \n" +
            "_0000__00000000__________777777777_777777777______ \n" +
            "_000000000000___________7777777_______7777777_____ \n" +
            "__0000000000___________77777_____________77777____ \n" +
            "___0000_000000________777___________________777___ \n" +
            "____00000_______0___________0000__________________\n" +
            "______000000__00000______000000___________________ \n" +
            "________000000000000000000000_____________________ \n" +
            "__________00000000000000000_______________________ \n" +
            "______________000000000___________________________\n" +
            "______________¶¶¶¶¶_______¶¶¶¶¶\n" +
            "___________¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶\n" +
            "__________¶¶¶¶¶___¶¶¶¶¶¶¶¶¶___¶¶¶¶¶\n" +
            "__________¶¶¶¶¶___¶¶¶¶¶¶¶¶¶___¶¶¶¶¶\n" +
            "___________¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶\n" +
            "______________¶¶¶¶¶¶_____¶¶¶¶¶¶\n" +
            "¶¶________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶\n" +
            "¶¶¶¶______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶_______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "____________________¶¶¶¶¶¶\n" +
            "_____________________¶¶¶¶\n" +
            "_____________________¶¶¶¶¶\n" +
            "___________________¶¶¶¶¶¶¶¶\n" +
            "__________________¶¶__¶¶__¶¶\n" +
            "_________________¶¶___¶¶___¶¶\n" +
            "_______________¶¶_____¶¶____¶¶\n" +
            "░░░░░░░░░░░░░░░░░░░░░░███ \n" +
            "░░░░░░░░░░░░░░░░░░░░███ \n" +
            "░░░░░░░░░░░░░░░░░░░██ \n" +
            "░░░░░░░░░░░░░░░░░░██ \n" +
            "░░░░░░░░░░░░░░░░░███ \n" +
            "░░░░░░░░█████████████████████ \n" +
            "░░░░░███████████████████████████ \n" +
            "░░░███████████████░███████████████ \n" +
            "░██████████░██████░██████░█████████ \n" +
            "░█████████░░░█████░█████░░░█████████ \n" +
            "█████████░░░░░████░████░░░░░████████ \n" +
            "████████░░░░░░░███░███░░░░░░░████████ \n" +
            "██████████████████░██████████████████ \n" +
            "█████████████████░░░█████████████████ \n" +
            "████████░░░████████████████░░████████ \n" +
            "░███████░░░░░░░░░░░░░░░░░░░░░███████ \n" +
            "░░████████░░░░░░░░░░░░░░░░░████████ \n" +
            "░░░██████████████████████████████ \n" +
            "░░░░███████████████████████████\n" +
            "__________________________________________________\n" +
            "__________________________________________________\n" +
            "_________________________¶¶¶¶_____________________\n" +
            "_______________________¶¶¶¶¶¶¶¶___________________\n" +
            "____________________¶¶¶¶¶¶¶¶¶¶¶¶__________________\n" +
            "___________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________________\n" +
            "________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____________\n" +
            "_¶¶¶¶¶________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶___¶¶¶¶¶¶___\n" +
            "__¶¶¶¶¶______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶_\n" +
            "___¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____¶¶¶¶______¶¶¶\n" +
            "____¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶_______¶¶¶\n" +
            "____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶______¶¶¶\n" +
            "____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶______¶¶¶\n" +
            "_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶_____¶¶¶_\n" +
            "______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶____¶¶¶¶__\n" +
            "_______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶__¶¶¶¶____\n" +
            "________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶______\n" +
            "__________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_________\n" +
            "______________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____________\n" +
            "__________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________________\n" +
            "__________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________________\n" +
            "__________¶____¶_________________________________\n" +
            "__________¶¶__¶¶___¶_____________________________\n" +
            "______¶¶__¶¶¶_¶¶__¶¶___¶¶________________________\n" +
            "______¶¶¶¶_¶¶¶¶¶¶¶¶¶_¶¶¶_________________________\n" +
            "___¶___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________________________\n" +
            "___¶¶¶¶¶¶¶_________¶¶¶¶¶¶¶¶¶¶____________________\n" +
            "_____¶¶¶¶_______¶¶¶¶¶¶¶__¶¶¶¶¶¶¶_________________\n" +
            "_¶¶¶¶¶¶¶_______¶¶¶____________¶¶¶________________\n" +
            "__¶¶¶¶¶¶______¶¶________________¶¶¶¶¶¶___________\n" +
            "_____¶¶______¶¶__________________¶¶¶¶¶¶¶_________\n" +
            "_¶¶¶¶¶¶______¶¶_______________________¶¶¶________\n" +
            "_¶¶¶¶¶¶¶__¶¶¶¶_________________________¶¶________\n" +
            "_____¶¶¶¶¶¶¶¶¶_________________________¶¶________\n" +
            "___¶¶¶¶¶_______________________________¶¶¶¶______\n" +
            "__¶¶¶¶___________________________________¶¶¶¶____\n" +
            "___¶¶_______________________________________¶¶___\n" +
            "___¶________________________________________¶¶___\n" +
            "__¶¶_________________________________________¶¶__\n" +
            "___¶¶_______________________________________¶¶___\n" +
            "___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___\n" +
            "_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____\n" +
            "_________________________________________________";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stuff);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Stuff");



        textView = findViewById(R.id.textView144);
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