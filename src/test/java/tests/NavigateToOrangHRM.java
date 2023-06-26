package tests;

import Common.BaseStep;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateToOrangHRM extends BaseStep {
    @Test
    public void navigateToWeb(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
