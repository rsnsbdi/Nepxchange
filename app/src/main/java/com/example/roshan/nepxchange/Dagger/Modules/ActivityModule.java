package com.example.roshan.nepxchange.Dagger.Modules;

import android.app.Activity;
import android.content.Context;

import com.example.roshan.nepxchange.Utility.SessionManager;

import dagger.Provides;

public class ActivityModule {

    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }

  //  @Provides
    Activity provideActivity() {
        return mActivity;
    }

//    @Provides
    Context providesContext() {
        return mActivity;
    }

//    @Provides
//    @PerActivity
//    FormValidator provideFormValidator(){return new FormValidator();
//    }

//    @Provides
//    FaceBookLoginModule getFbLoginModule(Context context){
//        return new FaceBookLoginModule(context);
//    }

  //  @Provides
    SessionManager provideSessionManager(Context context){
        return new SessionManager(context);
    }
    
}
