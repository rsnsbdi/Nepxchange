package com.example.roshan.nepxchange.Dagger.Components;

import com.example.roshan.nepxchange.Dagger.Modules.APIModule;
import com.example.roshan.nepxchange.Dagger.Modules.AppModule;
import com.example.roshan.nepxchange.Dagger.Modules.NetModule;
import com.example.roshan.nepxchange.Nepxchange;
import com.example.roshan.nepxchange.Networking.APIInterface;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, NetModule.class, APIModule.class})
public interface AppComponent{

    APIInterface apiInterface();
//    RealmDatabase database();
    void inject(Nepxchange nepxchange);

}

