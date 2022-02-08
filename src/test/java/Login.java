import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;

//на гугл забабахать скролл + выборка елементов
    @Test
    public void validLogin(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://github.com/login");

        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).sendKeys("Daimon2112");

        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("21121992Dimon");

        driver.findElement(By.name("commit")).click();

        driver.quit();





    }
}
