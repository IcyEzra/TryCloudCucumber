package net.trycloud.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {

    /*
    SINGLETON DESIGN PATTERN:
     */
    private Driver(){}

    private static ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    public static WebDriver getDriver(){

        if(driverPool.get() == null) {

            // synchronized block
            synchronized (Driver.class) {
                String browser = ConfigurationReader.getProperty("browser");

                // could use if your switch statement, switch is more organized and easier to read

                switch (browser) {

                    case "chrome": // lines below are complaining because of Default block
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        break;

                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                        break;


                }
            }
        }
        driverPool.get().manage().window().maximize();
        driverPool.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driverPool.get();
    }

    public static void closeDriver(){
        if(driverPool.get() != null){
            driverPool.get().quit();
            driverPool.remove();
        }
    }




}
