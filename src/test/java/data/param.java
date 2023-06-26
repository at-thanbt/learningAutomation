package data;

import org.testng.annotations.DataProvider;

public class param {
    @DataProvider(name = "data")
    Object[][] dataAccount() {
        return new Object[][]{{"Admin", "admin123"}};
    }
}
