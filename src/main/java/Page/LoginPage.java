package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reporting.Logger;
import org.testng.Assert;

public class LoginPage extends ParentPage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void openLoginPage(){
        try {
            driver.get("https://github.com/login");
            Logger.info("open page");

        }catch (Exception e){
            Logger.error("not open");
            Assert.fail("no open2");
        }
    }

    public void enterLogin(String login){
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).sendKeys(login);
    }

    public void enterPassword(String password){
        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).sendKeys(password);

    }

    public void subMit() {
        driver.findElement(By.name("commit")).click();
    }
}
