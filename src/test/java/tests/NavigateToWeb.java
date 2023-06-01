package tests;

import Common.BaseStep;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class NavigateToWeb extends BaseStep {
    @Test
    public void navigateToWeb(){
        BaseStep baseStep = new BaseStep();
        baseStep.openUrl();
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login" );
    }
    @AfterTest
    public void closeBrowser(){
        super.tearDown(driver);
    }

}
