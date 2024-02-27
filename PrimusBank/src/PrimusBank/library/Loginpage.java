package PrimusBank.library;



import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Utils.AppUtils;

public class Loginpage extends AppUtils{

        
     public static void login(String uid,String pwd)
     {
    	 driver.findElement(By.id("txtuId")).sendKeys(uid);
         driver.findElement(By.id("txtPword")).sendKeys(pwd);
         driver.findElement(By.id("login")).click();
     }
       
      public void logout()
      {
    	  driver.findElement(By.xpath("//img[@src='images/admin_but_03.jpg']")).click();
      }
     
      public void isDisplayedErrAlertMsg()
      {
    	//WebDriverWait wait = new WebDriverWait(driver,20);
    	 // wait.until(ExpectedConditions.alertIsPresent());
    	  
    	  String alert =  driver.switchTo().alert().getText();
    	  
       if(alert.contains("InCorrect"))
       {
    	      driver.switchTo().alert().accept();
       }else
       {
    	   driver.switchTo().alert().dismiss();
    	   
       }
      
            
      }
      
        public boolean isDisplayedAnErrorMsg()

        {
        	driver.findElement(By.id("login")).click();
          String err = ("Invalid Credentials");
        if(err.contains(err))
        {
        	return true;
        }else
        {
        	return false;
        }
        }	        
        
           public void getscreenshotOflogin()
           {
        	     TakesScreenshot ts = (TakesScreenshot)driver;
           File srcfile =      ts.getScreenshotAs(OutputType.FILE);
            File trgfile = new File("c:\\demo\\defect2.png");     
           try {
        	   
           
           FileUtils.copyFile(srcfile, trgfile);
           }catch(Exception e)
           {
        	  
           }
           }
        
           public boolean changePassword()
           {
        	   driver.findElement(By.xpath("//img[contains(@src , 'images')]")).click();
          
         String tittle=     driver.getTitle();
        		
        		if(tittle.equals("Runtime Error")) 
        		 {
        	           return false;
        		   }else
        		   {
        			   return true;
        		   }
           
           }
        
           public void getscreenshotOfChangepassword()
           {
        	     TakesScreenshot ts = (TakesScreenshot)driver;
           File srcfile =      ts.getScreenshotAs(OutputType.FILE);
            File trgfile = new File("c:\\demo\\defect3.png");     
           try {
        	   
           
           FileUtils.copyFile(srcfile, trgfile);
           }catch(Exception e)
           {

        
           }
        
           }
        
        
        
        

        
        
        

}
