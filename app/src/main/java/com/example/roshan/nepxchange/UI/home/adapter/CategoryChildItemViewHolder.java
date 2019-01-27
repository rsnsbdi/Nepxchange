package com.example.roshan.nepxchange.UI.home.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.roshan.nepxchange.R;

public class CategoryChildItemViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView price;
    ImageView imageView;
    LinearLayout linearLayout;


    public CategoryChildItemViewHolder(@NonNull View itemView) {
        super(itemView);
        linearLayout = itemView.findViewById(R.id.catParent_itemLayout);
        imageView = itemView.findViewById(R.id.img_);
        name = itemView.findViewById(R.id.tv_name);
        price =  itemView.findViewById(R.id.tv_price);

    }
}
