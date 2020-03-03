package com.example.homework2;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

public class Item {
    Drawable profile;
    String name;
    public void setProfile(Drawable picture){
        profile = picture;
    }
    public void setName(String text){
        name= text;
    }
    public Drawable getProfile(){
        return profile;
    }
    public String getName(){
        return name;
    }
}
