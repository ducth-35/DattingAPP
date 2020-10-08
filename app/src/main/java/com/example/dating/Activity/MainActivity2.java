package com.example.dating.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.dating.Adapter.SlidePage_Adapter;
import com.example.dating.Fragment.Cannang;
import com.example.dating.Fragment.Chieucao;
import com.example.dating.Fragment.Hutthuoc;
import com.example.dating.Fragment.Ngonngu;
import com.example.dating.Fragment.Ruoubia;
import com.example.dating.R;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {
    private ViewPager pager;
    private PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //
        List<Fragment> list = new ArrayList<>();
        list.add(new Chieucao());
        list.add(new Cannang());
        list.add(new Ruoubia());
        list.add(new Hutthuoc());
        list.add(new Ngonngu());

        pager = findViewById(R.id.pager);
        pagerAdapter = new SlidePage_Adapter(getSupportFragmentManager(), list);
        pager.setAdapter(pagerAdapter);
    }
}