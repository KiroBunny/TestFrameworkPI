package com.pi.pages;

public class HomePage {

    private static String url = "http://platforma.polsl.pl/rm";
    private String title = "Platforma Zdalnej Edukacji Wydziału Inżynierii Materiałowej";

    public void goTo()
    {
        Browser.goTo(url);
    }

    public boolean isAt(){
        return Browser.getTittle().equalsIgnoreCase(title);
    }
}
