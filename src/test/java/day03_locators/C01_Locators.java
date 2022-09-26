package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //Amazon'a gidip nutella aratalım

        driver.get("https://www.amazon.com");
         //findElement(By .... locator) --> istedigimiz web elementlerini bize dondurur
         //biz de o webelementini kullanmak icin bir obje'ye assign ederiz

        //WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        /* WebElement aramaKutusu= driver.findElement(By.className("nav-search-field"));
           Bu locator calısmadı
           Locator alırken gozumuzden kacan detaylar olabilir
           aldıgımız bir locator calısmazsa alternatif locator'lar denemeliyiz
         */

        WebElement aramaKutusu=driver.findElement(By.name("field-keywords"));  //name ve value unique ise bu metodu'da kullanabilirsiniz


        /*
        <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
        autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute"
        dir="auto" tabindex="0" aria-label="Ara">
         (element)*/


        //herhangi bir webelementine istedigimiz yazıyı yollamak istersek

        aramaKutusu.sendKeys("Nutella" + Keys.ENTER); //arama yerine nutella gonderdik, enter tusuyla arattık

    }
}
