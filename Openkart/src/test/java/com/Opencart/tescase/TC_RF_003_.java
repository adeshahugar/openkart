package com.Opencart.tescase;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Openkart.Testpages.loginPage;

public class TC_RF_003_ {
	WebDriver driver;

	@Test
	public void testcase() throws InterruptedException {
    WebDriver driver= new ChromeDriver();
    driver.get("https://www.opencart.com/");
    driver.manage().window().maximize();
    loginPage ph = new loginPage(driver);
    ph.viewdemo();
    Thread.sleep(3000);
    Set<String> windowHandles = driver.getWindowHandles();

	for (String string : windowHandles) 
	{
		driver.switchTo().window(string);
	}
    ph.frontpage();
    ph.dropdown();
    ph.Register();
    ph.firstname("khaja");
    ph.lastname("adesha");
    ph.password1("11111111111");
    ph.radio();
    JavascriptExecutor js= (JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,500);");
    ph.Continue();
    
    
    
  
      
	}
}