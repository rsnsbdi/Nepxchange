package com.example.roshan.nepxchange.UI.home.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.roshan.nepxchange.Model.homeModels.Data;
import com.example.roshan.nepxchange.R;

import java.util.Date;
import java.util.List;

public class CatergoryChildItemAdapter extends RecyclerView.Adapter<CategoryChildItemViewHolder> {



    Context c;
    List<Data> list;
    int id ;



    public void init(Context c , List<Data> list,int id){
    this.c= c;
    this.list=list;
    this.id=id;

    }
    @NonNull
    @Override
    public CategoryChildItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cat_imageview, viewGroup, false);
//        CategoryChildItemViewHolder mh = new ViewHolderBikes(v);
        CategoryChildItemViewHolder viewHolderCategoryChild  = new CategoryChildItemViewHolder(v);

        return viewHolderCategoryChild;
    }

    @Override
    public void onBindViewHolder(@NonNull final CategoryChildItemViewHolder categoryChildItemViewHolder, int i) {

        Data data = list.get(i);
        categoryChildItemViewHolder.imageView.setImageResource(R.drawable.icon);
//        if(id==data.getId())
//        {

//            String url=data.getFront_side_image();
//        Glide.with(c).load(data.getFront_side_image()).into(categoryChildItemViewHolder.imageView);}
//    }
    }
    @Override
    public int getItemCount() {
        return list.size();
    }
}
