package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class BaseTest {
    private WebDriver driver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        List<WebElement> list = driver.findElements(By.tagName("a"));
        System.out.println("Cantidad de links: " + list.size());

        WebElement inputLink = driver.findElement(By.linkText("Inputs"));
        inputLink.click();

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("55");

        driver.quit();
    }

    public static void main(String arg[]){
        BaseTest baseTest = new BaseTest();
        baseTest.setUp();
    }
}
