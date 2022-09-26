package day02_driverMethodları;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C07_manageMethodları {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        System.out.println("pencere olculeri : "+ driver.manage().window().getSize());//pencere olculeri : (1050, 840)
        System.out.println("pencere konumu : "+ driver.manage().window().getPosition());//pencere konumu : (10, 10)

        Thread.sleep(2000);


        driver.manage().window().setPosition(new Point(15,15));
        driver.manage().window().setSize(new Dimension(900,600));

        driver.close();

    }
}
