package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C09_manageMethodları {
    public static void main(String[] args)  {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://amazon.com");

        /*
        İlerde wait konusunu daha genis olarak ele alacagız
        Bir sayfa acılırken, ilk basta sayfanın icerisinde bulunan elementlere gore
        bir yukleme suresine ihtiyac vardır
        veya bir webelementinin kullanabilmesi icin zamana ihtiyac olabilir
        implicitlyWait bize sayfanın yuklenmesi ve sayfadaki elementlere ulasım icin beklenecek
        MAXİMUM sureyi belirleme olanagı tanır

        */


        driver.close();

    }
}
