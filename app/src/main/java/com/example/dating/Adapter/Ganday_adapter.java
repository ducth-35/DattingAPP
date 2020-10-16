package com.example.dating.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.dating.R;
import com.example.dating.model.Ganday;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.makeramen.roundedimageview.RoundedImageView;

import java.util.List;

public class Ganday_adapter extends RecyclerView.Adapter<Ganday_adapter.MyViewHolder> {
    List<Ganday> mlist;
    Context context;


    public Ganday_adapter(List<Ganday> mlist, Context context) {
        this.mlist = mlist;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.item_ganday, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, final int position) {
        final Ganday ganday = mlist.get(position);
        Glide.with(context).load(ganday.getImage()).into(holder.imageView);
        holder.textView.setText(mlist.get(position).getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(context,R.style.BottomSheetDialogTheme);
                View botton = LayoutInflater.from(context).inflate(R.layout.show_item_dialog, (LinearLayout) view.findViewById(R.id.bottonSheets));

                RoundedImageView itemImage, imageStatus;
                TextView itemName;
                TextView itemCity;
                TextView itemAge;

                itemCity = botton.findViewById(R.id.item_city);
                itemAge = botton.findViewById(R.id.item_age);

                itemImage = botton.findViewById(R.id.item_image);
                itemName = botton.findViewById(R.id.item_name);
                imageStatus = botton.findViewById(R.id.image_status);

                itemAge.setText(String.valueOf(ganday.getAge()));
                itemCity.setText(ganday.getCity());
                itemName.setText(ganday.getName());
                //itemImage.setImageResource(people1.getImage());

                Glide.with(context).load(ganday.getImage()).into(itemImage);


                bottomSheetDialog.setContentView(botton);
                bottomSheetDialog.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mlist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_ganday);
            textView = itemView.findViewById(R.id.textview_ganday);
        }
    }
}
