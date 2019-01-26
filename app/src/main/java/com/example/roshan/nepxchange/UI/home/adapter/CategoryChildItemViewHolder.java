package com.example.roshan.nepxchange.UI.home.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.roshan.nepxchange.R;

public class CategoryChildItemViewHolder extends RecyclerView.ViewHolder {

    TextView name;
    TextView price;
    ImageView imageView;




    public CategoryChildItemViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.img_);

    }
}
