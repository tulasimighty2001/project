package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;
	public class B {
	@Test
	public void TC1() {
	Reporter.log("TC4",true);
	}
	@Test
	public void TC2() {
		Reporter.log("TC5",true);	
	}
	@Test
	public void TC3() {
		Reporter.log("TC6",true);
	}
	}


