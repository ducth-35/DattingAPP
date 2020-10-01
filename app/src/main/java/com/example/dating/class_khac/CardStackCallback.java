package com.example.dating.class_khac;

import java.util.List;

import androidx.recyclerview.widget.DiffUtil;

import com.example.dating.model.Batgap;

public class CardStackCallback extends DiffUtil.Callback {

    private List<Batgap> old, baru;

    public CardStackCallback(List<Batgap> old, List<Batgap> baru) {
        this.old = old;
        this.baru = baru;
    }

    @Override
    public int getOldListSize() {
        return old.size();
    }

    @Override
    public int getNewListSize() {
        return baru.size();
    }

    @Override
    public boolean areItemsTheSame(int oldItemPosition, int newItemPosition) {
        return old.get(oldItemPosition).getImage() == baru.get(newItemPosition).getImage();
    }

    @Override
    public boolean areContentsTheSame(int oldItemPosition, int newItemPosition) {
        return old.get(oldItemPosition) == baru.get(newItemPosition);
    }
}