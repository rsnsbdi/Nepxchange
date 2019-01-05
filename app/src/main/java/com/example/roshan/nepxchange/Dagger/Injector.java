package com.example.roshan.nepxchange.Dagger;

import com.example.roshan.nepxchange.Base.BaseActivity;
import com.example.roshan.nepxchange.Constants.Constants;
import com.example.roshan.nepxchange.Dagger.Components.ActivityComponent;
import com.example.roshan.nepxchange.Dagger.Components.AppComponent;
import com.example.roshan.nepxchange.Dagger.Components.DaggerActivityComponent;
import com.example.roshan.nepxchange.Dagger.Components.DaggerAppComponent;
import com.example.roshan.nepxchange.Dagger.Modules.APIModule;
import com.example.roshan.nepxchange.Dagger.Modules.ActivityModule;
import com.example.roshan.nepxchange.Dagger.Modules.AppModule;
import com.example.roshan.nepxchange.Dagger.Modules.NetModule;
import com.example.roshan.nepxchange.Nepxchange;

public class Injector {

    private static AppComponent mAppComponent;
    private static ActivityComponent mActivityComponent;
//    private static FragmentComponent mFragmentComponent;
//    private static DialogFragmentComponent dialogFragmentComponent;

    private Injector() {
    }

    public static void initializeApplicationComponent(Nepxchange application) {
        mAppComponent = DaggerAppComponent.builder()
                // list of modules that are part of this component need to be created here too
                .appModule(new AppModule(application))
                .netModule(new NetModule(application, Constants.BASE_URL))
                .aPIModule(new APIModule())
                .build();
    }

    public static AppComponent getAppComponent() {
        return mAppComponent;
    }

    public static void initialiseActivityComponent(BaseActivity activity) {
        mActivityComponent = DaggerActivityComponent.builder()
                .appComponent(getAppComponent())
                // list of modules that are part of this component need to be created here too
                .activityModule(new ActivityModule(activity))
  //              .realmModule(new RealmModule())
                .build();
    }

    public static ActivityComponent getActivityComponent() {
        return mActivityComponent;
    }

}
