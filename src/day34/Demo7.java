package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo7 {

	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	@Parameters("browser")
	@Test
	public void test(String browser) throws InterruptedException {
		WebDriver driver;
		if(browser.equals("Chrome")) {
			driver=new ChromeDriver();
			driver.manage().window().setPosition(new Point(900,10));
		}
		else {
			driver=new FirefoxDriver();
			driver.manage().window().setPosition(new Point(10,10));
		}
		driver.get("https://demo.actitime.com/login.do");
		for(int i=0;i<10;i++)
		{	
			driver.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(500);
			driver.findElement(By.id("username")).clear();
			Thread.sleep(500);
		}
	}

}
