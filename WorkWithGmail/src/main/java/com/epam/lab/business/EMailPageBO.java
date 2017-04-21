package com.epam.lab.business;

import com.epam.lab.model.User;
import com.epam.lab.page.EMailPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EMailPageBO {
    private EMailPage eMailPage;
    private int COUNT = 1;

    public EMailPageBO(WebDriver driver) {
        eMailPage = new EMailPage(driver);
    }

    public void markLetters() {
        List<WebElement> lettersList = eMailPage.getLettersList();
        for (int i = 0; i < COUNT; i++) {
            lettersList.get(i).findElement(By.xpath(".//td/div")).click();
        }
    }

    public void markAsImportant() {
        eMailPage.getDoMore().click();
        eMailPage.getMarkImportant().click();
    }

    public void verifyIfLettersImportant() {
        eMailPage.getLeftMenu().click();
        eMailPage.getImportantFolder().click();
    }

    public void deleteImportantLettersVerifyIfDeleted() {
        eMailPage.getDeleteButton().click();
    }

    public EMailPage getMailPage() {
        return eMailPage;
    }

    public void setMailPage(EMailPage eMailPage) {
        this.eMailPage = eMailPage;
    }
}
