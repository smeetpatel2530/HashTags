package com.smeet.instagramhashtags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FollowShoutoutLikeComment extends AppCompatActivity {
    private TextView textView168;
    private TextView textView169;
    private TextView textView170;
    private TextView textView171;
    private TextView textView172;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_shoutout_like_comment);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Follow/Shoutout/Like/Comment");
        textView168 = findViewById(R.id.textView168);
        textView168.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FollowShoutoutLikeComment.this,FSL.class);
                startActivity(intent);
            }
        });
        textView169 = findViewById(R.id.textView169);
        textView169.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FollowShoutoutLikeComment.this,Follow.class);
                startActivity(intent);
            }
        });
        textView170 = findViewById(R.id.textView170);
        textView170.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FollowShoutoutLikeComment.this,Like.class);
                startActivity(intent);
            }
        });
        textView171 = findViewById(R.id.textView171);
        textView171.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FollowShoutoutLikeComment.this,Comment.class);
                startActivity(intent);
            }
        });
        textView172 = findViewById(R.id.textView172);
        textView172.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FollowShoutoutLikeComment.this,Shoutout.class);
                startActivity(intent);
            }
        });
    }
}