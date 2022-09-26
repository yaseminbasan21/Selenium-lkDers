package day04_xpath_cssLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_AmazonSearch {
    public static void main(String[] args) {

        /*
        Main method olusturun ve asagıdaki gorevi tamamlayın
          a.web sayfasına gidin https://www.amazon.com/
          b.Search(ara) "city bike"
          c.Amazon'da goruntulenen ilgili sonucların sayısını yazdırın
          d.Sonra karsınıza cıkan ilk sonucun resmine tıklayın
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


       // a.google web sayfasına gidin. https://www.amazon.com/
        driver.get("https://www.amazon.com/");
       // b.Search(ara) "city bike"
        WebElement aramaKutusu=driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("city bike" + Keys.ENTER);
       // c.Amazon'da goruntulenen ilgili sonucların sayısını yazdırın
        List<WebElement> istenenElementListesi=driver.findElements(By.className("sg-col-inner"));   //Locate etmeye calıstıgımda class dısında bir sey cıkmadı, class'da da birden fazla element cıktıgı icin List'e alıp 1. elementin index'ini aldık
        WebElement sonucYazısıElementi=istenenElementListesi.get(0);                                //Aslında X-Path ile cok rahat cozebiliriz
        System.out.println(sonucYazısıElementi.getText());//1-16 of 85 results for "city bike"

       // d.Sonra karsınıza cıkan ilk sonucun resmine tıklayın
        List<WebElement>urunResimleriList=driver.findElements(By.className("s-image"));
        WebElement ilkUrunResmi=urunResimleriList.get(0);
        ilkUrunResmi.click();


    }
}
