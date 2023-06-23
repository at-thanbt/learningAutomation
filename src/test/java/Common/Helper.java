package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {
    WebDriver driver;
    public Helper(WebDriver _driver){
        this.driver = _driver;
    }
    public void clickElement(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10) );
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
        driver.findElement(by).click();
    }
    public static void delay(int second){
        try {
            Thread.sleep(second*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
