package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize(); //browser'ı tam sayfa yapar

        driver.get("https://www.amazon.com");
        System.out.println("actual title :" + driver.getTitle());//actual title :Amazon.com. Spend less. Smile more.

        //driver.getTitle(); method'u icinde olunan sayfanın baslıgını String olarak getirir

        System.out.println("actual url :" + driver.getCurrentUrl());//https://www.amazon.com/

       // driver.getCurrentUrl();İcinde olunan sayfanın Url'sini String olarak getirir

        driver.close();
    }
}
