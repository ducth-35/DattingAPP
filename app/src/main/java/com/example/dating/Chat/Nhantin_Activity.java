package com.example.dating.Chat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dating.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class Nhantin_Activity extends AppCompatActivity {
private TextView tv1, tv2;
private CircleImageView circleimageview1, circleimageview2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nhantin_);
        tv1 = findViewById(R.id.name_message);
        tv2 = findViewById(R.id.online_chat);
        circleimageview1 = findViewById(R.id.image_chat);
        circleimageview2 = findViewById(R.id.online);

        Intent intent = getIntent();
        int image = intent.getIntExtra("image", 0);
        int image_status1 = intent.getIntExtra("image_status", 0);
        String name = intent.getStringExtra("name");
        Glide.with(this).load(image).into(circleimageview1);
        Glide.with(this).load(image_status1).into(circleimageview2);
        tv1.setText(name);
    }
}