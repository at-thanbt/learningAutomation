package tests;

import Common.BaseStep;
import Common.Helper;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Login extends BaseStep {

    @Test
    public void loginAccount() {
        Helper.delay(2);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginAccount("Admin", "admin123");
    }

}
