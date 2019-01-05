package com.example.roshan.nepxchange.Dagger.Modules;

import android.app.Application;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.concurrent.TimeUnit;

import javax.inject.Singleton;

import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetModule {

    String mBaseUrl;
    Application mApplication;

    // Constructor needs one parameter to instantiate.
    public NetModule(Application application, String baseUrl) {

        this.mBaseUrl = baseUrl;
        this.mApplication=application;
    }

//    @Provides
//    @Singleton
    Cache provideOkHttpCache() {
        int cacheSize = 10 * 1024 * 1024; // 10 MiB
        Cache cache = new Cache(mApplication.getCacheDir(), cacheSize);
        return cache;
    }

//    @Provides
//    @Singleton
    Gson provideGson() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES);
        return gsonBuilder.create();
    }

//    @Provides
//    @Singleton
    OkHttpClient provideOkHttpClient(Cache cache) {
        OkHttpClient client = new OkHttpClient
                .Builder().cache(cache)
//                .addNetworkInterceptor(new StethoInterceptor())
//                .addInterceptor(new HttpInterceptor(mApplication))
//                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .writeTimeout(30, TimeUnit.SECONDS)
                .readTimeout(15,TimeUnit.SECONDS)
                .build();

        return client;
    }

//    @Provides
//    @Singleton
    Retrofit provideRetrofit(Gson gson, OkHttpClient okHttpClient) {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .baseUrl(mBaseUrl)
                .client(okHttpClient)
                .build();
        return retrofit;
    }
}
