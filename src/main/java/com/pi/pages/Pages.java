package com.pi.pages;

import com.pi.components.Element;
import com.pi.components.Locator;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.Collectors;

import static com.pi.pages.Browser.driver;

public class Pages {

    public static void setUpChromeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    public static HomePage homePage() {
        return new HomePage();
    }

    public static LoginPage loginPage() {
        return PageFactory.initElements(driver, LoginPage.class);
    }

    public void goTo(String url) {
        if (url.endsWith("/")) url = url.substring(0, url.length()-2);
        Browser.goTo(url);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public List<Element> findElementsBy(final Locator locator) {
        return driver.findElements(locator.getBy())
                .stream()
                .map(Element::new)
                .collect(Collectors.toList());
    }

    public Element findElementBy(final Locator locator) {
        return new Element(driver.findElement(locator.getBy()));
    }

    public void refreshPage() {
        driver.navigate().refresh();
    }

    public boolean isDisplayedElementBy(final Locator locator) {
        return driver.findElement(locator.getBy()).isDisplayed();
    }

    public static boolean isDisplayedElementBy(WebElement element) {
        return element.isDisplayed();
    }

    public void close() {
        Browser.close();
    }
}
