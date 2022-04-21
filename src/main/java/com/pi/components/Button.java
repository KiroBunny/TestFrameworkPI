package com.pi.components;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Button extends Element{
    List<String> commands;

    public Button(WebElement element) {
        super(element);
        commands = new ArrayList<>();
        commands.add("click");
        commands.add("submit");
    }

    public List<String> getCommands() {
        return commands;
    }
}
