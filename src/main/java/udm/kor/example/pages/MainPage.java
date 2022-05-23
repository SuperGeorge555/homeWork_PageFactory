package udm.kor.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    private final WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void findItem(String string) {
        WebElement findOzon = driver.findElement(By.xpath("//input[@placeholder='Искать на Ozon']"));
        findOzon.sendKeys("Михаил Задорнов Книги");
        findOzon.sendKeys(Keys.ENTER);
    }

}
