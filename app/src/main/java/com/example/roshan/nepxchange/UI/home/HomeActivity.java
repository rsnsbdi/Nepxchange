package com.example.roshan.nepxchange.UI.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.roshan.nepxchange.Base.BaseActivity;
import com.example.roshan.nepxchange.R;
import com.example.roshan.nepxchange.UI.Login.LoginActivity;
import com.example.roshan.nepxchange.Utility.SessionManager;

public class HomeActivity extends BaseActivity implements HomeView {

    HomePresenter mPresenter;

    SessionManager manager;

    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);




   }
}
