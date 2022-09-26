package day02_driverMethodları;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C08_manageMethodları {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        //maximize iken boyutları alalım

        System.out.println("maximize konum: " + driver.manage().window().getPosition());
        System.out.println("maximize boyut: " + driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        //fulscreen iken boyutları alalım
        System.out.println("fullscreen konum: " + driver.manage().window().getPosition());//fullscreen konum: (0, 0)
        System.out.println("fullscreen boyut: " + driver.manage().window().getSize());//fullscreen boyut: (1600, 900)

        driver.close();


    }
}
