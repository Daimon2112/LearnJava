import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

import java.util.concurrent.TimeUnit;

public class CheckRealtest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);


        driver.get("https://admin.trycents.dev/login");

        driver.findElement(By.xpath("//input[@type='text']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("blabla");

        driver.findElement(By.xpath("//input[@type='password']")).click();
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("blabla");

        driver.findElement(By.xpath("//button[@type='submit']")).click();


        Assert.assertTrue(driver.findElement(By.xpath("//div[@class='label']")).isDisplayed());



    }
}
