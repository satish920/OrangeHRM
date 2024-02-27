package Utils;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import PrimusBank.library.Loginpage;

public class AdminUtils extends AppUtils {
 
	 String uid = "Admin";
	 String pwd = "Admin";
    Loginpage lp;
	 
	 @BeforeTest
  public void login()
  {
	  Loginpage lp = new Loginpage();
    lp.login(uid, pwd);
  
}
 @AfterTest
public void logout()
{
	 lp = new Loginpage();
      lp.logout();

}




}
