package com.epam.lab;


import com.epam.lab.business.EMailPageBO;
import com.epam.lab.business.LoginPageBO;
import com.epam.lab.driver.MyDriver;
import com.epam.lab.model.User;
import org.testng.annotations.*;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertNotNull;

public class WorkWithGmailTest {
    private User user;
    @BeforeMethod
    public void setDriver() {


        MyDriver.getDriver();
}
    @DataProvider(name = "testGmail", parallel = true)
    public Object[][] getUsers() {

        return new Object[][] {{new User("katerunka.matv@gmail.com", "5275052750k")}, {new User("maksymiuk.kate@gmail.com", "katemaksymiuk5")},
                {new User("kate.test1992@gmail.com", "test1992")}   };
    }
    @Test(dataProvider = "getUsers")
    public void importantLetters(User userTest){
        System.out.println(Thread.currentThread().getId());

        LoginPageBO login=new LoginPageBO(MyDriver.getDriver());
        EMailPageBO mail = new EMailPageBO(MyDriver.getDriver());
        assertNotNull(userTest.getUserName());
        login.login(userTest);

        mail.markLetters();
        mail.markAsImportant();
        mail.verifyIfLettersImportant();
        int importantLettersSize = mail.getMailPage().getImportantLettersList().size();
        assertEquals(importantLettersSize, 1);
        mail.deleteImportantLettersVerifyIfDeleted();
        MyDriver.getDriver().close();
    }
    @AfterMethod
    public void quit(){
        MyDriver.getDriver().quit();

    }
}
