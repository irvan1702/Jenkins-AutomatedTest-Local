import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ExampleTest {

    private WebDriver driver;
    @Test
    public void testEasy() {
        driver.get("http://www.google.com");
        String title = driver.getTitle();
        WebElement element = driver.findElement(By.tagName("title"));
        String result = element.getText();
        Assert.assertTrue(title.contains(result));
    }
    @BeforeTest
    public void beforeTest() {
        driver = new FirefoxDriver();
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}
