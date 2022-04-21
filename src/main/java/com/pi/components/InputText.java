package com.pi.components;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class InputText extends Element {
    List<String> commands;

    public InputText(WebElement element) {
        super(element);
        commands = new ArrayList<>();
        commands.add("sendKeys");
        commands.add("clear");
    }

    public List<String> getCommands() {
        return commands;
    }
}
