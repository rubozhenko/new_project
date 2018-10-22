import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleTest {

    @Test
    public void navigateToRozetkaWebSiteAndSearchIphone() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://rozetka.com.ua");
    }
}
