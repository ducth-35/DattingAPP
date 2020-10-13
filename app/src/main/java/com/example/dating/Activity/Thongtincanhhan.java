package com.example.dating.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.dating.Fragment.Cannang;
import com.example.dating.Fragment.Chieucao;
import com.example.dating.Fragment.Hutthuoc;
import com.example.dating.Fragment.Ngonngu;
import com.example.dating.Fragment.Ruoubia;
import com.example.dating.R;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class Thongtincanhhan extends AppCompatActivity {
    private LinearLayout linearLayout,
            linearLayout2,
            linearLayout3,
            linearLayout4,
            linearLayout5,
            linearLayout6,
            linearLayout7,
            linearLayout8,
            linearLayout9;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtincanhhan);
        linearLayout = findViewById(R.id.taikhoan);
        linearLayout2 = findViewById(R.id.hocvan);
        linearLayout3 = findViewById(R.id.veban);
        linearLayout4 = findViewById(R.id.them);
        linearLayout5 = findViewById(R.id.chieucao);
        linearLayout6 = findViewById(R.id.cannang);
        linearLayout7 = findViewById(R.id.ruoubia);
        linearLayout8 = findViewById(R.id.hutthuoc);
        linearLayout9 = findViewById(R.id.ngonngu);
        imageView = findViewById(R.id.img_back4);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thongtincanhhan.this, Taikhoan.class);
                startActivity(intent);
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thongtincanhhan.this, Conviec_hocvan.class);
                startActivity(intent);
            }
        });
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thongtincanhhan.this, Veban.class);
                startActivity(intent);
            }
        });
        linearLayout4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(Thongtincanhhan.this);
                View bottomSheetView = LayoutInflater.from(getApplicationContext())
                        .inflate(R.layout.bottom_sheet, (LinearLayout) findViewById(R.id.bottomSheetcontainer));
                bottomSheetView.findViewById(R.id.rd_button).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(Thongtincanhhan.this, "Thank you...", Toast.LENGTH_SHORT).show();
                        bottomSheetDialog.dismiss();
                    }
                });
                bottomSheetDialog.setContentView(bottomSheetView);
                bottomSheetDialog.show();
            }
        });
        linearLayout5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thongtincanhhan.this, MainActivity2.class);
                startActivity(intent);
            }
        });

        linearLayout6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thongtincanhhan.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        linearLayout7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thongtincanhhan.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        linearLayout8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thongtincanhhan.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        linearLayout9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Thongtincanhhan.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();

            }
        });
    }
}