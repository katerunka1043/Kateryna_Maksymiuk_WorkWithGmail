package com.epam.lab.business;

import com.epam.lab.model.User;
import com.epam.lab.page.LoginPage;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;


import static com.epam.lab.driver.MyDriver.getDriver;
import static java.util.concurrent.TimeUnit.SECONDS;

public class LoginPageBO {
    private LoginPage loginPage;
    public static final String PAGE_URL ="https://mail.google.com";

    public LoginPageBO(WebDriver driver) {
        this.loginPage = new LoginPage(driver);
       loadPage(PAGE_URL);
    }
    public static void loadPage(String url) {

        getDriver().get(url);
    }
    Wait wait = new FluentWait(getDriver())

            .withTimeout(3, SECONDS)

            .pollingEvery(3, SECONDS)

            .ignoring(NoSuchElementException.class);
    public void login(User user) {
        loginPage.getLog().sendKeys(user.getUserName());
        loginPage.getLog().submit();

        loginPage.getPassw().sendKeys(user.getUserPass());
        loginPage.getPassw().submit();
    }


}
