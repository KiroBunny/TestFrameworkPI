package com.pi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindAll({
            @FindBy(css = "input[name='username']"),
            @FindBy(css = "input[name='email']"),
            @FindBy(css = "input[name='name']"),
            @FindBy(css = "input[name='login']"),
    })
    private WebElement emailInput;

    @FindBy(css = "input[name='password']")
    private WebElement passwordInput;

    @FindAll({
            @FindBy(css = "button[id='submit-login']"),
            @FindBy(css = "button[id='submit']"),
            @FindBy(css = "button[id='login']"),
            @FindBy(css = "button[id='loginbtn']")
    })
    private WebElement submitButton;
    private String url;

    // private static String url = "http://platforma.polsl.pl/rm/login";

    public LoginPage(WebDriver driver) {
    }

    public LoginPage() {
    }

    public void logOnPage(String login, String password)
    {
        emailInput.sendKeys(login);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

    public void goTo()
    {
        Browser.goTo(url);
    }

    public boolean isAt(){
        return Browser.getTittle().equalsIgnoreCase("Platforma Zdalnej Edukacji Wydziału Inżynierii Materiałowej: Zaloguj się do serwisu");
    }

}
//postawić linux php - lampa, przykładowa strona np wordpress w VB i najnopwszego ubuntu +apache mysql php wykład 4 w ask
//puti zeby mozliwe bylo logowanie z win do servera
//postawic swoj setrwer ze swoja strona
//napisaz ze obowiazywal charlie-crp, powstala wlasna strona na serwerze lokanym pozwolina na testy bez ingerencji ale mozna wykorzystach do oiinych zewnetrzych serwerow