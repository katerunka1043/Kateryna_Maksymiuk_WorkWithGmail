package com.epam.lab.page;
import com.epam.lab.Util.MyDecorator;
import com.epam.lab.page.elements.Button;
import com.epam.lab.page.elements.DropElement;
import com.epam.lab.page.elements.Element;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EMailPage {
    private WebDriver driver;
    @FindBy(css = "span.bjy")
    private Element doMore;
    @FindBy(xpath = ".//*[@class='J-M aX0 aYO jQjAxd']/div/div[4]/div")
    private DropElement markImportant;
    @FindBy(css = "span.CJ")
    private DropElement leftMenu;
    @FindBy(css = "span.nU  a[title='Важливі']")
    private DropElement importantFolder;
    @FindBy(xpath = ".//*[@id=':5']/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div/div")
    private Button deleteButton;
    @FindBy(xpath = ".//*[@class='TO']/div/div[2]/span/a")
    private Element incomeLetters;
    @FindBy(xpath = ".//*[@class='UI']/div/div/div[2]/div/table/tbody/tr")
    private List<WebElement> lettersList;
    @FindBy(xpath = ".//*[@class='ae4 UI']/div/div/table/tbody/tr")
    private List<WebElement> importantLettersList;

    public EMailPage(WebDriver driver) {
        PageFactory.initElements(new MyDecorator(driver), this);
        this.setDriver(driver);
    }

    public List<WebElement> getLettersList() {
        return lettersList;
    }

    public List<WebElement> getImportantLettersList() {
        return importantLettersList;
    }

    public void setImportantLettersList(List<WebElement> importantLettersList) {
        this.importantLettersList = importantLettersList;
    }

    public Button getDeleteButton() {
        return deleteButton;
    }

    public Element getIncomeLetters() {
        return incomeLetters;
    }

    public void setIncomeLetters(Element incomeLetters) {
        this.incomeLetters = incomeLetters;
    }

    public DropElement getLeftMenu() {
        return leftMenu;
    }

    public void setLeftMenu(DropElement leftMenu) {
        this.leftMenu = leftMenu;
    }

    public DropElement getImportantFolder() {
        return importantFolder;
    }

    public void setImportantFolder(DropElement importantFolder) {
        this.importantFolder = importantFolder;
    }

    public Element getDoMore() {
        return doMore;
    }

    public void setDoMore(Element doMore) {
        this.doMore = doMore;
    }

    public DropElement getMarkImportant() {
        return markImportant;
    }

    public void setMarkImportant(DropElement markImportant) {
        this.markImportant = markImportant;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

}