package com.Opencart.tescase;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC_RF_009 {
	WebDriver driver;

	@Test
	public void loginPage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com");
		driver.manage().window().maximize();
		com.Openkart.Testpages.loginPage rd = new com.Openkart.Testpages.loginPage(driver);
		rd.viewdemo();
		Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			driver.switchTo().window(string);
		}
		rd.frontpage();
		Thread.sleep(3000);
		rd.dropdown();
		rd.Register();

	}

}
