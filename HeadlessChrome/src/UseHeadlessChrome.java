import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Scanner;

public class UseHeadlessChrome {
    public static void main(String[] args) {
        //setting environment variable
        System.setProperty("webdriver.chrome.driver", "HeadlessChrome/webDriver/chromedriver.exe");

        //input searchWords
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\\t");//Delimiter is Tab only
        String searchWords = sc.next();

        //startTime
        long startTime = System.nanoTime(), endTime;

        //create driver and access 2.6s
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://translate.google.co.jp/?vi=c#en/ja/" + searchWords);//1.2s
        WebElement element = driver.findElement(By.xpath("//*[@id=\"result_box\"]"));//find result1.6s
        System.out.println(element.getText());//print translate result

        //0.5s早くなる
        driver.quit();

        endTime = System.nanoTime();

        System.err.println(endTime-startTime+"nano seconds");
    }
}