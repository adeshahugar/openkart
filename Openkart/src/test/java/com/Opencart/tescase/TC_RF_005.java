package com.Opencart.tescase;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Openkart.Testpages.loginPage;

public class TC_RF_005 
{
	WebDriver driver;

	@Test
	public void testpage() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		loginPage bt = new loginPage(driver);
		bt.viewdemo();
		Thread.sleep(3000);
		bt.frontpage();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String string : windowHandles) 
		{
			driver.switchTo().window(string);
		}
		Thread.sleep(3000);
		bt.dropdown();
		bt.Register();
		bt.firstname("adesha");
		bt.lastname("hugar");
		bt.email("adeshahugar@gmail.com");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		bt.password1("123456");
		bt.agreeradio();
		bt.subcribe();
		Thread.sleep(2000);
		bt.Continue();
		
	}

}
