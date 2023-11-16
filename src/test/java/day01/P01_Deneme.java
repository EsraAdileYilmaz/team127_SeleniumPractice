package day01;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_Deneme {

    public static void main(String[] args) {

    System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com");

    driver.quit();


    }
}
