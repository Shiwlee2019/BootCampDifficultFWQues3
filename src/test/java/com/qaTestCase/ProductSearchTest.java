package com.qaTestCase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qaPages.HomePage;
import com.qaPages.ProductInfoPage;
import com.qaPages.SearchPage;

public class ProductSearchTest {
	public WebDriver driver;
	public HomePage homepage;
	public ProductInfoPage productinfopage;
	public SearchPage searchpage;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		homepage = new HomePage(driver);
	}
	
	@Test
	public void searchProduct() {
		productinfopage = new ProductInfoPage(driver);
		homepage.searchFieldBox();
		searchpage = homepage.clickSearchButton();
		Assert.assertTrue(searchpage.verifyingProduct());
		searchpage.selectSearchedresultProduct();
		Assert.assertTrue(productinfopage.verifingProductPage());
		
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

