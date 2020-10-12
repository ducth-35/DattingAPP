package com.example.dating.Chat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.dating.R;

import java.util.List;

public class Chat2_adapter extends RecyclerView.Adapter<Chat2_adapter.MyViewHolder> {
    List<Chat_model> list;
    Context context;

    public Chat2_adapter(List<Chat_model> list, Context context) {
        this.list = list;
        this.context = context;
    }
    @NonNull
    @Override
    public Chat2_adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_chat_custom2, parent, false);
        return new Chat2_adapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Chat2_adapter.MyViewHolder holder, int position) {
        final Chat_model chat = list.get(position);
        Glide.with(context).load(chat.getImage()).into(holder.imageView);
        holder.image_mess1.setText(list.get(position).getName());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Nhantin_Activity.class);
                intent.putExtra("image", chat.getImage());
                intent.putExtra("name", chat.getName());
                intent.putExtra("image_status", chat.getImage_status());
                context.startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
    public static class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView image_mess1;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_mess);
            image_mess1 = itemView.findViewById(R.id.name_mess);
        }
    }
}
