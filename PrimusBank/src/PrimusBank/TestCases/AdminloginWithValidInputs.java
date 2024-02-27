package PrimusBank.TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PrimusBank.library.Loginpage;
import Utils.AdminUtils;
import Utils.AppUtils;

public class AdminloginWithValidInputs extends AdminUtils {
      
	   @Parameters({"uid", "pwd"})
	   @Test
		public void Adminloginvalid(String uid,String pwd)
		{
		  
		 Loginpage lp = new  Loginpage();
		       lp.login(uid,uid);
		   lp.logout();
		
		
		}
	
	}


