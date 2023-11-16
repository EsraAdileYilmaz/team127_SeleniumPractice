package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_DriverMethods {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();// Pencereyi menüleri gizlemeden büyük hale getiriyor.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        // driver.manage().window().fullscreen(); //menüleri de gizleyerek tüm ekranı kaplar.

        driver.get("https://www.wisequarter.com");

        driver.quit();


    }
}
