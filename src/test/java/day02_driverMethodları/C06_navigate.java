package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C06_navigate {
    public static void main(String[] args) throws InterruptedException {
        /*
           Eger testimiz sırasında birden fazla sayfa arasında
           ileri geri hareket edeceksek driver.get() yerine
           driver.navigate.to() methodu'nu kullanırız
           ve sonrasında forward(), back() veya refresh()
         */

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.navigate().to("https://www.amazon.com");
        Thread.sleep(2000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(2000);

        //amazon'a geri donelim
        driver.navigate().back();
        Thread.sleep(2000);

        //yeniden facebook'a gidelim
        driver.navigate().forward();
        Thread.sleep(2000);

        //sayfayı refresh yapalım
        driver.navigate().refresh();
        Thread.sleep(2000);

        driver.close();


    }
}
