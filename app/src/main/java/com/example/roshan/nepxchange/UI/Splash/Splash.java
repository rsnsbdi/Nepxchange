package com.example.roshan.nepxchange.UI.Splash;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Base64;
import android.util.Log;

import com.example.roshan.nepxchange.Base.BaseActivity;
import com.example.roshan.nepxchange.MainActivity;
import com.example.roshan.nepxchange.R;
import com.example.roshan.nepxchange.UI.Login.LoginActivity;
import com.example.roshan.nepxchange.Utility.SessionManager;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

public class Splash extends BaseActivity implements SplashView {

    SplashPresenter mPresenter;

    SessionManager manager;

    String id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Log.e("SplashActivity","Launched");

        Intent intent= new Intent(this,LoginActivity.class);
        startActivity(intent);

//        mPresenter.attachView(this);
//        Log.d("hash=",printHashKey(this));
//
//        final String type = getIntent().getStringExtra("type");
//        final String mFor = getIntent().getStringExtra("for");
//
//        Observable.timer(1000, TimeUnit.MILLISECONDS)
//                .subscribeOn(Schedulers.newThread())
//                .observeOn(AndroidSchedulers.mainThread())
//                .subscribe(new Action1<Long>() {
//                    @Override
//                    public void call(Long aLong) {
//                        if(type != null && mFor != null){
//                            checkLogged(type,mFor);
//                        }else
//                            {
//                            onNewIntent(getIntent());
//                            }
//                        //Toast.makeText(Splash.this, "2ndScreen ", Toast.LENGTH_SHORT).show();
//                    }
//                });
//
//    }
//
//    private void checkLogged(String type, String mFor) {
//        //TODO Check login status.
//        if(manager.isLoggedIn()  && manager.getVerified()==1)
//        {
//            Intent i = new Intent(getApplicationContext(), MainActivity.class);
//            i.putExtra("type",type);
//            i.putExtra("for",mFor);
//            startActivity(i);
//            finish();
//        }
//        else
//        {
//            Intent i = new Intent(this, LoginActivity.class);
//            startActivity(i);
//            finish();
//        }
//    }
//
//    /**
//     * Checks the intent contains data or not.
//     * If intent contains data then starts survey or
//     * if intent is empty then loads default 2nd screen.
//     * @param intent
//     */
//    protected void onNewIntent(Intent intent) {
//
//        String action = intent.getAction();
//        String data = intent.getDataString();
//
//        if (Intent.ACTION_VIEW.equals(action) && data != null) {
//            char character = data.charAt(data.length() -1);
//            if(character =='/'){
//                id = data.substring(31,data.length()-1);
//                Log.d("datatrue",id);
//
//            }else{
//                id = data.substring(31);
//                Log.d("data",id);
//            }
//            if(id.contains("/")){
//                id = id.substring(1);
//            }
//        }
//        else
//            {
//            if(manager.isLoggedIn() && manager.getVerified()==1){
//            Intent i = new Intent(this, MainActivity.class);
//            startActivity(i);
//            finish();
//            }
//            else
//                {
//            Intent i = new Intent(this, LoginActivity.class);
//            startActivity(i);
//            finish();
//        }
//        }
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//    }
//
//    public static String printHashKey(Context ctx) {
//        // Add code to print out the key hash
//        try {
//            PackageInfo info = ctx.getPackageManager().getPackageInfo(ctx.getPackageName(), PackageManager.GET_SIGNATURES);
//            for (Signature signature : info.signatures) {
//                MessageDigest md = MessageDigest.getInstance("SHA");
//                md.update(signature.toByteArray());
//                return Base64.encodeToString(md.digest(), Base64.DEFAULT);
//            }
//        } catch (PackageManager.NameNotFoundException e) {
//            return "SHA-1 generation: the key count not be generated: NameNotFoundException thrown";
//        } catch (NoSuchAlgorithmException e) {
//            return "SHA-1 generation: the key count not be generated: NoSuchAlgorithmException thrown";
//        }
//        return "SHA-1 generation: epic failed";
   }
}
