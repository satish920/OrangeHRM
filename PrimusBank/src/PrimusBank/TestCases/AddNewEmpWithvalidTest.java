package PrimusBank.TestCases;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import PrimusBank.library.Employeeloginpage;
import Utils.AdminUtils;

public class AddNewEmpWithvalidTest extends AdminUtils {
      
	@Parameters({"txnm","pwd"})
	@Test
    public void addnewemp(String txnm, String pwd)
    {
    	  Employeeloginpage lp = new Employeeloginpage();
         lp.AddNewEmployee(txnm, pwd);
    
    
    }











}
