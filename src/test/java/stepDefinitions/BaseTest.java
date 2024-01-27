package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;

public class BaseTest {

//    ChromeOptions options = new ChromeOptions();
//    options.setHeadless(true);
//    WebDriver driver = new ChromeDriver(options);
//    driver.get("https://selenium.dev");
//    driver.quit();

    //ChromeOptions options = new ChromeOptions();
    protected WebDriver driver;
    public BaseTest() {
        this.driver = DriverSource.INSTANCE.getDriver();
    }
}
