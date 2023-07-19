package tests;

import Common.BaseStep;
import Common.Helper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NavigateToOrangeHRM extends BaseStep {
    @Test
    public void navigateToWeb() {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Helper.delay(10);
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
}
