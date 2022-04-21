package com.pi.pages;

import com.pi.configuration.Configuration;

public class HomePage {

    private final String url = "http://192.168.0.88/";
    private final String title = "edytaPI – Kolejna witryna oparta na WordPressie";

    public void goTo()
    {
        goTo(url);
    }

    public void goTo(String url){
        Browser.goTo(url);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isAt(){
        return Browser.getTittle().equalsIgnoreCase(title);
    }
}
