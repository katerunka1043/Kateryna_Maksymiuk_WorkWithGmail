package com.epam.lab.page.elements;

import org.openqa.selenium.WebElement;

public class Input extends Element{

    public Input(WebElement webElement) {
        super(webElement);
    }

    public void submit() {
        this.webElement.submit();
    }

}
