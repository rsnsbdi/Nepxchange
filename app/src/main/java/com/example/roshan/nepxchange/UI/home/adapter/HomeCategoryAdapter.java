package com.example.roshan.nepxchange.UI.home.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.roshan.nepxchange.Model.homeModels.Category;
import com.example.roshan.nepxchange.R;
import com.example.roshan.nepxchange.UI.home.HomeActivity;

import java.util.ArrayList;
import java.util.List;

public class HomeCategoryAdapter extends RecyclerView.Adapter<ViewHolderCategory> {
    Context mContext;
    List<Category> mList;



   public void init(Context c, List<Category> modules){
        this.mContext = c;
        this.mList = modules;
    }

    @NonNull
    @Override
    public ViewHolderCategory onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.category_cardlayout, viewGroup, false);
//        ViewHolderBikes mh = new ViewHolderBikes(v);
        ViewHolderCategory viewHolderCategory = new ViewHolderCategory(v);
//        return mh;
        return viewHolderCategory;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderCategory viewHolderCategory, int i) {

       Category category = mList.get(i);
       viewHolderCategory.tv_Category.setText(category.getCat_name());





    }

    @Override
    public int getItemCount() {
        return mList.size();
    }
}

//package com.andmine.bhatbhate.ui.main.fragments.more.wishlist.adapter;
//
//        import android.content.Context;
//        import android.support.annotation.NonNull;
//        import android.support.v7.widget.RecyclerView;
//        import android.view.LayoutInflater;
//        import android.view.View;
//        import android.view.ViewGroup;
//
//        import com.andmine.bhatbhate.R;
//        import com.andmine.bhatbhate.models.bike.BikeModules;
//        import com.andmine.bhatbhate.ui.main.adapters.ViewHolderBikes;
//        import com.bumptech.glide.DrawableRequestBuilder;
//        import com.bumptech.glide.Glide;
//        import com.bumptech.glide.load.engine.DiskCacheStrategy;
//
//        import java.util.ArrayList;
//
//        import javax.inject.Inject;
//
///**
// * Created by AM Nepal on 2/26/2018.
// */
//
//public class WishListAdapter extends RecyclerView.Adapter<ViewHolderBikes> {
//
//    private Context mContext;
//    private ArrayList<BikeModules> mList;
//
//    @Inject
//    public WishListAdapter(){}
//
//    public void init(Context c,ArrayList<BikeModules> modules){
//        this.mContext = c;
//        this.mList = modules;
//    }
//
//
//    @Override
//    public ViewHolderBikes onCreateViewHolder(ViewGroup parent, int viewType) {
//        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.buy_list_row_item, parent, false);
//        ViewHolderBikes mh = new ViewHolderBikes(v);
//        return mh;
//    }
//
//    @Override
//    public void onBindViewHolder(ViewHolderBikes viewHolderBikes, int position) {
//        BikeModules modules = mList.get(position);
//        viewHolderBikes.editPublishLayout.setVisibility(View.GONE);
//        viewHolderBikes.fav.setVisibility(View.GONE);
//        viewHolderBikes.buyersNo.setVisibility(View.GONE);
//        viewHolderBikes.thumbnail.setText(modules.getBrand_name()+" "+modules.getModel_name());
//        viewHolderBikes.ratingBar.setRating(modules.getRating());
//        loadImage(modules.getFront_side_image()).into(viewHolderBikes.imageView);
//        viewHolderBikes.price.setText("Rs "+modules.getPrice());
//    }
//
//    @Override
//    public int getItemCount() {
//        return mList.size();
//    }
//
//    private DrawableRequestBuilder<String> loadImage(@NonNull String posterPath) {
//        return Glide
//                .with(mContext)
//                .load(posterPath)
//                .diskCacheStrategy(DiskCacheStrategy.ALL)   // cache both original & resized image
//                .centerCrop()
//                .crossFade();
//    }
//}
//
