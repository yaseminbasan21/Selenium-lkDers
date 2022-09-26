package day03_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_WebElementMethodları {
    public static void main(String[] args) {
        /*
        1- amazon.com'a gidip arama kutusunu locate edin
        2- amazon kutusunun tagName'inin input oldugunu test edin
        3- arama kutusunun name attribute'unun degerinin field-keywords oldugunu test edin

         */
        System.setProperty("webdriver.chrome.driver","src/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // 1- amazon.com'a gidip arama kutusunu locate edin
        driver.get("https://www.amazon.com");
        WebElement aramakutusu=driver.findElement(By.id("twotabsearchtextbox"));

       // 2- amazon kutusunun tagName'inin input oldugunu test edin
        String expectedTagName="input";
        String actualTagName=aramakutusu.getTagName();

        if (expectedTagName.equals(actualTagName)){
            System.out.println("TagName testi PASSED");
        }else{
            System.out.println("TagName test FAİLED");
        }

        // 3- arama kutusunun name attribute'unun degerinin field-keywords oldugunu test edin
              String expectedNameDegeri="field-keywords";
              String actualNameDegeri=aramakutusu.getAttribute("name");

        if (expectedNameDegeri.equals(actualNameDegeri)){
            System.out.println("name attribute testi PASSED");
        }else{
            System.out.println("name attribute testi FAİLED");
        }

        System.out.println("konum : " + aramakutusu.getLocation());//konum : (279, 11)
        System.out.println("webelement yuksekligi : " + aramakutusu.getSize().height);//webelement yuksekligi : 38

        driver.close();


         /*
              <input type="text" id="twotabsearchtextbox" value="" name="field-keywords"
                autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute"
                dir="auto" tabindex="0" aria-label="Ara">
               (element)

               webElementIsmı.getTagName()--> daha once locate etigimiz bir webelementin tagname'ni dondurur
               webElementIsmı.getAttribute(attributeIsmı)-->daha once locate ettigimiz bir webelementin
                                                            istedigim attribute'unun degerini dondurur



            */




    }
}
