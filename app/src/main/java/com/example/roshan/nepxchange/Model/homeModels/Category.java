package com.example.roshan.nepxchange.Model.homeModels;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class Category{
  @SerializedName("cat_name")
  @Expose
  private String cat_name;
  @SerializedName("cat_id")
  @Expose
  private Integer cat_id;
  public void setCat_name(String cat_name){
   this.cat_name=cat_name;
  }
  public String getCat_name(){
   return cat_name;
  }
  public void setCat_id(Integer cat_id){
   this.cat_id=cat_id;
  }
  public Integer getCat_id(){
   return cat_id;
  }
}