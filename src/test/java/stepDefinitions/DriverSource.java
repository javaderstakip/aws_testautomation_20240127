package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public enum DriverSource {

//    ChromeOptions options = new ChromeOptions();
//    options.setHeadless(true);
//    WebDriver driver = new ChromeDriver(options);
//    driver.get("https://selenium.dev");
//    driver.quit();

    //only one instance
    INSTANCE;
    ChromeOptions options = new ChromeOptions();

    private WebDriver driver;

    public WebDriver getDriver(){
//        if (driver == null){
//            options.setHeadless(true);
//            driver = new ChromeDriver(options);
//        }
//        return driver;
    //ChromeOptions options = new ChromeOptions();
    options.setHeadless(true);
    WebDriver driver = new ChromeDriver(options);
    return driver;
    }
}