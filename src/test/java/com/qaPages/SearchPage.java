package com.qaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public WebDriver driver;
	
	@FindBy(xpath = "//img[@class='img-responsive']")
	private WebElement verifySearchproduct;
	
	@FindBy(linkText = "iPhone")
	private WebElement clicksearchedProduct;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyingProduct() {
		 return verifySearchproduct.isDisplayed();
	}
	public void selectSearchedresultProduct() {
		clicksearchedProduct.click();
}
}