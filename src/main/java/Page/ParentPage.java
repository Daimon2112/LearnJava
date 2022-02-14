package Page;

import libs.ActionWithoOurElements;
import libs.ConfigProperties;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import reporting.Logger;

abstract public class ParentPage {
    WebDriver driver;
    Logger logger;
    protected static ConfigProperties configProperties = ConfigFactory.create(ConfigProperties.class);
    String baseUrl;
    //ActionWithoOurElements actionWithoOurElements;

    public ParentPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
        baseUrl = configProperties.base_Url();
        //actionWithoOurElements = new ActionWithoOurElements();
    }


}
