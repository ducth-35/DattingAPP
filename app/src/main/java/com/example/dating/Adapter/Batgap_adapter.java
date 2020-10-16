package com.example.dating.Adapter;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.dating.R;
import com.example.dating.model.Batgap;
import com.squareup.picasso.Picasso;
import com.yuyakaido.android.cardstackview.CardStackLayoutManager;
import com.yuyakaido.android.cardstackview.CardStackListener;
import com.yuyakaido.android.cardstackview.Direction;
import com.yuyakaido.android.cardstackview.StackFrom;
import com.yuyakaido.android.cardstackview.SwipeableMethod;

import java.util.ArrayList;
import java.util.List;

import static android.view.View.VISIBLE;

public class Batgap_adapter extends RecyclerView.Adapter<Batgap_adapter.ViewHolder> {

    private List<Batgap> items;
    Context c;
    boolean check = true;
    CardStackLayoutManager manager;
    private int dem = 1;


    public void setMeets(ArrayList<Batgap> meets) {
        this.items = meets;
    }
    public Batgap_adapter(List<Batgap> items, Context c,CardStackLayoutManager manager ) {
        this.items = items;
        this.c = c;
        this.manager= manager;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item_batgap, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, final int position) {
        final Batgap batgap = items.get(position);
        holder.setData(items.get(position));
        holder.linearLayout_infor.setVisibility(View.GONE);
        holder.status_infor.setVisibility(VISIBLE);
        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                holder.status_infor.setVisibility(View.GONE);
                holder.linearLayout.setVisibility(View.GONE);
                holder.linearLayout_infor.setVisibility(VISIBLE);

                if (check) {
                    holder.setSizeScreen(holder.image_tinder);
                    check = false;
                }

                holder.xo_layout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (dem % 2 == 1) {
                            holder.xo_layout.setImageResource(R.drawable.dow_metting);
                            manager.setSwipeableMethod(SwipeableMethod.None);
                            holder.about_me.setVisibility(View.VISIBLE);
                            holder.setData(items.get(position));
                            holder.status_infor.setVisibility(VISIBLE);
                        } else {
                            holder.status_infor.setVisibility(View.GONE);
                            holder.xo_layout.setImageResource(R.drawable.ic_share);
                            holder.about_me.setVisibility(View.GONE);
                            holder.linearLayout.setVisibility(View.GONE);
                            holder.linearLayout_infor.setVisibility(View.VISIBLE);

                            if (holder.about_me.getVisibility() == View.GONE) {
                                holder.image.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View view) {
                                        holder.linearLayout_infor.setVisibility(View.GONE);

                                        if (check == false) {
                                            holder.getSizeScreen(holder.image_tinder);
                                            check = true;

                                            manager.setSwipeableMethod(SwipeableMethod.AutomaticAndManual);
                                            holder.linearLayout.setVisibility(VISIBLE);
                                            holder.status_infor.setVisibility(View.VISIBLE);
                                        }
                                    }
                                });
                            }

                        }

                        dem++;
                    }
                });
                manager.setStackFrom(StackFrom.None);
                manager.setScaleInterval(0.4f);
                manager.setSwipeThreshold(0.3f);
                manager.setMaxDegree(20.0f);
                manager.setDirections(Direction.HORIZONTAL);
                manager.setCanScrollHorizontal(true);
                manager.setSwipeableMethod(SwipeableMethod.None);
                manager.setOverlayInterpolator(new LinearInterpolator());
            }
        });
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image, xo_layout;
        TextView age, kota, name;
        TextView item_age1,item_adress1,item_name1;
        CardView cardView;
        LinearLayout linearLayout, linear_tong;
        LinearLayout linearLayout_infor, status_infor;
        RelativeLayout image_tinder, about_me;
        ScrollView scrollView;

        ViewHolder(@NonNull View itemView) {
            super(itemView);
            item_age1 = itemView.findViewById(R.id.item_age1);
            item_adress1 = itemView.findViewById(R.id.item_adress1);
            item_name1 = itemView.findViewById(R.id.item_name1);
            image = itemView.findViewById(R.id.item_image);
            name = itemView.findViewById(R.id.item_name);
            age = itemView.findViewById(R.id.item_age);
            kota = itemView.findViewById(R.id.item_city);
            linearLayout = itemView.findViewById(R.id.infor);
            cardView = itemView.findViewById(R.id.cardview);
            status_infor = itemView.findViewById(R.id.status_tinder);
            linearLayout_infor = itemView.findViewById(R.id.infor_user);
            image_tinder = itemView.findViewById(R.id.image_tinder);
            xo_layout = itemView.findViewById(R.id.xo_layout);
            scrollView = itemView.findViewById(R.id.scrollview);
            linear_tong = itemView.findViewById(R.id.linearlayout_tong);
            about_me = itemView.findViewById(R.id.activity_morong);

        }

        void setData(Batgap data) {
            Picasso.get().load(data.getImage()).fit().centerInside().into(image);
            name.setText(data.getName());
            age.setText(data.getAge());
            kota.setText(data.getAddress());
            item_age1.setText(data.getAge());
            item_adress1.setText(data.getAddress());
            item_name1.setText(data.getName());
        }

        public void setSizeScreen(RelativeLayout image_tinder) {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            ((Activity) c).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            int deviceheight = (displaymetrics.heightPixels) - (displaymetrics.heightPixels) / 3 - 60;
            image_tinder.getLayoutParams().height = deviceheight;
        }

        public void getSizeScreen(RelativeLayout layout) {
            DisplayMetrics displaymetrics = new DisplayMetrics();
            ((Activity) c).getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
            int deviceheight = (displaymetrics.heightPixels) + (displaymetrics.heightPixels) / 3 + 60;
            layout.getLayoutParams().height = deviceheight;
        }
    }

    public List<Batgap> getItems() {
        return items;
    }

    public void setItems(List<Batgap> items) {
        this.items = items;
    }


}