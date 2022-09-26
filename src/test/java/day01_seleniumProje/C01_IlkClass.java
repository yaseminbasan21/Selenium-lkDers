package day01_seleniumProje;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkClass {
    public static void main(String[] args) throws InterruptedException {
       /*
       En ilkel haliyle bir otomasyon yapmak icin
       Class'ımıza otomasyon icin gerekli olan webdriver'ın yerini gostermemiz gerekir
       bunun icin Java kutuphanesinden System.setProperty() method'u kullanırız
       method 2 parametre istemektedir
       ilki kullanacagımız driver: webdriver.chrome.driver
       ikincisi ise bu driver'ın fiziki yolu:
        */

        System.setProperty("webdriver.chrome.driver","resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");
        Thread.sleep(2000);
        driver.get("https://www.facebook.com");

        Thread.sleep(2000);

        driver.close();
    }
}
