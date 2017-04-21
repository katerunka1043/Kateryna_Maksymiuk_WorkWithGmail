package com.epam.lab;

import com.epam.lab.business.EMailPageBO;
import com.epam.lab.business.LoginPageBO;
import com.epam.lab.driver.MyDriver;
import com.epam.lab.model.User;

public class Main{
    private static MyDriver driver;
    private static EMailPageBO mail;
    private static LoginPageBO login;


    public Main() {
        driver = new MyDriver();
        //driver.setUrlPage(PAGE_URL);
        login=new LoginPageBO(driver.getDriver());
        mail = new EMailPageBO(driver.getDriver());

    }

    public static void main(String[] args) {
//        User user = new User("maksymiuk.kate@gmail.com", "katemaksymiuk5");
//        Main main = new Main();
//        login.login(user);
//        mail.markLetters();
//        mail.markAsImportant();
//        mail.verifyIfLettersImportant();
//        mail.deleteImportantLettersVerifyIfDeleted();
//        driver.getDriver().quit();
    }




    }

