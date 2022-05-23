package udm.kor.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasketPage {
    private static final By BASKET = By.xpath("//a[@href = '/cart']");
    private final WebDriver driver;

    public BasketPage(WebDriver driver) {
        this.driver = driver;
    }

    public void goToBasket(){
        WebElement findOzon = driver.findElement(BASKET);
        findOzon.click();
    }

}
