import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import reporting.Logger;


import java.util.concurrent.TimeUnit;

public class CheckRealtest {
    public static void main(String[] args) {
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
//
//
//        driver.get("https://admin.trycents.dev/login");
//
//        driver.findElement(By.xpath("//input[@type='text']")).click();
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("testovui.dlyatestov@gmail.com");
//
//        driver.findElement(By.xpath("//input[@type='password']")).click();
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("21121992");
//
//        driver.findElement(By.xpath("//button[@type='submit']")).click();
//
//        //String displayedMessage = driver.findElement(By.xpath("//div[@class='label']")).getText();
//
//
//        assert (driver.findElement(By.xpath("//div[@class='label']")).getText().equals("Orders"));
//
//        driver.quit();
//        по поводу реализации страниц через вебдрайвер есть 3 способа через которіе можно реализовать браузер и запуск тестов
//                1. Пойти по пути синглтона и в класе пейдж-браузер описать бразуер и создать инстанс которий будет ссилатся
//                на абстрактній класс от которого в дальнейшем будут наследоватся все остальние класи
//
//                2. Пойти по пути пейдж обжекта и создать в бейс пейдж обьекти класов страниц Н: Onepage onepage = new Onepage(driver) и так далее
//                Получается что каждій раз у нас прогружаются все пейджи сразу и в класах мі просто наследуемся от бейс пейджи не создавая конструктор суперкласа
//
//                3. Создание суперкласа

    }

}
