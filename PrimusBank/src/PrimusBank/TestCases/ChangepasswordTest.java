package PrimusBank.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PrimusBank.library.Loginpage;
import Utils.AdminUtils;
import Utils.AppUtils;

  @Test
public class ChangepasswordTest extends AdminUtils {

public void checkChangePwd()
{
	    Loginpage lp = new Loginpage();
  boolean resu  = lp.changePassword();
    Assert.assertFalse(resu);

  
}















}
