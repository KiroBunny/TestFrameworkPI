package com.pi.components;

import com.pi.pages.Browser;
import org.openqa.selenium.WebElement;

import java.awt.Button;
import java.util.ArrayList;
import java.util.List;

public class CheckBox extends Element{
    List<String> commands;

    public CheckBox(Locator by) {
        super(Browser.driver.findElement(by.getBy()));
        commands = new ArrayList<>();
        commands.add("click");
        commands.add("isSelected");
    }
}
