package com.example.roshan.nepxchange.UI.home;

import com.example.roshan.nepxchange.Base.MVPView;
import com.example.roshan.nepxchange.Model.homeModels.Category;

import java.util.ArrayList;
import java.util.List;

public interface HomeView extends MVPView{
    void getCategory(List<Category> categories);
    void getCategoryError(String s);
}
