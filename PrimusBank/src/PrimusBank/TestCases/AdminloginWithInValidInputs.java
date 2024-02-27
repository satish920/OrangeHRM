package PrimusBank.TestCases;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PrimusBank.library.Loginpage;
import Utils.AdminUtils;
import Utils.AppUtils;

public class AdminloginWithInValidInputs extends AdminUtils {

 
     @Parameters({"uid","pwd"})
	@Test
	public static void checkAdminloginwithinvalid( String uid, String pwd)
  {
	  Loginpage lp = new Loginpage();
    lp.login(uid,pwd);
    boolean status =lp.isDisplayedAnErrorMsg();
      Assert.assertFalse(status);
    
    
    lp.logout();
  
  }






}
