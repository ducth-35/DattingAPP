package com.example.dating.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.dating.Fragment.hoso_fragment;
import com.example.dating.R;

public class Setting_activity extends AppCompatActivity {
private ImageView image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_activity);
        image = findViewById(R.id.img_quaylai);
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Setting_activity.this, hoso_fragment.class);
                startActivity(intent);
            }
        });
        }

    }
