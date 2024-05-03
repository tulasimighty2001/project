package group_Execution;


import org.testng.Reporter;
import org.testng.annotations.Test;

public class Allgroups {
	@Test(priority=1,groups="Smoke Test")
	
public void verifyLink() {
		Reporter.log("smoketestcase",true);
	}
@Test(priority=3,groups="functional")
public void verifyLogin() {
	Reporter.log("Functionaltestcase");
}
@Test(priority=2,groups="Smoketest")
public void verifyLogo() {
	Reporter.log("smoketestcase",true); 
}
@Test(priority=4,groups="Functional")
public void verifyLogout() {
	Reporter.log("functionaltestcase");
	
}
}
