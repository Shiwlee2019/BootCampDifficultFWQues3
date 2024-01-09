package com.qaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	@FindBy(xpath = "//input[@class='form-control input-lg']")
	private WebElement searchField;
	
	@FindBy(xpath = "//button[@class='btn btn-default btn-lg']")
	private WebElement searchButton;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void searchFieldBox() {
		searchField.sendKeys("iphone");
	}
	public SearchPage clickSearchButton() {
		searchButton.click();
		return new SearchPage (driver);
	}

}
