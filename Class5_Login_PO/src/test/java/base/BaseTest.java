package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.EmployeePage;
import pages.LoginPage;

public class BaseTest {
    private WebDriver webDriver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.testfaceclub.com/ejercicios/");
        LoginPage loginPage = new LoginPage(webDriver);
        EmployeePage employeePage = loginPage.loginAs("user1","admin");
        employeePage.addEmployee("Juan","Juan@gmail.com","MTZ","58899624");

        webDriver.quit();
    }

    public static void main(String arg[]){
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}
