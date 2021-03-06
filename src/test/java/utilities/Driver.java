package utilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import utilities.ConfigurationReader;
import java.util.concurrent.TimeUnit;
public class Driver {
    //Driver class, driver instance'i baslatmak icin kullanilir.(Sinngleton Driver)
    //Ihtiyacimiz oldugunda driver'i kurmak ve baslatmak icin kullaniriz.
    //Driver null oldugunda create edip baslatacagiz.(if driver==null)
    //Driver classi farkli browserlar(tarayici) ile de kullanacagimiz sekilde olusturacagiz.
    private Driver(){
        //Baska obje olusturulmasini istemedigimiz icin create ediyoruz.
    }
    //driver instance olusturalim
    static WebDriver driver;
    //driver'i baslatmak icin statik bir metod olusturalim
    public static WebDriver getDriver(){
        if(driver==null){
            String browser = ConfigurationReader.getProperty("browser");
            if ("chrome".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
            } else if ("firefox".equals(browser)) {
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            } else if ("ie".equals(browser)) {
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
            } else if ("safari".equals(browser)) {
                WebDriverManager.getInstance(SafariDriver.class).setup();
                driver = new SafariDriver();
            } else if ("headless-chrome".equals(browser)) {
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
            }
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
    public static void closeDriver(){
        if(driver!=null){  //eger driver chrome'u isaret ediyorsa
            driver.quit();  // driver'i kapat
            driver=null; // driver'in null oldugundan emin olmak icin tekrar null olarak atayalim.
        }               //Boylelikle driver'i tekrar baslatabilirim.
    }                   //Multi Browser Test(chrome, firefox, ie ...) yaparken bu onemli olacaktir.
}