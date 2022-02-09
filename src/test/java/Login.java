import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;

    @BeforeTest
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

    }


    @Test
    public void validLogin(){

        driver.get("https://github.com/login");

        driver.findElement(By.name("login")).click();
        driver.findElement(By.name("login")).sendKeys("Daimon2112");

        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("21121992Dimon");

        driver.findElement(By.name("commit")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("fdfs")).isDisplayed(), "blabla");

    }

//
//    private boolean isЧтотодисплейд(){
//        try {
//            return driver.findElement(By.cssSelector()).isDisplayed();
//        }catch (Exception e){
//            return false;
//        }
//    }


    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
