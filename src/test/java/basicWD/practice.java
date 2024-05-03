package basicWD;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class practice {

	public static void main(String[] args)  throws Throwable {
WebDriver driver=new FirefoxDriver();
driver.navigate().to("https://www.google.com");
Thread.sleep(5000);
driver.navigate().to("https://www.amazon.com");
Thread.sleep(5000);
driver.navigate().back();
Thread.sleep(5000);
driver.navigate().forward();
driver.navigate().refresh();
	}

}
