package udm.kor.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class App {

    public static void main(String[] args) {

        /*
        Задаем путь до вебдрайвера в системные переменные
        Если драйвер не подходит скачиваем подходящий тут https://chromedriver.chromium.org/downloads
        */
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

        //Создаем объект ChromeDriver
        WebDriver driver = new ChromeDriver();

        //Выставляем максимальный размер окна хрома
        driver.manage().window().maximize();


        //Переходим на страницу https://www.browserstack.com/users/sign_in
        driver.get("https://www.browserstack.com/users/sign_in");

        //Ищем элемент по xpath "//input[@id = 'user_email_login']"
        WebElement username = driver.findElement(By.xpath("//input[@id = 'user_email_login']"));

        //Ищем все элементы по локатору
        List<WebElement> usernames = driver.findElements(By.xpath("//input[@id = 'user_email_login']"));


        // ТИПЫ ЛОКАТОРОВ https://kreisfahrer.gitbooks.io/selenium-webdriver/content/webdriver_intro/tipi_lokatorov.html
        //Ищем элемент по id "user_password"
        WebElement password = driver.findElement(By.id("user_password"));

        //Ищем элемент по атрибуту name "commit"
        WebElement login = driver.findElement(By.name("commit"));

        //Вводим значения
        username.sendKeys("go14in83hell@gmail.com");
        password.sendKeys("H%Hskz01");

        //Кликаем по элементу
        login.click();

        String actualUrl = "https://live.browserstack.com/dashboard";

        //Получаем URL страницы
        String expectedUrl = driver.getCurrentUrl();


        //Проверяем
        Assert.assertEquals(actualUrl, expectedUrl);
        driver.close();
    }
}
