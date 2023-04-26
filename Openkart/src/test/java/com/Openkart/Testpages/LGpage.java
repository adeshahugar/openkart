package com.Openkart.Testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LGpage {
	@FindBy(xpath = "//li//a[text()='Login']")
	private WebElement loginlk;
	
	@FindBy(xpath = "//a[text()='Continue']")
	private WebElement Continue_btn;
	@FindBy(xpath = "//div//a[text()='Register' and@class=\"list-group-item\"]")
	private WebElement RegisterRightColumn;

	private WebDriver driver;

	public LGpage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void loginlk() {
		loginlk.click();
	}

	public void Continue_btn() {
		Continue_btn.click();
	}
	public void RegisterRightColumn() 
	{
		RegisterRightColumn.click();
	}
}
