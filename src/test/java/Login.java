import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import reporting.Logger;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;

//    @BeforeTest
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);




    @Test
    public void validLogin(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).click();
        driver.findElement(By.name("q")).sendKeys("что то");


        driver.findElement(By.name("btnK")).sendKeys(Keys.ENTER);


        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        List<WebElement> all = driver.findElements(By.xpath("//div[@data-abe]//b"));
        for (WebElement some: all){
            System.out.println(some.getText());
        }

        System.out.println("No cikle work");
        }
        }





















//        for (int i=0; i < someElements.size(); i++){
//            for(WebElement line: someElements)
//            System.out.println("Sometext" + someElements);
//        } выдаёт весь список внизу

//        String someText = "ну и что что";
//        List<WebElement> listOfSome = driver.findElements(By.cssSelector("div.AJLUJb"));


//        for (WebElement line: listOfSome){
//            System.out.println(line);
//            WebElement cell = line.findElement(By.cssSelector("div.AJLUJb"));
//            if (cell.getText().equals(someText)){
//                System.out.println(line);
//            }










//        driver.get("https://github.com/login");
//
//        driver.findElement(By.name("login")).click();
//        driver.findElement(By.name("login")).sendKeys("Daimon2112");
//
//        driver.findElement(By.name("password")).click();
//        driver.findElement(By.name("password")).sendKeys("21121992Dimon");
//
//        driver.findElement(By.name("commit")).click();



       // Assert.assertTrue(driver.findElement(By.cssSelector("fdfs")).isDisplayed(), "blabla");



//
//    private boolean isЧтотодисплейд(){
//        try {
//            return driver.findElement(By.cssSelector()).isDisplayed();
//        }catch (Exception e){
//            return false;
//        }
//    }


//    @AfterTest
//    public void tearDown(){
//        driver.quit();
//    }
//}
//