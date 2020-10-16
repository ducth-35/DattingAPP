package com.example.dating.Activity;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.crystal.crystalrangeseekbar.interfaces.OnRangeSeekbarChangeListener;
import com.crystal.crystalrangeseekbar.widgets.CrystalRangeSeekbar;
import com.example.dating.R;

public class Chonloc extends AppCompatActivity {
    private CrystalRangeSeekbar crystalRangeSeekbar;
    private CrystalRangeSeekbar crystalRangeSeekbar2;
    private TextView tv_min, tv_max, tv_km;
    private ImageView imageView;
    private RadioButton radioButton1, radioButton2, radioButton3;
    private RadioGroup rd_group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chonloc);
        crystalRangeSeekbar = findViewById(R.id.rangeSeekbar);
        crystalRangeSeekbar2 = findViewById(R.id.rangeSeekbar1);
        rd_group = findViewById(R.id.rd_group);
        radioButton1 = findViewById(R.id.rd_btn1);
        radioButton2 = findViewById(R.id.rd_btn2);
        radioButton3 = findViewById(R.id.rd_btn3);
        tv_min = findViewById(R.id.tv_min);
        tv_max = findViewById(R.id.tv_max);
        tv_km = findViewById(R.id.tv_km);
        imageView = findViewById(R.id.img_back1);
        crystalRangeSeekbar();
        radioButton();
    }

    private void crystalRangeSeekbar() {
        crystalRangeSeekbar.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                tv_min.setText(String.valueOf(minValue));
                tv_max.setText(String.valueOf(maxValue));
            }
        });
        crystalRangeSeekbar2.setOnRangeSeekbarChangeListener(new OnRangeSeekbarChangeListener() {
            @Override
            public void valueChanged(Number minValue, Number maxValue) {
                tv_km.setText(String.valueOf(minValue));
                tv_km.setText(String.valueOf(maxValue));
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }

    private void radioButton() {
        rd_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rd_btn1:
                        Toast.makeText(getApplicationContext(), "Nam", Toast.LENGTH_SHORT).show();
                        radioButton1.setBackground(getDrawable(R.drawable.custom_button_pressed));
                        radioButton2.setBackground(null);
                        radioButton3.setBackground(null);
                        radioButton1.setTextColor(Color.WHITE);
                        radioButton2.setTextColor(Color.BLACK);
                        radioButton3.setTextColor(Color.BLACK);
                        break;
                    case R.id.rd_btn2:
                        Toast.makeText(getApplicationContext(), "Nữ", Toast.LENGTH_SHORT).show();
                        radioButton2.setBackground(getDrawable(R.drawable.custom_button_pressed));
                        radioButton1.setBackground(null);
                        radioButton3.setBackground(null);
                        radioButton2.setTextColor(Color.WHITE);
                        radioButton1.setTextColor(Color.BLACK);
                        radioButton3.setTextColor(Color.BLACK);
                        break;
                    case R.id.rd_btn3:
                        Toast.makeText(getApplicationContext(), "Cả hai", Toast.LENGTH_SHORT).show();
                        radioButton3.setBackground(getDrawable(R.drawable.custom_button_pressed));
                        radioButton1.setBackground(null);
                        radioButton2.setBackground(null);
                        radioButton3.setTextColor(Color.WHITE);
                        radioButton1.setTextColor(Color.BLACK);
                        radioButton2.setTextColor(Color.BLACK);
                        break;
                }
            }
        });

    }
}