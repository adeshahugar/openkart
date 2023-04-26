package com.Opencart.tescase;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Openkart.Testpages.LGpage;
import com.Openkart.Testpages.loginPage;

public class TC_RF_007 {
	WebDriver driver;

	@Test
	public void loginPage() throws InterruptedException {
       WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		loginPage lg = new loginPage(driver);
		lg.viewdemo();
		Thread.sleep(3000);
		lg.frontpage();
		Set<String> windowHandles = driver.getWindowHandles();

		for (String string : windowHandles) 
		{
			driver.switchTo().window(string);
		}
		Thread.sleep(3000);
       lg.dropdown();
       lg.Register();

       LGpage lgk=new  LGpage(driver);
       lg.dropdown();
       lgk.loginlk();
       Thread.sleep(2000);
       lgk.Continue_btn();
       Thread.sleep(10000);
       lgk.RegisterRightColumn();
       
       
	}
	
}
