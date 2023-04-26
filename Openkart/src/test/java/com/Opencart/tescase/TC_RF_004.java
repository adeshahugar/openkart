package com.Opencart.tescase;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Openkart.Testpages.loginPage;

public class TC_RF_004 {
	WebDriver driver;

	@Test
	public void testcase() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.manage().window().maximize();
		loginPage et = new loginPage(driver);
		et.viewdemo();

		Thread.sleep(3000);
		et.frontpage();

		Set<String> windowHandles = driver.getWindowHandles();

		for (String string : windowHandles) {
			driver.switchTo().window(string);
		}

		et.dropdown();
		et.Register();
		et.firstname("");
		et.lastname("");
		et.password1("");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500);");
		et.Continue();
		
	}
}
