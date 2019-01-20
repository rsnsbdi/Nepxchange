package com.example.roshan.nepxchange.Model.homeModels;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
/**
 * Awesome Pojo Generator
 * */
public class ItemsResponse{
  @SerializedName("wishlist_count")
  @Expose
  private Integer wishlist_count;
  @SerializedName("normal_credit")
  @Expose
  private Integer normal_credit;
  @SerializedName("discounted_credit")
  @Expose
  private Integer discounted_credit;
  @SerializedName("data")
  @Expose
  private List<Data> data;
  @SerializedName("unread_notification")
  @Expose
  private Integer unread_notification;
  @SerializedName("vehicles_count")
  @Expose
  private Integer vehicles_count;
  @SerializedName("onreview")
  @Expose
  private Integer onreview;
  @SerializedName("promotion_mode")
  @Expose
  private Integer promotion_mode;
  @SerializedName("error")
  @Expose
  private Boolean error;
  @SerializedName("category")
  @Expose
  private List<Category> category;
  public void setWishlist_count(Integer wishlist_count){
   this.wishlist_count=wishlist_count;
  }
  public Integer getWishlist_count(){
   return wishlist_count;
  }
  public void setNormal_credit(Integer normal_credit){
   this.normal_credit=normal_credit;
  }
  public Integer getNormal_credit(){
   return normal_credit;
  }
  public void setDiscounted_credit(Integer discounted_credit){
   this.discounted_credit=discounted_credit;
  }
  public Integer getDiscounted_credit(){
   return discounted_credit;
  }
  public void setData(List<Data> data){
   this.data=data;
  }
  public List<Data> getData(){
   return data;
  }
  public void setUnread_notification(Integer unread_notification){
   this.unread_notification=unread_notification;
  }
  public Integer getUnread_notification(){
   return unread_notification;
  }
  public void setVehicles_count(Integer vehicles_count){
   this.vehicles_count=vehicles_count;
  }
  public Integer getVehicles_count(){
   return vehicles_count;
  }
  public void setOnreview(Integer onreview){
   this.onreview=onreview;
  }
  public Integer getOnreview(){
   return onreview;
  }
  public void setPromotion_mode(Integer promotion_mode){
   this.promotion_mode=promotion_mode;
  }
  public Integer getPromotion_mode(){
   return promotion_mode;
  }
  public void setError(Boolean error){
   this.error=error;
  }
  public Boolean getError(){
   return error;
  }
  public void setCategory(List<Category> category){
   this.category=category;
  }
  public List<Category> getCategory(){
   return category;
  }
}