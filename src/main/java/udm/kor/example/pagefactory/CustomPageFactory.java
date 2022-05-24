package udm.kor.example.pagefactory;

import org.openqa.selenium.WebDriver;

public abstract class CustomPageFactory {

    private WebDriver driver;
    public abstract void findElements();
    public abstract void search(String search);
    public abstract void open();



    /*
    зайти на сайт
    выполнить поиск
    найти элементы и сохранить это в список
     */


}
