package com.Openkart.Testpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class loginPage {
	@FindBy(xpath = "//a[text()='View Demo' and@class='btn btn-white btn-xl']")
	private WebElement viewdemo;

	@FindBy(xpath = "//span[text()='View Store Front']")
	private WebElement frontpage;

	@FindBy(xpath = "//div//span[text()='My Account' and@class='d-none d-md-inline']")
	private WebElement dropdown;

	@FindBy(xpath = "//a[text()='Register' and@class='dropdown-item']")
	private WebElement Register;

	@FindBy(xpath = "//input[@name='firstname']")
	private WebElement firstname;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement lastname;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement email;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement password1;

	@FindBy(xpath = "//input[@type='radio' and@id='input-newsletter-no']")
	private WebElement radio;

	@FindBy(xpath = "//input[@name='agree']")
	private WebElement agreeradio;
	
	@FindBy(xpath = "//label[text()='Yes']")
	private WebElement subcribe;

	@FindBy(xpath = "//button[text()='Continue' and@type='submit']")
	private WebElement Continue;

	private WebDriver driver;

	public loginPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void Register() {
		Register.click();
	}
	public void subcribe()
	{
		subcribe.click();
	}
	

	public void frontpage() {
		frontpage.click();
	}

	public void viewdemo() {
		viewdemo.click();
	}

	public void dropdown() {
		dropdown.click();
	}

	public void firstname(String un) {
		firstname.sendKeys(un);

	}

	public void lastname(String un) {
		lastname.sendKeys(un);
	}

	public void email(String un) {
		email.sendKeys(un);

	}

	public void password1(String pass) {
		password1.sendKeys(pass);
	}

	public void radio() {
		radio.click();
	}

	public void agreeradio() {
		agreeradio.click();
	}

	public void Continue() {
		Continue.click();
	}
}

