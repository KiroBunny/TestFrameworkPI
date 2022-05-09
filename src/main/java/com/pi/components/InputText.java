package com.pi.components;

import com.pi.pages.Browser;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class InputText extends Element {
    List<String> commands;

    public InputText(Locator by) {
        super(Browser.driver.findElement(by.getBy()));
        commands = new ArrayList<>();
        commands.add("sendKeys");
        commands.add("clear");
    }

    public List<String> getCommands() {
        return commands;
    }
}
