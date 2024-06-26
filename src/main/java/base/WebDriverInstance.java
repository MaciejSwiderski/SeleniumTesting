package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class WebDriverInstance {


    // here we are initialising a driver but as thread local
    public static ThreadLocal<WebDriver> driver  = new ThreadLocal<>();

    public static WebDriver getDriver(){
        if(driver.get()== null){
            try {
                driver.set(createDriver());
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        return driver.get();
    }

    public static WebDriver createDriver() throws IOException {
        WebDriver driver = null;
        Properties prop = new Properties();
        FileInputStream data = new FileInputStream(
                System.getProperty("user.dir")+ "\\src\\main\\resources\\config.properties");
        prop.load(data);

        if(prop.getProperty("browser").equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver",
                    System.getProperty("user.dir")+"\\src\\main\\java\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
        }else if(prop.getProperty("browser").equalsIgnoreCase("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
            System.setProperty("webdriver.gecko.driver",
                    System.getProperty("user.dir")+"\\src\\main\\java\\drivers\\geckodriver.exe");
            driver = new FirefoxDriver(options);
        }else if(prop.getProperty("browser").equalsIgnoreCase("edge")){
            System.setProperty("webdriver.edge.driver",
                    System.getProperty("user.dir")+"\\src\\main\\java\\drivers\\msedgedriver.exe");
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(prop.getProperty("url"));
        return driver;
    }

    public static void cleanupDriver(){
        driver.get().quit();
        driver.remove();
    }
}
