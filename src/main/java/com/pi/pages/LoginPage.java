package com.pi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindAll({
            @FindBy(css = "input[name='username']"),
            @FindBy(css = "input[name='email']"),
            @FindBy(css = "input[name='log']"),
            @FindBy(css = "input[name='login']"),
    })
    private WebElement loginInput;

    @FindAll({
            @FindBy(css = "input[name='password']"),
            @FindBy(css = "input[name='pwd']"),
    })
    private WebElement passwordInput;

    @FindAll({
            @FindBy(css = "button[name='wp-submit']"),
            @FindBy(css = "button[name='submit']"),
            @FindBy(css = "button[name='login']"),
            @FindBy(xpath = "//input[@type='submit' and @value='Zaloguj się']")
    })
    private WebElement submitButton;
    private final String url = "http://192.168.0.88/wp-login.php";
    private final String tittle = "Zaloguj się ‹ edytaPI — WordPress";

    public LoginPage(WebDriver driver) {
    }

    public LoginPage() {
    }

    public void logOnPage(String login, String password)
    {
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        submitButton.click();
    }

    public void goTo()
    {
        Browser.goTo(url);
    }

    public boolean isAt(){
        return Browser.getTittle().equalsIgnoreCase(tittle);
    }

}
//postawić linux php - lampa, przykładowa strona np wordpress w VB i najnopwszego ubuntu +apache mysql php wykład 4 w ask
//puti zeby mozliwe bylo logowanie z win do servera
//postawic swoj setrwer ze swoja strona
//napisaz ze obowiazywal charlie-crp, powstala wlasna strona na serwerze lokanym pozwolina na testy bez ingerencji ale mozna wykorzystach do oiinych zewnetrzych serwerow