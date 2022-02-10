package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import reporting.Logger;

abstract public class ParentPage {
    WebDriver driver;
    Logger logger;

    public ParentPage(WebDriver driver){
        this.driver = driver;
    }


}
