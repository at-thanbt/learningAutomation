package tests;

import Common.BaseStep;
import Common.Helper;
import data.param;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountPage;
import pages.LoginPage;

public class NavigateToAdminPage extends BaseStep {

    @Test(dataProvider = "data", dataProviderClass = param.class)
    public void navigateToAdminPage(String username, String password) {
        Helper.delay(2);
        LoginPage loginPage = new LoginPage(driver);
        AccountPage accountPage = new AccountPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.loginAccount(username, password);
        Helper.delay(5);
        accountPage.navigateToAdminPage();
        Assert.assertEquals(driver.getCurrentUrl(), "https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");

    }
}
