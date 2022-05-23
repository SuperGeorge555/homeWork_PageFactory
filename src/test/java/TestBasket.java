import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import udm.kor.example.pagefactory.YandexPage;
import udm.kor.example.pages.BasketPage;
import udm.kor.example.pages.MainPage;
import udm.kor.example.pages.ResultBookPage;
import udm.kor.example.utils.WaitUtil;


public class TestBasket {
    private static final String BASE_URL = "https://www.ozon.ru/";
    private static final String YANDEX_URL = "https://www.yandex.ru/";
    private static final String GOOGLE_URL = "https://www.google.ru/";
    private static final String YAHOO_URL = "https://www.yahoo.com/";
    private WebDriver DRIVER;

    @BeforeClass
    private void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        DRIVER = new ChromeDriver();
        DRIVER.manage().window().maximize();
        //DRIVER.get(BASE_URL);
    }

    @AfterClass
    void tearDown() {
        DRIVER.close();
    }

    @Test
    public void testOne() {
        DRIVER.get(BASE_URL);
        MainPage mainPage = new MainPage(DRIVER);
        mainPage.findItem("Михаил Задорнов Книги");
        WaitUtil.waitSecond(5);
        ResultBookPage resultBookPage = new ResultBookPage(DRIVER);
        resultBookPage.setPrice();
        WaitUtil.waitSecond(3);
        resultBookPage.salesBook();
        WaitUtil.waitSecond(5);
        resultBookPage.takeBook();
        WaitUtil.waitSecond(3);
        BasketPage basketPage = new BasketPage(DRIVER);
        basketPage.goToBasket();
    }

    @Test
    public void yandexTwo(){
        DRIVER.get(YANDEX_URL);
        YandexPage yandexPage = new YandexPage(DRIVER);
        yandexPage.writeText(yandexPage.getX_PATH_TEXT());
        WaitUtil.waitSecond(3);
        yandexPage.findElements();
    }



}
