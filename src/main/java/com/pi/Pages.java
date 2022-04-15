package com.pi;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.support.PageFactory;

import static com.pi.Browser.driver;

public class Pages {

    public static void setUpChromeDriver() {
        WebDriverManager.chromedriver().setup();
    }

    public static HomePage homePage()
    {
        return new HomePage();
    }

    public static LoginPage loginPage()
    {
        LoginPage page = PageFactory.initElements(driver, LoginPage.class);
        return page;
    }
}
