package udm.kor.example.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class YandexPage extends CustomPageFactory {


    public YandexPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getX_PATH_TEXT() {
        return X_PATH_TEXT;
    }

    private final String X_PATH_TEXT = "//input[@id = 'text']";
    WebDriver driver;

    @Override
    public void findElements() {
        List<WebElement> listWebElement = driver.findElements(By.tagName("data-fast"));
        System.out.println(listWebElement.size());
    }

    @Override
    public void search(String xPath) {
        WebElement element = driver.findElement(By.xpath(X_PATH_TEXT));
        element.sendKeys("Page Factory");
        element.sendKeys(Keys.ENTER);
    }

    @Override
    public void open() {

    }
}
