package com.example.roshan.nepxchange.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class User implements Parcelable {

    private int id;
    private String name;
    private String email;
    private String mobile;
    private String image;
    private int purchased_credit;
    private int available_credit;
    private int number_of_listings;
    private int shop=0;
    private int activated =0;
    private int verified =0;

    public int getVerified() {
        return verified;
    }

    public void setVerified(int verified) {
        this.verified = verified;
    }

    public int getActivated() {
        return activated;
    }

    public void setActivated(int activated) {
        this.activated = activated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPurchased_credit() {
        return purchased_credit;
    }

    public void setPurchased_credit(int purchased_credit) {
        this.purchased_credit = purchased_credit;
    }

    public int getAvailable_credit() {
        return available_credit;
    }

    public void setAvailable_credit(int available_credit) {
        this.available_credit = available_credit;
    }

    public int getNumber_of_listings() {
        return number_of_listings;
    }

    public void setNumber_of_listings(int number_of_listings) {
        this.number_of_listings = number_of_listings;
    }

    public int getShop() {
        return shop;
    }

    public void setShop(int shop) {
        this.shop = shop;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeString(this.name);
        dest.writeString(this.email);
        dest.writeString(this.mobile);
        dest.writeString(this.image);
        dest.writeInt(this.purchased_credit);
        dest.writeInt(this.available_credit);
        dest.writeInt(this.number_of_listings);
        dest.writeInt(this.shop);
    }

    public User() {
    }

    protected User(Parcel in) {
        this.id = in.readInt();
        this.name = in.readString();
        this.email = in.readString();
        this.mobile = in.readString();
        this.image = in.readString();
        this.purchased_credit = in.readInt();
        this.available_credit = in.readInt();
        this.number_of_listings = in.readInt();
        this.shop = in.readInt();
    }

    public static final Parcelable.Creator<User> CREATOR = new Parcelable.Creator<User>() {
        @Override
        public User createFromParcel(Parcel source) {
            return new User(source);
        }

        @Override
        public User[] newArray(int size) {
            return new User[size];
        }
    };

}
