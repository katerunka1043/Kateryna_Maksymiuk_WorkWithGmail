package com.epam.lab.page;

import com.epam.lab.Util.MyDecorator;
import com.epam.lab.page.elements.Input;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {

    private WebDriver driver;
    @FindBy(id="Email")
    private Input log;
    @FindBy(id="Passwd")
    private Input passw;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(new MyDecorator(driver), this);
        this.driver = driver;
    }
    public Input getLog() {
        return log;
    }
    public void setLog(Input log) {
        this.log = log;
    }
    public Input getPassw() {
        return passw;
    }
    public void setPassw(Input passw) {
        this.passw = passw;
    }
    public WebDriver getDriver() {
        return driver;
    }
    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }



}