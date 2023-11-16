package day01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P05_SeleniumTest {

    public static void main(String[] args) {

        /* ...Exercise5...
         Navigate to  https://testpages.herokuapp.com/styled/index.html
         Click on  Calculater under Micro Apps
         Type any number in the first input
         Type any number in the second input
         Click on Calculate
         Get the result
         Print the result
      */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        driver.findElement(By.xpath("//a[@id='calculatetest']")).click();


        driver.findElement(By.id("number1")).sendKeys("145");
        driver.findElement(By.xpath("//input[@id='number2']")).sendKeys("100");

        driver.findElement(By.xpath("//input[@id='calculate']")).click();

        WebElement answer =driver.findElement(By.xpath("//span[@id='answer']"));
        System.out.println("Answer: "+answer.getText());
        //System.out.println("İşlem Sonucu = " + driver.findElement(By.id("answer")).getText());

        driver.quit();









    }
}
