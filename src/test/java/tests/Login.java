package tests;

import Common.BaseStep;
import Common.Helper;
import data.param;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Login extends BaseStep {

    @Test(dataProvider = "data", dataProviderClass = param.class)
    public void loginAccount(String username, String password) {
        Helper.delay(2);
        LoginPage loginPage = new LoginPage(driver);
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        loginPage.loginAccount(username, password);
    }

}
