package udm.kor.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import udm.kor.example.utils.WebDriverUtil;

import java.util.List;
import java.util.Random;

public class ResultBookPage {

    private final String CLASS_NAME = "//div/input[@class ='ui-h6 ui-h7 ui-a8c']";
    private final static String CHECK_BOX = "//div//span[contains(text(), 'Товары со скидкой')]";
    private final static String FILTERED_BOOKS = "//div[@data-widget = 'searchResultsV2']//div[contains(@class,'iu2')]";

    private final WebDriver driver;

    public ResultBookPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setPrice(){
        List<WebElement> listPrices = driver.findElements(By.xpath(CLASS_NAME));
        String s = listPrices.get(0).getAttribute("value");
        WebDriverUtil.clear(listPrices.get(0));
        listPrices.get(0).sendKeys("1000");
        listPrices.get(0).sendKeys(Keys.TAB);
    }

    public void salesBook(){
        WebElement checkBox = driver.findElement(By.xpath(CHECK_BOX));
        checkBox.click();
    }

    public void takeBook(){
        List<WebElement> filteredBooks = driver.findElements(By.xpath(FILTERED_BOOKS));
        WebElement randomBook = filteredBooks.get(new Random().nextInt(filteredBooks.size()));
        String price = randomBook.findElement(By.xpath(".//span[contains(text(), '₽')]")).getText();
        String bookName = randomBook.findElement(By.xpath(".//span[contains(text(), '| Задорнов Михаил Николаевич')]")).getText();
        System.out.println("Цена книги: " + price);
        System.out.println("Название книги: " + bookName);
        WebElement buyBook = randomBook.findElement(By.xpath(".//span[contains(text(),'В корзину')]"));
        buyBook.click();
    }
}
