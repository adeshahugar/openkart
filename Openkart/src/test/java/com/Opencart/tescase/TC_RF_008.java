package com.Opencart.tescase;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Openkart.Testpages.loginPage;

public class TC_RF_008 {
	WebDriver driver;

	@Test
	public void loginpage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com");
		driver.manage().window().maximize();
		loginPage gt = new loginPage(driver);
		Thread.sleep(3000);
		gt.viewdemo();
		final Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			driver.switchTo().window(string);
		}
		gt.frontpage();
		gt.dropdown();
		gt.Register();
		gt.firstname("adeshA");
		gt.lastname("ahisds");
		gt.password1("123456");
		gt.radio();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		gt.Continue();

	}
}
