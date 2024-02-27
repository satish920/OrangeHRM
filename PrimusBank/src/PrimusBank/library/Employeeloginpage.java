package PrimusBank.library;

import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utils.AppUtils;

public class Employeeloginpage extends AppUtils {

  public void AddNewEmployee(String txnm, String pwd)
  {
	  driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a")).click();
       driver.findElement(By.id("btnNEW")).click();
      driver.findElement(By.id("txtUname")).sendKeys(txnm);   
      driver.findElement(By.id("txtLpwd")).sendKeys(pwd);   
     Select emp = new Select(driver.findElement(By.id("lst_Roles")));
        emp.selectByIndex(4);
        Select emp2 = new Select(driver.findElement(By.id("lst_Branch")));
     
        emp2.selectByIndex(1);
     driver.findElement(By.id("BtnSubmit")).click();
      String alert =   driver.switchTo().alert().getText();
    
           if( alert.contains("New Employer"))
           {
        	   driver.switchTo().alert().accept();
           }else
           {
        	   driver.switchTo().alert().dismiss();
           }
  }   
          
     public void AddEmpWithInvalid()
     {
    	 driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a")).click();
         driver.findElement(By.id("btnNEW")).click();
         driver.findElement(By.id("BtnSubmit")).click();
         String alert1 =   driver.switchTo().alert().getText();
         
         if( alert1.contains("New Employer"))
         {
      	   driver.switchTo().alert().accept();
         }else
         {
      	   driver.switchTo().alert().dismiss();
         }

     }
     
     
     public void getSceenshotOfAddempInvalid()     
    {
    	   TakesScreenshot ts =  (TakesScreenshot)driver;
         File srcfile =   ts.getScreenshotAs(OutputType.FILE);
        File trgfile = new File("c:\\demo\\defectOfaddemp.png");
    try {
    	
    
           FileUtils.copyFile(srcfile, trgfile);
    }catch(Exception e)
    {
    	
    }

    }

    
  public void DeleteEmployee()
  {
 	 driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a")).click();
   WebElement table =    driver.findElement(By.id("DGBanker"));
            String empid = ("1276");
          List<WebElement> rows=  table.findElements(By.tagName("tr"));
              for(int i=1;i<rows.size();i++)
              {
            	  List<WebElement> cols =  rows.get(i).findElements(By.tagName("td"));
             if(cols.get(0).getText().equals(empid))
             {
            	 cols.get(6).findElement(By.xpath("/html/body/div/form/div[3]/table/tbody/tr[2]/td/table/tbody/tr[4]/td[7]/a/img")).click();
             }
              }
          //  WebDriverWait wait= new WebDriverWait(driver,2000);
            //  wait.until(ExpectedConditions.alertIsPresent());
           //  try
         //      { Thread.sleep(500);
         //      }catch(Exception e)
          //     {
            	   
      //         }
               Alert alert2=    driver.switchTo().alert();
                  alert2.accept();
           /*   if( alert2.contains("delete"))
              {
           	   driver.switchTo().alert().accept();
              }else
              {
           	   driver.switchTo().alert().dismiss();
              }
*/
  }
  
  public void EditEmployeeDetails()
  {
	 	 driver.findElement(By.xpath("//table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[8]/td/a")).click();
	 	   WebElement table =    driver.findElement(By.id("DGBanker"));
	 	            String empid = ("1276");
	 	          List<WebElement> rows=  table.findElements(By.tagName("tr"));
	 	              for(int i=1;i<rows.size();i++)
	 	              {
	 	            	
		 	            	  List<WebElement> cols =  rows.get(i).findElements(By.tagName("td"));
	
	 	             if(cols.get(0).getText().equals(empid))
	 	             {
	 	            	 cols.get(5).findElement(By.xpath("/html/body/div/form/div[3]/table/tbody/tr[2]/td/table/tbody/tr[4]/td[6]/a/img")).click();
	 	             }
	 	              }
             
	 	           	 Select list =new Select(driver.findElement(By.id("lstBidU")));
	              list.selectByVisibleText("Mumbai");
	 	   
	 	     {
            	 
	 	     }
   }



public void AddNewUser()
{
	driver.findElement(By.xpath("//tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/a/img")).click();
     driver.findElement(By.xpath("//td/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td/table/tbody/tr[6]/td/a/img")).click();
    driver.findElement(By.id("Btnuser")).click();
  try {
	  Select list = new Select(driver.findElement(By.id("lst_Roles")));
  
     list.selectByIndex(6);

     Select list2 = new Select(driver.findElement(By.id("lst_Branch")));
      list.selectByIndex(1);
  
     Select list3 = new Select(driver.findElement(By.id("DrCName")));
     list.selectByIndex(0);
  }catch(StaleElementReferenceException e)
  {
	  
  }
  
      
    	  driver.findElement(By.id("Lbc_name")).sendKeys("Yashwin Babu");
      
         driver.findElement(By.id("txtUname")).sendKeys("Satish Babu");
         driver.findElement(By.id("txtLpwd")).sendKeys("12345678");
         driver.findElement(By.id("txtTpwd")).sendKeys("Satish@123");
         driver.findElement(By.id("BtnSubmit")).click();

}

      
	 	              
                     
	 	             






















}




