package com.example.roshan.nepxchange.Dagger.Modules;

import com.example.roshan.nepxchange.Networking.APIInterface;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import retrofit2.Retrofit;

@Module
public class APIModule {
    @Provides
    @Singleton
    public APIInterface providesApiInterface(Retrofit retrofit) {
        return retrofit.create(APIInterface.class);
    }
}
