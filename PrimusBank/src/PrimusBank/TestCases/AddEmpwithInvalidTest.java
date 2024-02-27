package PrimusBank.TestCases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PrimusBank.library.Employeeloginpage;
import Utils.AdminUtils;

public class AddEmpwithInvalidTest extends AdminUtils {
    
	@Test
public void newempinvalid()
{
	Employeeloginpage emp = new Employeeloginpage();
    emp.AddEmpWithInvalid();

  




}








}
