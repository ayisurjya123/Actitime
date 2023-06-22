package com.testyantra.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testyantra.generic.Autoconstant;
import com.testyantra.generic.ExcellLibrary;

public class Actitimelogin implements Autoconstant
{

public WebDriver driver;
	
	@FindBy(id = "username")
	private WebElement usernametextfield;
	
	@FindBy(name = "pwd")
	private WebElement passwordtextfield;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBox;
	
	@FindBy(id = "loginButton")
	private WebElement loginButton;
	
    public Actitimelogin(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements( driver,this);
}
    public void loginmethod() throws IOException
    {
    	usernametextfield.sendKeys(ExcellLibrary.getcelvalue(Sheet_name_path, 1, 0));
    	
    	passwordtextfield.sendKeys(ExcellLibrary.getcelvalue(Sheet_name_path, 1, 1));
    	
    	keepLoggedInCheckBox.click();
    	
    	loginButton.click();
    	
    	
    	
    	
    }
}