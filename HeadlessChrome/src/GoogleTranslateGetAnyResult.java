import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class GoogleTranslateGetAnyResult {
    public static void main(String[] args) {
        //setting environment variable
        System.setProperty("webdriver.gecko.driver", "HeadlessChrome/webDriver/geckodriver.exe");
        System.setProperty("webdriver.chrome.driver", "HeadlessChrome/webDriver/chromedriver.exe");

        //input searchWords
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\t");//Delimiter is Tab only
        String searchWords = sc.next();

        //create driver and access
        WebDriver driver = new ChromeDriver();
        driver.get("https://translate.google.co.jp/?vi=c#en/ja/" + searchWords);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"result_box\"]"));//find result

        System.out.println(element.getText());//print translate result

        driver.quit();
    }
}