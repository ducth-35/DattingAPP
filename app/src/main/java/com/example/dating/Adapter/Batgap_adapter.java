package com.example.dating.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.dating.R;
import com.example.dating.model.Batgap;
import com.squareup.picasso.Picasso;

import java.util.List;

public class Batgap_adapter extends RecyclerView.Adapter<Batgap_adapter.ViewHolder> {

    private List<Batgap> items;
    Context c;

    public Batgap_adapter(List<Batgap> items, Context c) {
        this.items = items;
        this.c = c;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_batgap, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.setData(items.get(position));
        Glide.with(c).load(items.get(position).getImage()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView nama, age, kota, name;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.item_image);
            name = itemView.findViewById(R.id.item_name);
            age = itemView.findViewById(R.id.item_age);

        }

        void setData(Batgap data) {
            Picasso.get()
                    .load(data.getImage())
                    .fit()
                    .centerInside()
                    .into(image);
            name.setText(data.getNama());
            age.setText(data.getAge());
        }
    }

    public List<Batgap> getItems() {
        return items;
    }

    public void setItems(List<Batgap> items) {
        this.items = items;
    }
}