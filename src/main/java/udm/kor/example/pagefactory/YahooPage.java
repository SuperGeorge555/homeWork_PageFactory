package udm.kor.example.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class YahooPage extends PageFactory{
    WebDriver driver;
    private final String X_PATH_TEXT = "//input[@type ='text']";

    public YahooPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void findElements() {
        List<WebElement> listWebElement = driver.findElements(By.tagName("data-06c"));
        System.out.println(listWebElement.size());
    }

    @Override
    public void writeText(String xPath) {
        WebElement element = driver.findElement(By.xpath(X_PATH_TEXT));
        element.sendKeys("Page Factory");
        element.sendKeys(Keys.ENTER);
    }


}
