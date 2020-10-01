package com.example.dating;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.dating.Fragment.Batgap_fragment;
import com.example.dating.Fragment.Ganday_fragment;
import com.example.dating.Fragment.hoso_fragment;
import com.example.dating.Fragment.nhantin_fragment;
//import com.example.dating.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigationView;
    private RecyclerView recyclerView;
    //     ActivityMainBinding binding;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
//                        binding.title.setText(getString(R.string.ganday_title));
                        break;
                    case R.id.batgap:
                        fragment = new Batgap_fragment();
//                        binding.title.setText(getString(R.string.batgap_title));
                        break;
                    case R.id.nhantin:
                        fragment = new nhantin_fragment();
//                        binding.title.setText(getString(R.string.nhantin_title));
                        break;
                    case R.id.hoso:
                        fragment = new hoso_fragment();
//                        binding.title.setText(getString(R.string.hoso_title));
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
                return true;
            }
        });
    }
}