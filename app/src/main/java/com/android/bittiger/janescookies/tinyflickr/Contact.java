package com.android.bittiger.janescookies.tinyflickr;

import android.util.Log;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;


public class Contact {

    private String name="default";
    public ImageView image=null;

    public static int NoItems = 0;
    private static final String TAG = "Contact" ;

    private static Contact instance = getInstance();

    public static Contact getInstance() {
        if (instance == null) {
            instance = new Contact();
        }

        return instance;
    }

    public String getName() {
        return name;
    }

    public ImageView getImage() {
        return image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImage() {
        Log.d(TAG, "setImage now " );

    }


    public static List<Contact> generateSampleList(int samples){
        List<Contact> list = new ArrayList<>();

        for(int i= 0 ; i < samples; i++){
            Contact contact = getInstance();
            contact.setName("Name - " + i);

            list.add(contact);
        }
        return list;
    }


}
