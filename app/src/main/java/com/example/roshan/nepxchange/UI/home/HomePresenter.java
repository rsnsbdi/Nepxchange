package com.example.roshan.nepxchange.UI.home;

import android.content.Context;

import com.example.roshan.nepxchange.Base.BasePresenter;
import com.example.roshan.nepxchange.Model.homeModels.ItemsResponse;
import com.example.roshan.nepxchange.R;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import javax.inject.Inject;

public class HomePresenter extends BasePresenter<HomeView> {

    ItemsResponse itemsResponse;


    Context c;
    @Inject
    HomePresenter(){}


    @Override
    public void attachView(HomeView mvpView) {
        super.attachView(mvpView);
    }

    @Override
    public void detachView() {
        super.detachView();
    }


    public  void getCategoriesList(String json){

        Gson gson = new Gson();
        try {
            itemsResponse = gson.fromJson(json, ItemsResponse.class);
            getMvpView().getCategory(itemsResponse.getCategory());
        }
        catch (Exception ex){

            getMvpView().getCategoryError(ex.getMessage());



        }


    }

}
