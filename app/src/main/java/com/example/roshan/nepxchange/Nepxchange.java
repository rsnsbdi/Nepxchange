package com.example.roshan.nepxchange;

import android.app.Application;

import com.example.roshan.nepxchange.Dagger.Injector;
import com.facebook.stetho.Stetho;
import com.uphyca.stetho_realm.RealmInspectorModulesProvider;

public class Nepxchange extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Injector.initializeApplicationComponent(this);
        Injector.getAppComponent().inject(this);

//        database.setup();

        Stetho.initialize(Stetho.newInitializerBuilder(this)
                .enableDumpapp(Stetho.defaultDumperPluginsProvider(this))
                .enableWebKitInspector(RealmInspectorModulesProvider.builder(this).build())
                .build());
    }
}
