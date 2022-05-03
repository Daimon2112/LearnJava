//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//
//import java.util.concurrent.TimeUnit;
//
//public class ParentTest {
//    WebDriver driver;
//    protected LoginPage loginPage;
//    protected HomePage homePage;
//
//
//    @BeforeTest
//    public void setUp(){
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        loginPage = new LoginPage(driver);
//        homePage = new HomePage(driver);
//
//    }
//
//
//    @AfterTest
//    public void tearDown(){
//        driver.quit();
//    }
//
//}
