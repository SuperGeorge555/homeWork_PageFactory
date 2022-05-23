package udm.kor.example.pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class PageFactory {

    private WebDriver driver;
    public abstract void findElements();
    public abstract void writeText(String xPath);

    /*
    зайти на сайт
    выполнить поиск
    найти элементы и сохранить это в список
     */


}
