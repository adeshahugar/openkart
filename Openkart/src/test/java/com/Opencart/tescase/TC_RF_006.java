package com.Opencart.tescase;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Openkart.Testpages.loginPage;

public class TC_RF_006 {
	WebDriver driver;

	@Test
	public void loginPage() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com");
		driver.manage().window().maximize();
		loginPage go = new loginPage(driver);
		Thread.sleep(3000);
		go.viewdemo();
		final Set<String> windowHandles = driver.getWindowHandles();
		for (String string : windowHandles) {
			driver.switchTo().window(string);
		}
		go.frontpage();
		Thread.sleep(2000);
		go.dropdown();
		go.Register();
		go.firstname("sameer bro");
		go.lastname("rathod");
		go.email("shabada@gmail.com");
		go.password1("suspence");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		go.radio();
		go.Continue();
	}

}
