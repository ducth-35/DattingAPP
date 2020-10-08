package com.example.dating.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.dating.Adapter.Ganday_adapter;
import com.example.dating.R;
import com.example.dating.class_khac.CustomItemDecorator;
import com.example.dating.model.Ganday;

import java.util.ArrayList;
import java.util.List;

public class Ganday_fragment extends Fragment {
    private RecyclerView recyclerview;
    List<Ganday> mlist;
    Ganday_adapter adapter;
    View v;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.ganday_fragment, container, false);
        recyclerview = v.findViewById(R.id.recyclerview);
        adapter = new Ganday_adapter(mlist, getContext());
        recyclerview.setAdapter(adapter);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, GridLayoutManager.VERTICAL);
        recyclerview.addItemDecoration(new CustomItemDecorator(30.00, 200.00));
        recyclerview.setLayoutManager(staggeredGridLayoutManager);
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mlist = new ArrayList<>();
        mlist.add(new Ganday(R.drawable.gai1, "Mai Trang 1","","21","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai2, "Mai Trang 2","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai3, "Mai Trang 3","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai1, "Mai Trang 4","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai2, "Mai Trang 5","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai3, "Mai Trang 6","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai1, "Mai Trang 7","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai2, "Mai Trang 8","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai3, "Mai Trang 9","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai1, "Mai Trang 4","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai2, "Mai Trang 5","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai3, "Mai Trang 6","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai1, "Mai Trang 7","", "22","Hà Nội", ""));
        mlist.add(new Ganday(R.drawable.gai2, "Mai Trang 8","", "22","Hà Nội", ""));
    }
}
