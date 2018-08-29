import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\Users\\naoki\\Desktop\\git\\Scraping\\HeadlessChrome\\geckodriver-v0.21.0-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        driver.get("http://demo.guru99.com/");
        WebElement element = driver.findElement(By.xpath("//input[@name='emailid']"));
        element.sendKeys("naoppy@gmail.com");

        WebElement button = driver.findElement(By.xpath("//input[@name='btnLogin']"));
        button.click();
    }
}