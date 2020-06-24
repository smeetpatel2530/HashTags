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

public class Building extends AppCompatActivity {
    private TextView textView;
    private Button copy,ig,fb,twitter;
    private String Tags = "____________^v^_____^v^\n" +
            "_________¶¶¶¶___^v^\n" +
            "_______¶¶¶¶¶¶¶_____^v^\n" +
            "______¶¶¶¶¶¶¶¶¶¶_________/\n" +
            "____¶¶¶¶¶¶¶¶¶¶¶¶¶_____--- ---\n" +
            "__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____/_\n" +
            "___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____^v^\n" +
            "____¶¶¶¶¶¶¶¶¶¶¶¶¶________^v^\n" +
            "_______¶¶I_I¶¶¶¶_______¶¶¶¶\n" +
            "_________I_I___________¶¶¶¶\n" +
            "___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "___¶_________________________¶\n" +
            "___¶__¶¶¶¶¶¶__¶¶¶¶¶__¶¶¶¶¶___¶\n" +
            "___¶__¶¶¶¶¶¶__¶¶¶¶¶__¶¶¶¶¶___¶\n" +
            "___¶__¶¶¶¶¶¶__¶¶¶¶¶__¶¶¶¶¶___¶\n" +
            "___¶__¶¶¶¶¶¶_________________¶__o\n" +
            "___¶__¶¶¶¶¶¶_________________¶_(|/)\n" +
            "___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶ _______________ZZZ__Z____$ \n" +
            "______________Z____ZZ___$$$ \n" +
            "____________ZZ____ZZ___$$$$$ \n" +
            "____________Z___ZZ____$$___$$ \n" +
            "____________$$$$_____$$_____$$ \n" +
            "____________$__$____$$_______$$ \n" +
            "____________$__$___$$____#____$$ \n" +
            "__________$$$$$$$$$$____###___$$ \n" +
            "_________$ZZZZZZZ$$______#______$$ \n" +
            "________$ZZZZZZZ$$_______________$$ \n" +
            "_______$ZZZZZZZ$$_________________$$ \n" +
            "______$ZZZZZZZ$$__$$$$$$$_$$$$$$$__$$ \n" +
            "______$$_$|$_$$____$_$$$_$_$_$$$_$__$$ \n" +
            "______$$_$|$_$$____$$$$$$$_$$$$$$$___$$ \n" +
            "____$$$$$$$$$$$_____________________$$ \n" +
            "___$ZZZZZZZZZZ$$$$$$$$$$$$$$$$$$$$$$$$ \n" +
            "__$ZZZZZZZZZZZ$ZZZZZZZZZZZZZZZZZZZZZZ$ \n" +
            "_$ZZZZZZZZZZZ$ZZZZZZZZZZZZZZZZZZZZZZZZ$ \n" +
            "$ZZZZZZZZZZZ$ZZZZZZZZZZZZZZZZZZZZZZZZZZ$ \n" +
            "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$ \n" +
            "__$$_$__$__$___$$__$ZZZZ$___$$_$__$__$_$$ \n" +
            "__$$_$__$__$___$$__$_ZZ_$___$$_$__$__$_$$ \n" +
            "__$$ZZZZZZZZZZZ$$__$___#$___$$ZZZZZZZZZ$$ \n" +
            "__$$_#_#_#_#_#$$_ $_ZZ_$___$$#_#_#_#_$$ \n" +
            "__$$#_#_#_#_#_$$__$$$$$$___$$_#_#_#_#$$ \n" +
            "__$$$$$$$$$$$$$$##########$$$$$$$$$$$$$\n" +
            "_________________¶\n" +
            "________________¶_¶\n" +
            "_______________¶___¶\n" +
            "_________¶¶¶¶_¶_____¶\n" +
            "_________¶__¶¶_______¶\n" +
            "_________¶__¶_________¶\n" +
            "_________¶_¶___________¶\n" +
            "_________¶¶_____¶¶¶_____¶\n" +
            "_________¶_____¶___¶_____¶\n" +
            "________¶_______¶¶¶_______¶\n" +
            "_______¶___________________¶\n" +
            "______¶_____________________¶\n" +
            "_____¶_______________________¶\n" +
            "____¶_________________________¶\n" +
            "___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "___¶___________________________¶\n" +
            "___¶___________________________¶\n" +
            "___¶__¶¶¶¶¶¶___________________¶\n" +
            "___¶____________¶¶¶¶¶¶¶¶¶¶¶____¶\n" +
            "___¶__¶¶¶¶¶¶____¶___¶_¶___¶____¶\n" +
            "___¶__¶____¶____¶__¶___¶__¶____¶\n" +
            "___¶__¶_¶¶_¶____¶_¶_____¶_¶____¶\n" +
            "___¶__¶____¶____¶¶¶¶¶¶¶¶¶¶¶____¶\n" +
            "___¶__¶¶___¶___________________¶\n" +
            "___¶__¶____¶___________________¶\n" +
            "___¶__¶____¶___________________¶\n" +
            "___¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "_____¶¶\n" +
            "____¶¶¶¶\n" +
            "___¶¶¶¶¶¶\n" +
            "___¶¶¶¶¶¶\n" +
            "__¶¶¶¶¶¶¶¶\n" +
            "_¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "¶¶¶¶__¶_¶¶¶¶\n" +
            "¶¶¶__¶___¶¶¶\n" +
            "¶¶¶___¶¶_¶¶¶\n" +
            "¶¶¶¶____¶¶¶¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶_______________________________________¶\n" +
            "_¶¶_¶¶¶¶_¶¶______________________________________¶¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶____¶____¶____¶____¶____¶____¶____¶___¶¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶___¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶_¶¶¶¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "_¶¶_¶¶¶¶_¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶__¶¶¶¶\n" +
            "_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶\n" +
            "_____________________¶\n" +
            "____________________¶¶¶\n" +
            "_____________________¶\n" +
            "____________________¶¶¶\n" +
            "___________________¶¶_¶¶\n" +
            "__________________¶¶___¶¶\n" +
            "_________________¶¶_____¶¶\n" +
            "________________¶¶_______¶¶\n" +
            "_______________¶¶_________¶¶\n" +
            "_______________¶___________¶\n" +
            "_______________¶___________¶\n" +
            "_______________¶___________¶\n" +
            "_______________¶¶_________¶¶\n" +
            "________________¶¶¶¶¶¶¶¶¶¶¶\n" +
            "_________________¶¶¶¶¶¶¶¶¶\n" +
            "________________¶_________¶\n" +
            "________¶¶¶¶¶¶¶¶¶_________¶_______¶\n" +
            "_______¶§§§§§§§§¶____¶____¶______¶§¶\n" +
            "______¶§_§_§_§_§¶___¶¶¶___¶_____¶§¶§¶\n" +
            "_____¶§_§_§_§_§_¶__¶_¶_¶__¶____¶§¶_¶§¶\n" +
            "____¶___________¶_¶__¶__¶_¶___¶§¶___¶§¶\n" +
            "___¶____________¶_¶__¶__¶_¶__¶§¶__§__¶§¶\n" +
            "__¶_____________¶_¶__¶__¶_¶_¶§¶__§§§__¶§¶\n" +
            "_¶______________¶_¶__¶__¶_¶¶§¶__§§§§§__¶§¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_¶__¶__¶_¶§¶__§§§§§§§__¶§¶\n" +
            "_¶______________¶_¶__¶__¶_¶_¶_§§§§§§§§§__¶¶¶\n" +
            "_¶__§§__§§__§§__¶¶¶¶¶¶¶¶¶¶¶¶¶_¶¶¶¶¶¶¶¶¶_§_¶¶¶\n" +
            "_¶__§§__§§__§§_¶¶___________¶¶¶_______¶_§_¶\n" +
            "_¶__§§__§§__¶¶¶_______________¶¶______¶_§_¶\n" +
            "_¶__§§__§¶¶¶___¶¶¶¶¶____________¶¶____¶_§_¶\n" +
            "_¶__§§¶¶¶___________¶¶¶¶__________¶¶__¶_§_¶\n" +
            "_¶__¶¶__________________¶¶__________¶¶¶_§_¶\n" +
            "_¶_¶______________________¶¶___________¶¶__¶\n" +
            "¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____§§___§§§§§_§§§§§§§§§§§\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_building);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Building");



        textView = findViewById(R.id.textView142);
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