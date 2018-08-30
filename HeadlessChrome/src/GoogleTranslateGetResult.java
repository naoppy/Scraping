import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTranslateGetResult {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "HeadlessChrome/webDriver/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "HeadlessChrome/webDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://translate.google.co.jp/?vi=c#en/ja/Apple");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"result_box\"]"));
        System.out.println(element.getText());
        driver.quit();
    }
}