package com.example.roshan.nepxchange.UI.home;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.roshan.nepxchange.Base.BaseActivity;
import com.example.roshan.nepxchange.Model.homeModels.Category;
import com.example.roshan.nepxchange.R;
import com.example.roshan.nepxchange.UI.Login.LoginActivity;
import com.example.roshan.nepxchange.UI.home.adapter.HomeCategoryAdapter;
import com.example.roshan.nepxchange.Utility.SessionManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class HomeActivity extends BaseActivity implements HomeView {

    @Inject
    HomePresenter mPresenter;

    SessionManager manager;

    RecyclerView recyclerView;

    String id;
    List<Category> categories;

    @Inject
    HomeActivity(){}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        getActivityComponent().inject(this);
        mPresenter.attachView(this);

        recyclerView = findViewById(R.id.home_recycleview);
        mPresenter.getCategoriesList(jsongData());


    }

    @Override
    public void getCategory(List<Category> categories) {

        this.categories = categories;
        initRecyclerView();
    }

    @Override
    public void getCategoryError(String s) {

        Toast.makeText(this, s, Toast.LENGTH_LONG).show();

    }

    private void initRecyclerView() {
//        Log.d(TAG, "initRecyclerView: init recyclerview.");

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        HomeCategoryAdapter homeCategoryAdapter = new HomeCategoryAdapter();
        homeCategoryAdapter.init(this, categories);
        recyclerView.setAdapter(homeCategoryAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private String jsongData() {

        String ret = "";

        String data = null;

        StringBuffer stringBuffer = new StringBuffer();

        InputStream stream = this.getResources().openRawResource(R.raw.response);

        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));

        if (stream != null) {
            try {

                while ((ret = reader.readLine()) != null) {
                    stringBuffer.append(ret);
                }

//                Log.d("OUTPUT", stringBuffer.toString());
                stream.close();

                data = stringBuffer.toString();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return data;
    }

}