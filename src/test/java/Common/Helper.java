package Common;

import org.openqa.selenium.WebDriver;


public class Helper {
    WebDriver driver;

    public Helper(WebDriver _driver) {
        this.driver = _driver;
    }

    public static void delay(int second) {
        try {
            Thread.sleep(second * 1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
