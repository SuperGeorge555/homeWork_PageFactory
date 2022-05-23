package udm.kor.example.utils;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class WebDriverUtil {

    private WebDriverUtil() {
    }

    public static void clear(WebElement webElement) {
        int stringLength = webElement.getAttribute("value").length();

        for (int i = 0; i < stringLength; i++) {
            webElement.sendKeys(Keys.BACK_SPACE);
        }
    }

}
