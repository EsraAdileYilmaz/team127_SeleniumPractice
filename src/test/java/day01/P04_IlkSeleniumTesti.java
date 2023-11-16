package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P04_IlkSeleniumTesti {

    public static void main(String[] args) {

          /*
     . .Exercise2...
     1-Driver oluşturalim
     2-Java class'imiza chnomedriver.exe i tanitalim
     3-Driver'in tum ekranı kaplamasini saglayalim
     4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
      Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
     5-"https://www.otto.de” adresine gidelim
     6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
     7-Title ve url inin "OTTO” kelimesinin içerip icermedigini kontrol edelim
     8-Ardindan "https://wisequarter.com/” adresine gidip
     9-Bu adresin basligini alalim ve "Quarter” kelimesini icerip icermedigini kontrol edelim
     10-Bir onceki web sayfamiza geri donelim
     11-Sayfayı yenileyelim
     12-Daha sonra web sayfamiza tekrar donelim ve oldugumuuz sayfayi kapatalim
     */
        //1-Driver oluşturalim
        System.setProperty("Webdriver.chrome.driver","src/resources/chromedriver");

        //2-Java class'imiza chnomedriver.exe i tanitalim
        WebDriver driver=new ChromeDriver();

        //3-Driver'in tum ekranı kaplamasini saglayalim
        driver.manage().window().maximize();

        //4-Driverla sayfanın yuklenmesini 10.000 milisaniye (10 saniye) boyunca beklesini söyleyelim.
        // Eger oncesinde sayfa Yüklenirse, beklemeyi bıraksın.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //5-"https://www.otto.de” adresine gidelim
        driver.get("https://www.otto.de");

        //6-Bu web adresinin sayfa basligini (title) ve adres (url)ini alalim
        driver.getTitle();
        driver.getCurrentUrl();

        // 7-Title ve url inin "OTTO” kelimesinin içerip icermedigini kontrol edelim
        String expectedKelime="OTTO";
        String actualTitle=driver.getTitle();
        String actualUrl=driver.getCurrentUrl();

        if(actualUrl.contains(expectedKelime) && actualTitle.contains(expectedKelime)){
            System.out.println("TITLE and URL TEST PASSED");
        }else {
            System.out.println("TITLE and URL TEST FAILED");
        }

        /*
          Title ve url demeseydi 2 farkli if() ile ayri ayri yapilabilirdi.
          if (ottoTitle.contains("OTTO") ){
                 System.out.println("TITLE TEST PASSED");
              }else{
                 System.out.println("TITLE TEST FAILED");
             }
          if (ottoUrl.contains("OTTO") ){
             System.out.println("URL TEST PASSED");
         }else{
             System.out.println("URL TEST FAILED");
          }
         */

        //8-Ardindan "https://wisequarter.com/” adresine gidip
        driver.get("https://wisequarter.com/");

        //9-Bu adresin basligini alalim ve "Quarter” kelimesini icerip icermedigini kontrol edelim
        String wqTitle= driver.getTitle();
        boolean kelime=wqTitle.contains("Quarter");
        System.out.println(wqTitle);

        if(kelime){
            System.out.println("WISE QUARTER TITLE TEST PASSED");
        }else{
            System.out.println("WISE QUARTER TITLE TEST FAILED");
        }

        //10-Bir onceki web sayfamiza geri donelim
        driver.navigate().back();

        //11-Sayfayı yenileyelim
        driver.navigate().refresh();

        //12-Daha sonra web sayfamiza tekrar donelim ve oldugumuz sayfayi kapatalim
        driver.navigate().forward();

        System.out.println("--------TEST TAMAMLANDI----------");
        driver.quit();




    }
}
