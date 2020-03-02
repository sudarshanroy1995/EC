package eerbied;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_01 {
	static {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}
	
	@Test
	public void testOne() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
		driver.close();
	}
}
