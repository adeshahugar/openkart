package com.Opencart.tescase;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Openkart.Testpages.loginPage;

public class loginTestcase {
	WebDriver driver;
	@Test
	
	public void testpage() throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		loginPage log = new loginPage(driver);
		log.viewdemo();
		Thread.sleep(3000);
		log.frontpage();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String string : windowHandles) 
		{
			driver.switchTo().window(string);
		}
		Thread.sleep(3000);
		log.dropdown();
		log.Register();
		log.firstname("adesha");
		log.lastname("hugar");
		log.email("adeshahugar@gmail.com");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500);");
		log.password1("123456");
		log.radio();
		log.agreeradio();
		log.Continue();
		
	}
}
