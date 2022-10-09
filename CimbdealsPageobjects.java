package pageObjects;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.BaseClass;

public class CimbdealsPageobjects extends BaseClass {
	
	public static ExtentReports report;
	public static ExtentTest logger;
	

	static String Octotravel_Detailtext_ExpectedText="TRAVEL & LIFESTYLE • OCTOTRAVEL";
	static String octotravel_discount_description_ExpectedText="50% Cash Back on OctoTravel";
	static String OctotraveDiscountValid_DateTime_ExpectedText="Valid until 31 Dec 2022";
	static String Octotravel_VisaFlights_similardealstext_ExpectedText="Similar Deals";
	
	
	static By overlaypopup_Close=By.xpath("//div[@class='overlay-content relative self-center']");
	static By burger_menu=By.xpath("//div[@class='btn-burger-menu cursor-pointer hover:drop-shadow-5']");
	static By cimblogo=By.xpath("//img[@src='/content/dam/cimb/personal/images/global/cimb-general.svg']");
	static By cimb_deals=By.xpath("(//a[contains(text(),'CIMB Deals')])[1]");
	static By selectcountry_popup_close=By.xpath("//img[@src='./assets/img/country/close.png']");
	static By travel_lifestyle_section=By.xpath("//span[contains(text(),'travel & lifestyle')]");
	static By viewall_travel_lifestyle=By.xpath("(//a[contains(text(),'View All')])[3]");
	static By octotravel_detailtext=By.xpath("//p[contains(text(),'travel & lifestyle • OctoTravel')]");
	static By octotravel_discount_description=By.xpath("//p[contains(text(),'50% Cash Back on OctoTravel')]");
	static By octotavel_discountvalid_datetime=By.xpath("//p[contains(text(),'Valid until 31 Dec 2022')]");
	static By similardealstext=By.xpath("//p[contains(text(),'Similar Deals')]");
	
	
	public static WebElement Overlaypopup(WebDriver driver)
	{
		return driver.findElement(overlaypopup_Close);
		
	}
	
	public static WebElement BurgerMenu(WebDriver driver)
	{
		return driver.findElement(burger_menu);
		
	}
	
	public static WebElement Cimblogo(WebDriver driver)
	{
		return driver.findElement(cimblogo);
	}
	
	public static WebElement Cimbdeals(WebDriver driver)
	{
		return driver.findElement(cimb_deals);
	}
	
	public static WebElement SelectCountry_Popup(WebDriver driver)
	{
		return driver.findElement(selectcountry_popup_close);
	}
	
	public static WebElement Travel_lifestyle_Section(WebDriver driver)
	{
		return driver.findElement(travel_lifestyle_section);
		
	}
	
	public static WebElement Viewall_Travel_Lifestyle(WebDriver driver) 
	{
		
		return driver.findElement(viewall_travel_lifestyle);
		
	}
	
	public static void  Implicit_wait_time(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	public static WebElement Octotravel_Dealtext(WebDriver driver)
	{
		return driver.findElement(octotravel_detailtext);
	}
	
	public static String Octotravel_Detailtext(WebDriver driver)
	{
		return driver.findElement(octotravel_detailtext).getText();
		
	}
	
	public static String Octotravel_Discount_Description(WebDriver driver)
	{
		return driver.findElement(octotravel_discount_description).getText();
	}
	
	public static String Octotavel_DiscountValid_DateTime(WebDriver driver)
	{
		return driver.findElement(octotavel_discountvalid_datetime).getText();
	}
	
	public static String SimilarDeals(WebDriver driver)
	{
		return driver.findElement(similardealstext).getText();
	}

	public static void Verify_OctoTravelDetailText(WebDriver driver)
	{
	Assert.assertEquals(Octotravel_Detailtext(driver),Octotravel_Detailtext_ExpectedText);
		
	if(Octotravel_Detailtext(driver).equals("TRAVEL & LIFESTYLE • OCTOTRAVEL"))
	{
		logger.log(LogStatus.PASS, "Page is navigated to the Octo Travel Visa Flights");	
	}
	else
	{
		logger.log(LogStatus.FAIL, "Test Failed, Page is not navigating to the Octo Travel Visa Flights");	
	}
		
	}
	
	public static void Verify_OctotravelDiscount_DescriptionText(WebDriver driver)
	{
		Assert.assertEquals(Octotravel_Discount_Description(driver),octotravel_discount_description_ExpectedText);
		
		if(Octotravel_Discount_Description(driver).equals("50% Cash Back on OctoTravel"))
		{
			logger.log(LogStatus.PASS, "Discount description is showing fine as expected");	
		}
		else
		{
			logger.log(LogStatus.FAIL, "Test Failed, Discount description is showing wrongly");	
		}
			
	}
	
	public static void Verify_OctoTravelDiscountValid_DateTime(WebDriver driver)
	{
		Assert.assertEquals(Octotavel_DiscountValid_DateTime(driver),OctotraveDiscountValid_DateTime_ExpectedText);
		
		if(Octotavel_DiscountValid_DateTime(driver).equals("Valid until 31 Dec 2022"))
		{
			logger.log(LogStatus.PASS, "Discount valid date and time is showing fine as expected");	
		}
		else
		{
			logger.log(LogStatus.FAIL, "Test Failed, Discount valid date and time are not showing");	
		}
			
		
		
	}
	
	public static void Verify_OctotravelVisaFlights_Similardeals_text(WebDriver driver)
	{
		Assert.assertEquals(SimilarDeals(driver),Octotravel_VisaFlights_similardealstext_ExpectedText);
		

		if(SimilarDeals(driver).equals("Similar Deals"))
		{
			logger.log(LogStatus.PASS, "Similar deals related to OctoTravel Visa Flights are showing fine");	
		}
		else
		{
			logger.log(LogStatus.FAIL, "Test Failed, Similar deals are not showing");	
		}
	}
	
	
	
									
	
	
	
	
	
	

	
	

	
			

	
	
	
}
