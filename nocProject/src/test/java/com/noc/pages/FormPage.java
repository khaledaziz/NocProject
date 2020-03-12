package com.noc.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FormPage {
	WebDriver driver;
	
	@FindBy(id="first_5")
	public WebElement firstName_TXT;
	
	@FindBy(id ="last_5")
	public WebElement lastName_TXT;
	
	@FindBy(id ="input_2")
	public WebElement submit_BTN;
	
	public FormPage(WebDriver driver){

        this.driver = driver;

        PageFactory.initElements(driver, this);

    }
}
