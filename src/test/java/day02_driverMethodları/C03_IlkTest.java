package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_IlkTest {
    public static void main(String[] args) {

        // 1-https://www.amazon.com url'ine gidin
        // 2-Baslıgın Amazon kelimesi icerdigini test edin
        // 3-Url'in https://www.amazon.com 'a esit oldugunu test edin
        // 4-sayfayı kapatın


        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        // 1-https://www.amazon.com url'ine gidin
        driver.get("https://www.amazon.com");

        // 2-Baslıgın Amazon kelimesi icerdigini test edin
        String actualTitle=driver.getTitle();  //(benim notum) karsılastırabilmek icin variable'a atama yapmamız gerekti
        String arananKelime="Amazon";
        if (actualTitle.contains(arananKelime)){
            System.out.println("Title testi Passed");
        }else {
            System.out.println("Title" + arananKelime + "'yi icermiyor, title testi Failed");
        }

        // 3-Url'in  https://www.amazon.com url'ine esit oldugunu test edin
        String actualUrl= driver.getCurrentUrl();
        String expectedUrl="https://www.amazon.com";
        if (actualUrl.equals(expectedUrl)) {
            System.out.println("Url testi Passed");
        }else {
            System.out.println("actualUrl :" +actualUrl + " beklenenden Url'den farklı, Test Failed");
        }
        /*
        Title testi Passed
        actualUrl :https://www.amazon.com/ beklenenden Url'den farklı, Test Failed
        Sonunda bir / daha var,bunu rapor ederiz ,ikisinden birini degistirin
         */
        //4- sayfayi kapatin
        driver.close();

    }
}
