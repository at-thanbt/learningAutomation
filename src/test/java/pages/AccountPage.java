package pages;

import Common.Helper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
    private WebDriver driver;

    public AccountPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath="//p[@class='oxd-userdropdown-name']")
    private WebElement accountName;

    @FindBy(xpath="//span[text() = 'Admin']")
    private WebElement adminLbl;

    public void getAccountName(){
        String name = accountName.getText();
        System.out.println("Account name is: " +name+ "");
        Helper.delay(5);
    }
    public void navigateToAdminPage(){
        adminLbl.click();
        Helper.delay(5);
    }
}
