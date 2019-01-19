package com.example.roshan.nepxchange.Utility;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

import com.example.roshan.nepxchange.Model.Session;
import com.example.roshan.nepxchange.Model.Token;
import com.example.roshan.nepxchange.Model.User;
import com.example.roshan.nepxchange.R;
import com.example.roshan.nepxchange.UI.CustomViews.BadgeViewDrawable;
import com.google.gson.Gson;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility {

    private static final String prefsName="com.example.roshan.nepxchange";
    public static void setBadgeCount(Context context, LayerDrawable icon, String count) {

        BadgeViewDrawable badge;

        // Reuse drawable if possible


//        Drawable reuse = icon.findDrawableByLayerId(R.id.ic_badge);
//        if (reuse != null && reuse instanceof BadgeViewDrawable) {
//            badge = (BadgeViewDrawable) reuse;
//        } else {
//            badge = new BadgeViewDrawable(context);
//        }
//
//        badge.setCount(count);
//        icon.mutate();


  //Not Used Code-----      icon.setDrawableByLayerId(R.id.ic_badge, badge);
    }

    public static void  saveSession(Context context, Session s){
        SharedPreferences sharedPreferences = context.getSharedPreferences(prefsName,Context.MODE_PRIVATE);
        saveTokenPreferrences(context,s.getToken());
    }

    public static void saveTokenPreferrences(Context context, Token responseToken) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(prefsName,Context.MODE_PRIVATE);
        sharedPreferences.edit().putString("token",responseToken.getAccess_token()).apply();
        sharedPreferences.edit().putString("refresh_token",responseToken.getRefresh_token()).apply();

    }

    public static Session getActiveSession(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(prefsName,Context.MODE_PRIVATE);
        String accessToken = sharedPreferences.getString("token","");
        String refreshToken = sharedPreferences.getString("refresh_token","");
        Token token = new Token();
        token.setAccess_token(accessToken);
        token.setRefresh_token(refreshToken);
        Session s = new Session(token);
        return s;
    }

    public static void  saveProfile(Context context, User user){
        SharedPreferences sharedPreferences = context.getSharedPreferences(prefsName,Context.MODE_PRIVATE);
        SharedPreferences.Editor prefsEditor = sharedPreferences.edit();
        Gson gson = new Gson();
        String json = gson.toJson(user);
        prefsEditor.putString("profile", json);
        prefsEditor.commit();
    }

    public static User  getProfile(Context context){

        SharedPreferences sharedPreferences = context.getSharedPreferences(prefsName,Context.MODE_PRIVATE);
        Gson gson = new Gson();
        String json = sharedPreferences.getString("profile", "");
        User user = gson.fromJson(json, User.class);
        return user;
    }

    public static boolean isEmailValid(String email) {
        String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

}
