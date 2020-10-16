package com.example.dating.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;

import com.example.dating.Activity.Chonloc;
import com.example.dating.Adapter.Batgap_adapter;
import com.example.dating.R;
import com.example.dating.class_khac.CardStackCallback;
import com.example.dating.model.Batgap;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackListener;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

import java.util.ArrayList;
import java.util.List;

public class Batgap_fragment extends Fragment {
    private static final String TAG = "MainActivity";
    private CardStackLayoutManager manager;
    private Batgap_adapter adapter;
    private ImageView img;
    List<Batgap> batgaps;
    View view;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.batgap_fragment, container, false);
        img = view.findViewById(R.id.img_chonloc);
        addList();
        img();
        CardStackView cardStackView = view.findViewById(R.id.card_stack_view);
        manager = new CardStackLayoutManager(getActivity(), new CardStackListener() {
            @Override
            public void onCardDragging(Direction direction, float ratio) {
                Log.d(TAG, "onCardDragging: d=" + direction.name() + " ratio=" + ratio);
            }

            @Override
            public void onCardSwiped(Direction direction) {

            }

            @Override
            public void onCardRewound() {
                Log.d(TAG, "onCardRewound: " + manager.getTopPosition());
            }

            @Override
            public void onCardCanceled() {
                Log.d(TAG, "onCardRewound: " + manager.getTopPosition());
            }

            @Override
            public void onCardAppeared(View view, int position) {
                TextView tv = view.findViewById(R.id.item_name);
                Log.d(TAG, "onCardAppeared: " + position + ", nama: " + tv.getText());
                addList();
            }

            @Override
            public void onCardDisappeared(View view, int position) {
                TextView tv = view.findViewById(R.id.item_name);
                addList();
                Log.d(TAG, "onCardAppeared: " + position + ", nama: " + tv.getText());
            }
        });
        manager.setStackFrom(StackFrom.None);
        //   manager.setVisibleCount(3);
        manager.setTranslationInterval(8.0f);
        manager.setScaleInterval(0.95f);
        manager.setSwipeThreshold(0.3f);
        manager.setMaxDegree(20.0f);
        manager.setDirections(Direction.FREEDOM);
        manager.setCanScrollHorizontal(true);
        manager.setSwipeableMethod(SwipeableMethod.AutomaticAndManual);
        manager.setOverlayInterpolator(new LinearInterpolator());

        adapter = new Batgap_adapter(batgaps, getContext(),manager);
        cardStackView.setLayoutManager(manager);
        cardStackView.setAdapter(adapter);
        cardStackView.setItemAnimator(new DefaultItemAnimator());
        return view;
    }

    private void paginate() {
        List<Batgap> old = adapter.getItems();
        List<Batgap> baru = new ArrayList<>();
        CardStackCallback callback = new CardStackCallback(old, baru);
        DiffUtil.DiffResult hasil = DiffUtil.calculateDiff(callback);
        adapter.setItems(baru);
        hasil.dispatchUpdatesTo(adapter);
    }

    private void addList() {
        batgaps = new ArrayList<>();
        batgaps.add(new Batgap(R.drawable.gai1, "Nguyễn Mai Trang", "18", "Hà Nội "));
        batgaps.add(new Batgap(R.drawable.gai4, "Nguyễn Huyền", "20", "Ninh Bình"));
        batgaps.add(new Batgap(R.drawable.gai2, "Thảo Vy", "20", "Ninh Bình"));
        batgaps.add(new Batgap(R.drawable.gai3, "Trần Ngọc Anh", "19", "Đà Nẵng"));
        batgaps.add(new Batgap(R.drawable.gai4, "Ngọc Mai", "20", "La Châu"));
        batgaps.add(new Batgap(R.drawable.gai1, "Thùy Linh", "21", "Khánh Hòa "));
        batgaps.add(new Batgap(R.drawable.gai3, "Quỳnh Anh", "24", "TP HCM"));
        batgaps.add(new Batgap(R.drawable.gai2, "Phương Anh", "20", "Vĩnh Phúc"));
        batgaps.add(new Batgap(R.drawable.gai4, "Mai Trang ", "23", "Nghệ An"));
        batgaps.add(new Batgap(R.drawable.gai1, "Nguyễn Mai Trang", "20", "Hà Tĩnh"));
    }
     private void img(){
         img.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(getActivity(), Chonloc.class);
                 startActivity(intent);
             }
         });
     }
}