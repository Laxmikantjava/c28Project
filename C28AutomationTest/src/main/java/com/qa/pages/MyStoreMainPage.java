package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.PageFactory;
import com.qa.base.TestBase;

public class MyStoreMainPage extends TestBase {
	public MyStoreMainPage() {
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBy(xpath = "//input[@id='newsletter-input']")
	public static WebElement  newletter;
	
	@FindBy(xpath = "//button[@name='submitNewsletter']")
	public static WebElement newsletterSubmit;
	
	@FindBy(xpath="//*[@id=\"columns\"]")
	public static WebElement getAlertMsg;
	
	@FindBy(xpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]")
	public static WebElement verifyHeaderForWomen;
	
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[2]/a")
	public static WebElement verifyHeaderForDresses;
	

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	public static WebElement verifyHeaderForTshirt;
	
	@FindBy(xpath = "//a[@class='sf-with-ul'][contains(text(),'Women')]")
	public static WebElement goWomen;
	
	
	
	@FindBy(xpath = "//li[@class='sfHover']//ul//li//a[contains(text(),'Summer Dresses')] ")
	public static WebElement summerDresses;
	
	//span[contains(text(),'Add to cart')]
	
	//a[@class='button lnk_view btn btn-default'][contains(text(),'Add to cart')]
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li")
	public static WebElement moveElelment;
	
	@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/div[2]/a[1]/span[1]")
	public static WebElement addtoCart;
	
	@FindBy(xpath = "//a[@class='btn btn-default button button-medium'][contains(text(),'Proceed to checkout')]")
	public static WebElement proceedToCheckout;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li")
	public static WebElement WomenWebElement;
	
	//a[contains(text(),'Specials')]
	
	@FindBy(xpath = "//a[contains(text(),'Specials')]")
	public static WebElement specialWebElement;
	
	@FindBy(xpath = "//a[contains(text(),'New products')]")
	public static WebElement NewProductsWebElement;
	
	@FindBy(xpath = "//a[contains(text(),'Best sellers')]")
	public static WebElement bestSellerWebElement;
	
	@FindBy(xpath = "//a[contains(text(),'Our stores')]")
	public static WebElement ourStorWebElement;
	
	@FindBy(xpath = "//li[@class='item']//a[contains(text(),'Contact us')]")
	public static WebElement contectUsWebElement;
	
	@FindBy(xpath = " //a[contains(text(),'Terms and conditions of use')]")
	public static WebElement termAndConditionsWebElement;
	
	//
	@FindBy(xpath = "//a[contains(text(),'About us')]")
	public static WebElement aboutusWebElement;
	
	@FindBy(xpath = "//a[contains(text(),'Sitemap')]")
	public static WebElement siteMapWebElement;
	
	@FindBy(xpath = "//a[contains(text(),'Sitemap')]")
	public static WebElement myOrderWebElement;
	
	@FindBy(xpath = "//a[contains(text(),'My credit slips')]")
	public static WebElement myCreditSlipWebElement;
	
	@FindBy(xpath = "//a[contains(text(),'My addresses')]")
	public static WebElement myAddressWebElement;
	
	
	@FindBy(xpath = "//a[contains(text(),'My personal info')]")
	public static WebElement myPersonalInfoWebElement;
	
	
}
