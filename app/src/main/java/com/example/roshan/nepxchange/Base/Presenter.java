package com.example.roshan.nepxchange.Base;

public interface Presenter<V extends MVPView> {

    void attachView(V mvpView);

    void detachView();
}
