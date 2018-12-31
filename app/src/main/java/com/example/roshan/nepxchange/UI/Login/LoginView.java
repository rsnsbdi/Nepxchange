package com.example.roshan.nepxchange.UI.Login;

import com.example.roshan.nepxchange.Base.MVPView;
import com.example.roshan.nepxchange.Model.User;

public interface LoginView extends MVPView {

//    void onLoginSucess(LoginResponse response);

    void onLoginFailed(String message);

    void onUnverfiedUser(String email, String mobile);

    void onInvalidPassword(String message);

    void onUsernameInvalid(String message);

    void onProfileFetchSucess(User data) ;

    void onProfileLoadError(String message) ;

}
