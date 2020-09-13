package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import webdriver.factory.WebDriverFactory;

public class BaseTest {
    protected WebDriver webDriver;
    private String url = "https://testfaceclub.com/login-employee-v2/";

    @BeforeMethod(alwaysRun = true)
    @Parameters({"browser", "seleniumGridUrl"})
    public void setUp(String browser, String seleniumGridUrl) throws Exception {
        webDriver = WebDriverFactory.getDriver(browser, seleniumGridUrl);
        webDriver.get(url);
        webDriver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        if(webDriver != null)
            webDriver.quit();
    }
}
