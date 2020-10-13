package com.example.dating.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.dating.Activity.Chonloc;
import com.example.dating.Adapter.Ganday_adapter;
import com.example.dating.R;
import com.example.dating.class_khac.CustomItemDecorator;
import com.example.dating.model.Ganday;

import java.util.ArrayList;
import java.util.List;

public class Ganday_fragment extends Fragment {
    private RecyclerView recyclerview;
    private ImageView img;
    List<Ganday> mlist;
    Ganday_adapter adapter;
    View v;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.ganday_fragment, container, false);
        recyclerview = v.findViewById(R.id.recyclerview);
        img = v.findViewById(R.id.img_chonloc);
        adapter = new Ganday_adapter(mlist, getContext());
        recyclerview.setAdapter(adapter);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(3, GridLayoutManager.VERTICAL);
        recyclerview.addItemDecoration(new CustomItemDecorator(30.00, 200.00));
        recyclerview.setLayoutManager(staggeredGridLayoutManager);
        img();
        return v;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mlist = new ArrayList<>();
        mlist.add(new Ganday(R.drawable.gai1, "Nguyễn Mai Trang", "", "21"));
        mlist.add(new Ganday(R.drawable.gai2, "Nguyễn Huyền", "", "22"));
        mlist.add(new Ganday(R.drawable.gai3, "Thảo Vy", "", "22"));
        mlist.add(new Ganday(R.drawable.gai1, "Trần Ngọc Anh", "", "22"));
        mlist.add(new Ganday(R.drawable.gai2, "Ngọc Mai", "", "22"));
        mlist.add(new Ganday(R.drawable.gai3, "Thùy Linh", "", "22"));
        mlist.add(new Ganday(R.drawable.gai1, "Quỳnh Anh", "", "22"));
        mlist.add(new Ganday(R.drawable.gai2, "Phương Anh", "", "22"));
        mlist.add(new Ganday(R.drawable.gai3, "Mai Trang ", "", "22"));
        mlist.add(new Ganday(R.drawable.gai1, "Nguyễn Mai Trang", "", "21"));
        mlist.add(new Ganday(R.drawable.gai2, "Nguyễn Huyền", "", "22"));
        mlist.add(new Ganday(R.drawable.gai3, "Thảo Vy", "", "22"));
        mlist.add(new Ganday(R.drawable.gai1, "Trần Ngọc Anh", "", "22"));
        mlist.add(new Ganday(R.drawable.gai2, "Ngọc Mai", "", "22"));
        mlist.add(new Ganday(R.drawable.gai3, "Thùy Linh", "", "22"));
        mlist.add(new Ganday(R.drawable.gai1, "Quỳnh Anh", "", "22"));
        mlist.add(new Ganday(R.drawable.gai2, "Phương Anh", "", "22"));
    }

    private void img() {
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Chonloc.class);
                startActivity(intent);
            }
        });
    }
}
