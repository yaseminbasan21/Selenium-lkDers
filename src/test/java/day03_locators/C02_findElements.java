package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.WeakHashMap;

public class C02_findElements {
    public static void main(String[] args) {
        //Amazon sayfasında kac tane link bulundugunu yazdıralım

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        //linkler <a> tag'ıyla olusur, dolayısıyla bir list olusturucaz

        List<WebElement> linkListesi=driver.findElements(By.tagName("a"));  //a link tag'ıydı html'de

        System.out.println("Sayfadaki link sayısı : "+ linkListesi.size()); //Sayfadaki link sayısı : 422

        driver.close();



    }
}
