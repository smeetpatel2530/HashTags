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

public class Sports extends AppCompatActivity {
    private TextView textView;
    private Button copy,ig,fb,twitter;
    private String Tags = "_____________________________000__________________\n" +
            "___________________________0¶¶¶¶¶¶________________\n" +
            "___________________________¶¶¶¶¶¶¶________________\n" +
            "_______________________0¶0__0¶¶¶0_________________\n" +
            "______________________0¶¶¶___0____________________\n" +
            "______________________0¶¶¶__¶¶¶___________________\n" +
            "_______________________¶¶¶_0¶¶¶___________________\n" +
            "_______________________0¶¶¶0¶¶0___________________\n" +
            "________________0¶¶¶¶¶0_0¶¶0¶¶0___________________\n" +
            "________________¶¶¶¶¶¶¶¶__0¶¶¶¶___________________\n" +
            "________________¶¶¶¶¶¶¶¶¶___0¶¶¶__________________\n" +
            "______0_________¶¶¶¶0¶¶¶¶0_____0¶_________________\n" +
            "_____0¶_________¶¶¶¶__¶¶¶¶______00________________\n" +
            "____0¶___0¶¶¶¶¶¶¶¶¶0__0¶¶¶_______00_______________\n" +
            "____0¶______0¶¶¶¶00____¶¶¶________00______________\n" +
            "______________________¶¶¶__________00_____________\n" +
            "_____________________00¶____________00____________\n" +
            "____________________0¶_______________00___________\n" +
            "__________________0¶__________________00__________\n" +
            "________________00¶____________________00__000____\n" +
            "_________________0000___________________00000_____\n" +
            "__________________________________________________\n" +
            " ¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11_____1¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1__________1¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_____________¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______________¶11\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1__________________\n" +
            "¶¶¶¶¶¶¶1____1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1________________¶¶\n" +
            "¶¶¶¶¶__________¶¶¶¶¶¶¶¶¶¶¶11____________________¶¶\n" +
            "¶¶¶¶____________¶¶¶¶11_____11___1______________1¶¶\n" +
            "¶¶¶1__________________11¶¶¶¶¶__1¶1_____________¶¶¶\n" +
            "¶¶¶1_______________¶¶¶¶¶¶¶¶¶¶__1¶¶¶__________1¶¶¶¶\n" +
            "¶¶¶______________1¶¶¶¶¶¶¶¶¶¶____¶¶¶¶¶11__111¶¶¶¶¶¶\n" +
            "¶¶¶1_____________¶¶¶¶¶¶¶¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶____________¶¶____1¶¶¶¶____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶___________________¶¶1___1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶11111¶1__________¶1____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_________1¶_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶1____________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶1____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶1___________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶1___________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1___________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "__________________________________________________\n" +
            "______¶___________________________________________\n" +
            "____1¶¶1__________________________________________\n" +
            "_____¶¶¶1_________________________________________\n" +
            "______1¶¶¶¶¶¶11_______________1111________________\n" +
            "__________1¶¶¶¶¶¶¶¶1_________¶¶¶¶¶¶_______________\n" +
            "______________11¶¶¶¶¶¶¶1¶1__¶¶¶¶¶¶¶1______________\n" +
            "_________________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_______________\n" +
            "__________________11¶¶¶¶¶¶¶¶¶¶¶¶¶¶________________\n" +
            "______________________¶¶¶¶¶¶¶¶¶¶¶¶¶_______________\n" +
            "______________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____________\n" +
            "_____________________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________\n" +
            "_____________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_______\n" +
            "_________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__1¶¶1¶¶¶¶¶¶1____\n" +
            "________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1__111¶¶1___\n" +
            "_______________1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________\n" +
            "_______________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________\n" +
            "______________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶¶¶1___________\n" +
            "_____________¶¶¶¶¶_1¶¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶____________\n" +
            "____________¶¶¶¶¶_____1111¶¶11___¶¶¶¶1____________\n" +
            "__________¶¶¶¶¶¶1______________1¶¶¶¶¶1____________\n" +
            "________1¶¶¶¶¶¶1______________¶¶¶¶¶¶¶1____________\n" +
            "____¶¶1¶¶¶¶¶¶¶1_111111111_____1¶¶¶¶¶¶_____________\n" +
            "____1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1____________\n" +
            "______11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_____________\n" +
            "__________1¶1_______________1¶1___________________\n" +
            "___________¶1________________¶1___________________\n" +
            "__________________________________________________\n" +
            "__________________________________________________";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Sports");



        textView = findViewById(R.id.textView141);
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