package Actionsclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver=new EdgeDriver();
driver.get("https://www.google.com");
//create a particular xpath
WebElement gmail=driver.findElement(By.xpath("//a[.='Gmail']"));
Actions a=new Actions(driver);
a.moveToElement(gmail).contextClick().doubleClick().perform();


	}

}
