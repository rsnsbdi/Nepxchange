package com.example.roshan.nepxchange.UI.home.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.TextureView;
import android.view.View;
import android.widget.TextView;

import com.example.roshan.nepxchange.R;

public class ViewHolderCategory extends RecyclerView.ViewHolder {

CardView cardView;

TextView tv_Category;
RecyclerView category_recyclerView;




    public ViewHolderCategory(View view) {
        super(view);
        cardView = (CardView)view.findViewById(R.id.cat_cardview);
       tv_Category  = (TextView) view.findViewById(R.id.tv_catname);
       category_recyclerView =view.findViewById(R.id.cat_recyclerview);



    }
}
