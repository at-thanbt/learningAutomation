package pages;

import Common.BaseStep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
    private WebDriver driver;
    public String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
    @FindBy(xpath="//input[@name='username']")
    private WebElement inputUsername1;

    @FindBy(xpath="//input[@name='password']")
    private WebElement inputPassword1;

    @FindBy(xpath="//button[@type='submit']")
    private WebElement loginBtn1;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void loginAccount(String username, String password) {
        inputUsername1.sendKeys(username);
        inputPassword1.sendKeys(password);
        loginBtn1.click();
    }
}
