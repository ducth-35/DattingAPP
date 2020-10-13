package com.example.dating.Chat;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dating.R;

import java.util.ArrayList;
import java.util.List;

public class nhantin_fragment extends Fragment {

    private RecyclerView recyclerview;
    private RecyclerView recyclerview2;
    Chat_adapter adapter;
    Chat2_adapter adapter2;
    List<Chat_model> list;
    View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.nhantin_fragment, container, false);
        recyclerview = view.findViewById(R.id.recyclerview_chat);
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        manager.setOrientation(RecyclerView.VERTICAL);
        recyclerview.setLayoutManager(manager);
        adapter = new Chat_adapter(list, getContext());
        recyclerview.setAdapter(adapter);
        //
        recyclerview2 = view.findViewById(R.id.recyclerview_listonline);
        LinearLayoutManager manager2 = new LinearLayoutManager(getContext());
        manager2.setOrientation(RecyclerView.HORIZONTAL);
        recyclerview2.setLayoutManager(manager2);
        adapter2 = new Chat2_adapter(list, getContext());
        recyclerview2.setAdapter(adapter2);
        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        list = new ArrayList<>();
        list.add(new Chat_model(R.drawable.gai1, "Nguyễn Mai Trang", R.drawable.online, "Tối nay đi chơi không bạn", "5phút", "1"));
        list.add(new Chat_model(R.drawable.gai2, "Thảo Vy", R.drawable.online, "Nay tao qua nhà mày chơi nha", "1phút", "4"));
        list.add(new Chat_model(R.drawable.gai3, "Nguyễn Huyền", R.drawable.online, "Tối có nhà không", "1phút", "1"));
        list.add(new Chat_model(R.drawable.gai4, "Trần Ngọc Anh", R.drawable.online, "Mai qua tao chơi", "2phút", "66"));
        list.add(new Chat_model(R.drawable.gai1, "Ngọc Mai", R.drawable.online, "Tối nay đi chơi không bạn", "3phút", "1"));
        list.add(new Chat_model(R.drawable.gai2, "Thùy Linh", R.drawable.online, "Bố mẹ mày có nhà không", "5phút", "2"));
        list.add(new Chat_model(R.drawable.gai3, "Quỳnh Anh", R.drawable.online, "Tối nay đi chơi không bạn", "5phút", "1"));
        list.add(new Chat_model(R.drawable.gai4, "Phương Anh", R.drawable.online, "Đi ăn đi", "5phút", "3"));
    }
}
