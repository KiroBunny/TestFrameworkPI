package com.pi.components;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class CheckBox extends Element{
    List<String> commands;

    public CheckBox(WebElement element) {
        super(element);
        commands = new ArrayList<>();
        commands.add("click");
        commands.add("isSelected");
    }
}
