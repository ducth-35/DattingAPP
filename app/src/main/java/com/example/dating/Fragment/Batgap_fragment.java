package com.example.dating.Fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dating.Adapter.Batgap_adapter;
import com.example.dating.MainActivity;
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
    List<Batgap> batgaps;
    View view;

    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.batgap_fragment, container, false);
        addList();
        CardStackView cardStackView = view.findViewById(R.id.card_stack_view);
        manager = new CardStackLayoutManager(getActivity(), new CardStackListener() {
            @Override
            public void onCardDragging(Direction direction, float ratio) {
                Log.d(TAG, "onCardDragging: d=" + direction.name() + " ratio=" + ratio);
            }

            @Override
            public void onCardSwiped(Direction direction) {
                Log.d(TAG, "onCardSwiped: p=" + manager.getTopPosition() + " d=" + direction);
                if (direction == Direction.Right) {
                    Toast.makeText(getActivity(), "Direction Right", Toast.LENGTH_SHORT).show();
                }
                if (direction == Direction.Top) {
                    Toast.makeText(getActivity(), "Direction Top", Toast.LENGTH_SHORT).show();
                }
                if (direction == Direction.Left) {
                    Toast.makeText(getActivity(), "Direction Left", Toast.LENGTH_SHORT).show();
                }
                if (direction == Direction.Bottom) {
                    Toast.makeText(getActivity(), "Direction Bottom", Toast.LENGTH_SHORT).show();
                }

                // Paginating
                if (manager.getTopPosition() == adapter.getItemCount() - 1) {
                    paginate();
                }

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

        adapter = new Batgap_adapter(batgaps, getContext());
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
        batgaps.add(new Batgap(R.drawable.gai1, "Mai Trang 1", "18", "Hà Nội 1"));
        batgaps.add(new Batgap(R.drawable.gai2, "Mai Trang 2", "20", "Hà Nội 2"));
        batgaps.add(new Batgap(R.drawable.gai3, "Mai Trang 3", "20", "Hà Nội 3"));
        batgaps.add(new Batgap(R.drawable.gai2, "Mai Trang 4", "19", "Hà Nội 4"));
        batgaps.add(new Batgap(R.drawable.gai1, "Mai Trang 5", "20", "Hà Nội 5"));
        batgaps.add(new Batgap(R.drawable.gai1, "Mai Trang 6", "21", "Hà Nội 6"));
        batgaps.add(new Batgap(R.drawable.gai2, "Mai Trang 7", "24", "Hà Nội 7"));
        batgaps.add(new Batgap(R.drawable.gai3, "Mai Trang 8", "20", "Hà Nội 8"));
        batgaps.add(new Batgap(R.drawable.gai2, "Mai Trang 9", "23", "Hà Nội 9"));
        batgaps.add(new Batgap(R.drawable.gai1, "Mai Trang 10", "20", "Hà Nội 20"));
    }
}