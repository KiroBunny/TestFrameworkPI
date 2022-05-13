package pi;

import com.pi.pages.Browser;
import com.pi.pages.Pages;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;

public class UnitTest {

    @BeforeAll
    public static void setUp() {
        Pages.setUpChromeDriver();
    }

    @Test
    public void shouldGoToHomePage() {
        Pages.setUpChromeDriver();
        Pages.homePage().goTo("http://192.168.0.88/");
        Assertions.assertTrue(Pages.homePage().isAt());
    }

    @Test
    public void shouldLogIn() {
        Pages.loginPage().goTo();
        Assertions.assertTrue(Pages.loginPage().isAt());
        Pages.loginPage().logOnPage("login", "password");
    }

    @AfterAll
    public static void cleanUp() {
        Browser.close();
    }
}
