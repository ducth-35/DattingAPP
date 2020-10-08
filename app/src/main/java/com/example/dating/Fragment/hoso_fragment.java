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

import com.example.dating.Activity.Thongtincanhhan;
import com.example.dating.R;
import com.example.dating.Activity.Setting_activity;

public class hoso_fragment extends Fragment {
    private ImageView settings;
    private ImageView image;
    View view;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.hoso_fragment, container, false);
        settings = (ImageView) view.findViewById(R.id.settings);
        image = view.findViewById(R.id.img_hoso);
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Setting_activity.class);
                startActivity(intent);
            }
        });
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), Thongtincanhhan.class);
                startActivity(intent);
            }
        });
        return view;
    }
}
