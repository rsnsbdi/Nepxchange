package com.example.roshan.nepxchange.Utility;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.example.roshan.nepxchange.UI.Login.LoginActivity;

import javax.inject.Inject;

public class SessionManager {

    // Shared Preferences
    SharedPreferences pref;

    // Editor for Shared preferences
    SharedPreferences.Editor editor;

    // Context
    Activity _context;

    // Shared pref mode
    int PRIVATE_MODE = 0;

    // Sharedpref file name
    private static final String PREF_NAME = "com.magnify.resume";

    // All Shared Preferences Keys
    private static final String IS_LOGIN = "IsLoggedIn";

    // User name (make variable public to access from outside)
    public static final String KEY_TYPE = "user_type";

    // Email address (make variable public to access from outside)
    public static final String KEY_EMAIL = "email";

    public static final String KEY_FNAME = "fname";
    public static final String KEY_LNAME = "lname";

    public static final String KEY_IMAGE = "pic";
    private static final  String KEY_HEADLINE="headline";
    private static final String KEY_SCORE = "score";
    private static final String KEY_DAY = "day";
    private static final String KEY_VERIFIED = "verified";

    // Constructor
    Context context;
    @Inject
    public SessionManager(Context context){
        this.context = context;
        pref = context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }
    /**
     * Create login session
     * */
    public void createLoginSession( ){

        // Storing login value as TRUE
        editor.putBoolean(IS_LOGIN, true);
        // Storing name in pref
        // Storing email in pref
        // commit changes
        editor.commit();
    }

    public void saveScore(int score,int days){
        editor.putInt(KEY_SCORE,score);
        editor.putInt(KEY_DAY,days);
        editor.commit();

    }

    public void setVerified(int verified){

        editor.putInt(KEY_VERIFIED,verified);
        editor.commit();
    }
    public int getVerified(){

        return pref.getInt(KEY_VERIFIED,0);

    }
    public int getScore(){
        return pref.getInt(KEY_SCORE,0);
    }

    public int getDays(){
        return pref.getInt(KEY_DAY,0);
    }
    /**
     * Check login method wil check user login status
     * If false it will redirect user to login page
     * Else won't do anything
     * */
    public void checkLogin(){
        // Check login status
        if(!this.isLoggedIn()){
            // user is not logged in redirect him to Login Activity
            Intent i = new Intent(context, LoginActivity.class);
            // Closing all the Activities
            i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            // Add new Flag to start new Activity
            i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            // Staring Login Activity
            context.startActivity(i);
        }
    }

    /**
     * Get stored session data
     * */
    public int  getUserType(){
        // return user
        return pref.getInt(KEY_TYPE,0);
    }

    /**
     * Clear session details
     * */
    public void logoutUser(){
        // Clearing all data from Shared Preferences
        editor.clear();
        editor.commit();
        // After logout redirect user to Loing Activity
        Intent i = new Intent(context, LoginActivity.class);
        // Closing all the Activities
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        // Staring Login Activity
        context.startActivity(i);
    }
    /**
     * Quick check for login
     * **/
    // Get Login State
    public boolean isLoggedIn(){
        return pref.getBoolean(IS_LOGIN, false);
    }

}
