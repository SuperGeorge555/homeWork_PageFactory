package udm.kor.example.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GooglePage extends CustomPageFactory {

    @FindBy(xpath = "//input[@type = 'text']")
    WebElement text;

    @FindBy(xpath = "//div[@data-sokoban-container]")
    List<WebElement> listOfSearch;

    WebDriver driver;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Override
    public void findElements() {
        listOfSearch.size();
    }

    @Override
    public void search(String search) {
        text.sendKeys(search);
        text.sendKeys(Keys.ENTER);
    }

    @Override
    public void open() {
        driver.get("https://www.google.ru/");
    }
}
