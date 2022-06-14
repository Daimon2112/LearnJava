import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
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

//        1. Пойти по пути синглтона и в класе пейдж-браузер описать бразуер и создать инстанс которий будет ссилатся
//        на абстрактній класс от которого в дальнейшем будут наследоватся все остальние класи
//       - private WebDriver driver;
//       - private Browser(WebDriver driver) {this.driver = driver};(конструктор)
//       - public static Browser getInstance() {if (instance != null) {
//            return instance;}return instance = init();}
//       - private static Browser init() {
//            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
//            WebDriver driver = new ChromeDriver();driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//            return new Browser(driver);}
//        описание самого браузера - тогда получается что в бейс тесте нам не нужно описание браузера и его инициализация
//        НО нам прийдьотся в каждом класе теста инициализировать пейджи Н: Loginpage loginpage = new LoginPage();
//


//
//        2. Пойти по пути пейдж обжекта
//        и создать в бейс тест обьекти класов страниц
//        Н: Webdriver driver;
//        Onepage onepage = new Onepage(driver)
//        @BeforeTest
//        public void что то(){ описание браузера и инициализируем страницы onePage = new OnePage(driver)//дальше будем добавлять страницы которые будем юзать}
//        abstract public class BasePage{WebDriver Driver    protected AbstractBrowser(Webdriver driver)}
//        мы наследуем все пейджы от абстракта для того что бы они все использовали единственный драйвер если же мы не будем наследоватся ТО каждый отдельный клас будет открывать новый браузер
//
//        Вынести работу драйвера со страницой а именно например как клик или ввести текст что то отобразить и прочее
//                нам нужно вынести это в отдельный класс и уже от туда передовать его в класы где оно будет реализовано.
//                Для того что бы это сделать нам нужно в абстрактном класе а именно в конструкторе в абстрактном класе реализовать ексземпляр класа()
//
//                Отдельно в класе создаём описание действий с дополнением:
//        public class somemethod{
//        public void click(By locator) {
//            waitVisibility(locator);
//            highlightElement(locator);
//            Logger.debug(" Clicking element" + driver.findElement(locator).getText() + "'(Located: " + locator + ")");
//            waitPageElementLoad(locator);
//            unHighlightElement(locator);
//            driver.findElement(locator).click();}}

//            А сам клас потом передаём в абстрактый клас в конструктор - что бы все остальные пейджы могли использовать эти методы
//              SomeMet someMet;
//                  public AbstractBrowser(WebDriver driver){
//            this.driver = driver;
//            someMet = new SomeMet(driver);}
//
//        3. Создание суперкласа - через абстрактную страницу - а потом в паренттесте просто создаём

    }

}
