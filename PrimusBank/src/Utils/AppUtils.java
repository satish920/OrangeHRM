package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class AppUtils {

      public static WebDriver driver ;
     public static String url= "http://primusbank.qedgetech.com/";
      @BeforeSuite
      public static void LaunchApp()
     {
    	   System.setProperty("WebDriver.chrome.driver", "chromedriver.exe");
             driver=new ChromeDriver();
           driver.navigate().to(url);
     driver.manage().window().maximize();
     
     }
         @AfterSuite
       public static void CloseApp()
       {
    	   driver.close();
     
       }
     
     public void logout()
     {
    	 driver.findElement(By.xpath("//img[contains(@src , 'images')]")).click();
     }
     
     
     
     
     
     










}
