package com.example.dating.Chat;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.dating.R;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.widget.Toast.LENGTH_SHORT;

public class Chat_adapter extends RecyclerView.Adapter<Chat_adapter.MyViewHolder> {
    List<Chat_model> list;
    Context context;

    public Chat_adapter(List<Chat_model> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_chat_custom, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final Chat_model chat = list.get(position);
        Glide.with(context).load(chat.getImage()).into(holder.imageView);
        holder.name_mess.setText(list.get(position).getName());
        Glide.with(context).load(chat.getImage_status()).into(holder.image_status);
        holder.message.setText(list.get(position).getMessage());
        holder.time.setText(list.get(position).getTime());
        holder.soluong.setText(list.get(position).getSoluong());
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
        CircleImageView image_status;
        ImageView imageView;
        TextView name_mess;
        TextView time;
        TextView message;
        TextView soluong;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_mess);
            name_mess = itemView.findViewById(R.id.name_mess);
            soluong = itemView.findViewById(R.id.soluong);
            time = itemView.findViewById(R.id.time);
            message = itemView.findViewById(R.id.message);
            image_status = itemView.findViewById(R.id.image_status);
        }
    }
}
