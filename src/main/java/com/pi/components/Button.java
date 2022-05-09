package com.pi.components;

import com.pi.pages.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Button extends Element{
    List<String> commands;
    Locator locator;

    public Button(Locator by) {
        super(Browser.driver.findElement(by.getBy()));
        locator = by;
        commands = new ArrayList<>();
        commands.add("click");
        commands.add("submit");
    }

    public List<String> getCommands() {
        return commands;
    }
}
