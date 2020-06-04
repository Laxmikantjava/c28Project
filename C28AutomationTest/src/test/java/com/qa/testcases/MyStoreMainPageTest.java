package com.qa.testcases;

import static org.testng.Assert.assertEquals;

import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.base.TestBase;
import com.qa.pages.MyStoreMainPage;


public class MyStoreMainPageTest extends TestBase {

	SoftAssert sassert = new SoftAssert();

	MyStoreMainPage mystoremainpage;

	String mystore = "http://automationpractice.com/index.php";

	@BeforeTest
	public void setUp()  throws FileNotFoundException{

		initialization();
		mystoremainpage = new MyStoreMainPage();
		launchAut(mystore);

	}	

	@Test(priority = 1)
	public void validateTitlePageTest()
	{
		String title= driver.getTitle();
		sassert.assertEquals(title, "My Store","title is not matching please check thi once again");
	}

	@Test(priority = 3)
	public void verifyHeader() {
		MyStoreMainPage.verifyHeaderForWomen.click();
		String title = MyStoreMainPage.verifyHeaderForWomen.getText();
		//assert.assertEquals(title, "women");
		sassert.assertEquals(title, "WOMEN","women header is not matching");
	}

	@Test(priority = 4)
	public void verifyHeaderDress() {
		MyStoreMainPage.verifyHeaderForDresses.click();
		String title = MyStoreMainPage.verifyHeaderForDresses.getText();
		sassert.assertEquals(title, "DRESSES", "Dresses header is not matching");
	}

	@Test(priority = 5)
	public void verifyHeaderTshirt() {
		MyStoreMainPage.verifyHeaderForTshirt.click();
		String title = MyStoreMainPage.verifyHeaderForTshirt.getText();
		sassert.assertEquals(title, "T-SHIRTS", "Tshirt is not matching");
	}



	// Go to the home page and subscribe the newsletter by entering email id



	@Test(priority = 2)
	public void subscribeNewsletterTest() {
		Random rand = new Random();
		int emailNumber=rand.nextInt(10000);
		String email="laxmikant"+emailNumber+"@gmail.com";
		MyStoreMainPage.newletter.sendKeys(email);	
		MyStoreMainPage.newsletterSubmit.click();
		/*
		 * String alertStr=driver.switchTo().alert().getText();
		 * System.out.println(alertStr);
		 */
		String strNewLetter=MyStoreMainPage.getAlertMsg.getText();

		sassert.assertEquals(strNewLetter, "Newsletter : This email address is already registered");
	}

	//(enabled=false)

	//3. Automate Women > Dresses > Summer Dresses listing page a. Apply any one available filter and verify the results

	@Test(priority = 6)
	public void verifyResultsOfWomenDresses() throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(MyStoreMainPage.verifyHeaderForWomen).perform();
		Thread.sleep(5000);
		MyStoreMainPage.summerDresses.click();

	}
	//4. Verify the checkout journey by adding any product to the cart. 
	@Test(priority = 8)   // we are not able to run this testcase manually beacause filter is not working
	public void addProductToCart() throws InterruptedException  {
		MyStoreMainPage.verifyHeaderForTshirt.click();
		Actions act = new Actions(driver);
		act.moveToElement(MyStoreMainPage.moveElelment).perform();
		Thread.sleep(5000);
		MyStoreMainPage.addtoCart.click();
		Thread.sleep(5000);


		driver.switchTo().window(driver.getWindowHandle());

		MyStoreMainPage.proceedToCheckout.click();

	}

	@Test(priority = 7)
	public void verifyFooters() {

		MyStoreMainPage.WomenWebElement.click();
		String title =MyStoreMainPage.WomenWebElement.getText();
		sassert.assertEquals(title, "POPULAR");

		MyStoreMainPage.WomenWebElement.click();
		String title1  =MyStoreMainPage.NewProductsWebElement.getText();
		sassert.assertEquals(title1, "New products");


		MyStoreMainPage.WomenWebElement.click();
		String title2  =MyStoreMainPage.bestSellerWebElement.getText();
		sassert.assertEquals(title2, "Best sellers");


		MyStoreMainPage.WomenWebElement.click();
		String title3  =MyStoreMainPage.ourStorWebElement.getText();
		sassert.assertEquals(title3, "Our stores", "footer is not matching");


		MyStoreMainPage.WomenWebElement.click();
		String title4  =MyStoreMainPage.contectUsWebElement.getText();
		sassert.assertEquals(title4, "Contact us");

		MyStoreMainPage.WomenWebElement.click();
		String title5  =MyStoreMainPage.termAndConditionsWebElement.getText();
		sassert.assertEquals(title5, "Terms and conditions of use");

		MyStoreMainPage.WomenWebElement.click();
		String title6  =MyStoreMainPage.contectUsWebElement.getText();
		sassert.assertEquals(title6, "Contact us");

		MyStoreMainPage.WomenWebElement.click();
		String title7  =MyStoreMainPage.aboutusWebElement.getText();;
		sassert.assertEquals(title7, "About us");

		MyStoreMainPage.WomenWebElement.click();
		String title8  =MyStoreMainPage.siteMapWebElement.getText();
		sassert.assertEquals(title8, "Sitemap", "sitemap footer is not matching");

		MyStoreMainPage.WomenWebElement.click();
		String title9  =MyStoreMainPage.myOrderWebElement.getText();
		sassert.assertEquals(title9, "Sitemap", "My Order footer is not matching");

		MyStoreMainPage.WomenWebElement.click();
		String title10  =MyStoreMainPage.myCreditSlipWebElement.getText();
		sassert.assertEquals(title10, "My credit slips");

		MyStoreMainPage.WomenWebElement.click();
		String title11  =MyStoreMainPage.myAddressWebElement.getText();
		sassert.assertEquals(title11, "My addresses");

		MyStoreMainPage.WomenWebElement.click();
		String title12  =MyStoreMainPage.myPersonalInfoWebElement.getText();
		sassert.assertEquals(title12, "My personal info");

	}

	@AfterTest
	public void closeSetUp()
	{
		driver.quit();
	}

}

