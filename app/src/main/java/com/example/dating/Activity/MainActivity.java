package com.example.dating.Activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dating.Fragment.Batgap_fragment;
import com.example.dating.Fragment.Ganday_fragment;
import com.example.dating.Fragment.hoso_fragment;
import com.example.dating.Chat.nhantin_fragment;
//import com.example.dating.databinding.ActivityMainBinding;
import com.example.dating.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private RecyclerView recyclerView;
    private ImageView imageView;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.img_chonloc);
        bottomNavigationView = findViewById(R.id.bottomNAV);
        text = (TextView) findViewById(R.id.title);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new Ganday_fragment()).commit();
        }
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                switch (item.getItemId()) {
                    case R.id.ganday:
                        fragment = new Ganday_fragment();

                        break;
                    case R.id.batgap:
                        fragment = new Batgap_fragment();

                        break;
                    case R.id.nhantin:
                        fragment = new nhantin_fragment();

                        break;
                    case R.id.hoso:
                        fragment = new hoso_fragment();

                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                return true;
            }
        });
    }
}