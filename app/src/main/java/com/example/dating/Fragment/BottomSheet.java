package com.example.dating.Fragment;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.example.dating.Adapter.BottomSheetAdapter;
import com.example.dating.R;
import com.example.dating.model.Ganday;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackView;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

import java.util.ArrayList;

public class BottomSheet extends BottomSheetDialogFragment {
    CardStackView cardStackView;
    BottomSheetBehavior bottomSheetBehavior;

    public static BottomSheet newInstance() {
        BottomSheet fragment = new BottomSheet();
        return fragment;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        BottomSheetDialog dialog = (BottomSheetDialog) super.onCreateDialog(savedInstanceState);
        View view = View.inflate(getContext(), R.layout.activity_bottom_sheet, null);
        cardStackView = view.findViewById(R.id.card_stack_view_dialog);
        //set cardStackView

        CardStackLayoutManager manager = new CardStackLayoutManager(getContext());
        cardStackView.setLayoutManager(manager);
        cardStackView.setHasFixedSize(true);
        BottomSheetAdapter dialogAdapter = new BottomSheetAdapter(addList(), getContext());
        cardStackView.setAdapter(dialogAdapter);
        // set view
        dialog.setContentView(view);
        // set color
        ((View) view.getParent()).setBackgroundColor(getResources().getColor(android.R.color.transparent));
        bottomSheetBehavior = BottomSheetBehavior.from((View) view.getParent());
        bottomSheetBehavior.setPeekHeight(0);
        bottomSheetBehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        bottomSheetBehavior.addBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                if(newState==BottomSheetBehavior.STATE_COLLAPSED){
                    dismiss();
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {

            }
        });
        manager.setCanScrollHorizontal(false);
        manager.setSwipeableMethod(SwipeableMethod.Manual);
        return dialog;
    }
    private ArrayList<Ganday> addList() {
        ArrayList<Ganday> items = new ArrayList<>();
        items.add(new Ganday(R.drawable.gai2, "", "24", "Jember"));
        return items;
    }

}