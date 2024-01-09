package com.qaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductInfoPage {
public WebDriver driver;
	
	@FindBy(xpath = "//a[contains(text(),'Description')]")
	private WebElement verifyProductPage;
	
	public ProductInfoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifingProductPage() {
		return verifyProductPage.isDisplayed();
	}

}
