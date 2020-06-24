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

public class Chars extends AppCompatActivity {
    private TextView textView;
    private Button copy,ig,fb,twitter;
    private String Tags = "_________________________¶¶¶¶¶\n" +
            "_______________________¶¶¶¶¶11¶¶\n" +
            "_____________________¶¶¶¶111111¶¶\n" +
            "___________________¶¶¶111111111¶¶¶¶\n" +
            "__________________¶¶¶11111111111¶¶¶¶¶¶\n" +
            "_________________¶¶111111111111111111¶¶¶\n" +
            "________________¶¶1111111111111111111111¶\n" +
            "_______________¶¶1111111111111111111111¶¶\n" +
            "_____________¶¶¶111111111111111111111¶¶¶\n" +
            "__________¶¶¶¶¶1111111111111111111111¶¶¶\n" +
            "_________¶¶¶111111111111111111111111111¶¶¶\n" +
            "_______¶¶¶1111111111111111111111111111111¶¶¶\n" +
            "______¶¶11111111111111111111111111111111111¶¶\n" +
            "_____¶¶1111111111111111111111111111111111111¶¶\n" +
            "____¶¶111111111111111111111111111111111111111¶¶\n" +
            "___¶¶11111111111111111111111111111111111111111¶¶\n" +
            "__¶¶1111111111111111111111111¶11111111111111111¶¶\n" +
            "__¶¶¶111111111111111111111¶¶¶¶11111111111111111¶¶\n" +
            "_¶¶¶¶¶¶¶¶1111111111111¶¶¶¶¶¶¶¶¶11111111111111111¶¶\n" +
            "_¶¶¶¶¶¶¶¶¶¶¶¶111111¶¶¶¶¶¶¶¶¶¶¶¶¶1111111111111111¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶111111111111111111111¶\n" +
            "¶¶1111¶________¶¶¶_________¶111111111111111111111¶\n" +
            "¶¶111¶_____¶¶¶_¶¶____¶¶_____¶11111111111111111111¶\n" +
            "¶¶111¶_____¶¶¶_¶¶___¶¶¶¶____¶11111111111111111111¶\n" +
            "¶¶1111¶______¶¶¶¶____¶¶____¶111111111111111111111¶\n" +
            "_¶1111¶¶___¶¶¶___¶¶_______¶¶11111111111111111111¶¶\n" +
            "_¶¶11111¶¶¶¶_______¶¶¶¶¶¶¶1111111111111111111111¶¶\n" +
            "__¶1111¶¶¶___________¶¶¶11111111111111111111111¶¶\n" +
            "__¶¶1¶¶¶_______________¶¶¶¶¶¶¶¶¶¶¶1111111111111¶¶\n" +
            "___¶¶¶¶___$$$$$$$$$$$$$¶¶_____¶¶¶¶¶¶¶111111111¶¶\n" +
            "____¶¶1¶¶$$$$$$$$_____¶¶____________¶¶¶111111¶¶\n" +
            "_____¶¶11¶¶_________¶¶¶_______________¶¶¶111¶¶\n" +
            "______¶¶11¶¶¶______¶¶___________________¶11¶¶\n" +
            "_______¶¶1¶__¶¶¶__¶¶____________________¶¶¶¶\n" +
            "_________¶¶¶____¶¶_____________________¶¶¶\n" +
            "___________¶¶¶_______________________¶¶¶\n" +
            "____________¶¶¶¶_________________¶¶¶¶\n" +
            "________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "_____________¶¶¶¶¶¶¶\n" +
            "___________¶¶¶______¶¶¶\n" +
            "_________¶¶¶___________¶¶\n" +
            "________¶¶______________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "_______¶¶___________________¶_______¶¶¶¶¶\n" +
            "______¶¶________________________________¶¶¶\n" +
            "_____¶¶___________________________________¶¶\n" +
            "____¶¶___________________¶¶________________¶¶\n" +
            "____¶¶___________________¶¶_________________¶\n" +
            "___¶¶____________________¶__________________¶\n" +
            "___¶¶___¶¶__________________________________¶\n" +
            "__¶¶__¶_¶¶¶¶¶_______________________________¶¶\n" +
            "__¶¶_¶¶¶¶¶¶¶¶¶______________________________¶¶¶\n" +
            "__¶__¶¶¶¶¶¶¶¶¶______________________________¶¶¶\n" +
            "__¶_¶¶¶¶¶¶¶¶¶¶¶¶___________________________¶¶\n" +
            "__¶_¶¶¶_¶¶¶_¶¶_¶¶_________________________¶¶\n" +
            "__¶_¶¶_¶¶¶¶¶¶¶¶_¶_______________________¶¶\n" +
            "__¶_¶¶__¶¶¶¶¶¶¶_¶¶___¶¶______________¶¶¶¶\n" +
            "__¶_¶¶__¶¶¶¶¶¶¶_¶¶____¶___________¶¶¶¶\n" +
            "__¶_¶¶¶¶¶¶¶__¶¶_¶¶_____¶¶¶¶___¶¶¶¶¶\n" +
            "___¶_¶¶¶¶¶¶__¶¶_¶__________¶¶¶¶\n" +
            "___¶¶__¶¶¶¶¶¶¶__¶¶¶¶______¶¶¶\n" +
            "____¶¶___¶¶¶___¶¶¶¶¶¶____¶¶\n" +
            "_____¶¶¶_____¶¶¶____¶_____¶¶¶\n" +
            "________¶¶¶¶¶¶_____¶¶¶¶¶¶¶¶¶\n" +
            "____________________¶¶_____¶¶\n" +
            "____________________¶_______¶¶\n" +
            "____________________¶________¶¶\n" +
            "___________________¶¶_________¶¶\n" +
            "___________________¶____¶¶_____¶¶\n" +
            "__________________¶¶____¶¶______¶¶\n" +
            "__________________¶_¶____¶_______¶¶\n" +
            "_________________¶¶_¶____¶¶______¶¶\n" +
            "___________¶¶¶¶__¶¶_¶_____¶______¶¶\n" +
            "____________¶¶¶¶¶¶¶_¶_____¶______¶¶\n" +
            "_____________¶¶__¶_¶______¶_____¶¶¶___¶¶¶\n" +
            "_______________¶¶¶_¶___¶__¶_____¶¶__¶¶¶_¶¶\n" +
            "_____________¶¶__¶_¶¶__¶_¶¶___¶¶___¶¶____¶¶\n" +
            "____________¶¶¶¶__¶_¶¶¶¶¶_____¶¶__¶¶_____¶¶\n" +
            "___________¶¶__¶¶¶¶____________¶¶¶_______¶¶\n" +
            "___________¶¶___¶¶____¶¶¶¶¶_____¶_____¶_¶¶\n" +
            "____________¶________¶____¶____________¶¶\n" +
            "____________¶_______¶¶____¶¶______¶¶___¶¶\n" +
            "____________¶¶_______¶¶___¶¶________¶¶¶¶\n" +
            "_____________¶¶_______¶¶_¶¶_________¶¶\n" +
            "_____________¶¶__¶¶____¶¶_________¶¶\n" +
            "______________¶¶_¶¶_¶__¶_______¶¶¶¶\n" +
            "_______________¶¶¶__¶¶¶¶¶__¶¶¶¶¶\n" +
            "_________________¶¶¶¶¶__¶¶¶¶¶\n" +
            "\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chars);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Chars");



        textView = findViewById(R.id.textView138);
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