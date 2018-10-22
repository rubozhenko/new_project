import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class GoogleTests {

    private WebDriver driver;

    @Before
    public void startUp(){
//        System.setProperty("webdriver.gecko.driver", "driver/geckodriver");
//        this.driver = new FirefoxDriver();
//        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//        driver.manage().window().fullscreen();
    }

    @After
    public void tearDown(){
//        this.driver.close();
    }

    @Test
    public void navigateTest(){

        byte [] arr = new byte[100];
        int lastIndex = arr.length-1;
        System.out.println(lastIndex);
//        this.driver.get("https://google.com.ua");
//
//        WebElement searchInput = this.driver.findElement(By.id("lst-ib"));
//        searchInput.clear();
//        searchInput.sendKeys("Rostyslav Ubozhenko");
//
//
//        WebElement searchButton = this.driver.findElement(By.name("btnK"));
//
//        searchButton.click();
//
//        Assert.assertTrue(this.driver.getCurrentUrl().contains("Rostyslav"));
    }
}
