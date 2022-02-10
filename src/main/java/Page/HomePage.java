package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends ParentPage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean IsSomePresent(){
        return driver.findElement(By.cssSelector("something")).isDisplayed();
    }

}
