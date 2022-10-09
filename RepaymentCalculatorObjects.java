package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import utility.BaseClass;

public class RepaymentCalculatorObjects extends BaseClass {
	

	static String Monthly_Interest_ExpectedText="Monthly Interest";
	static String Monthly_Instalment_ExpectedText="Monthly Instalment";
	static String Loan_Tenure_Header_ExpectedText="Loan Tenure (Years)";
	static String Loan_Tenure_Years_ExpectedText="5";
	static String EffectiveInterestRate_ExpectedText="6.44%";
	static String MonthlyInstallmentAmount_ExpectedText="6.44%";
	
	
	
	static By close_popup=By.xpath("//*[@class='btn-overlay-close icon-bytesize absolute top-0 right-0 mt-3 mr-2 md:mt-6 md:mr-6 text-red-500 cursor-pointer z-100']");
	
	static By menulink=By.xpath("//div[@class='btn-burger-menu cursor-pointer hover:drop-shadow-5']");
	
	static By tools_menu=By.xpath("//a[@href='/en/personal/tools.html']");
	
	static By calculator_link=By.xpath("(//a[@class='tool-link hover:no-underline pl-5 pt-5'])[1]");
	
	static By loan_amount=By.xpath("//input[@type='tel'])[1]");
	
	static By course_duration=By.xpath("//input[@type='tel'])[2]");
	
	static By loan_tenure=By.xpath("//input[@type='tel'])[3]");
	
	static By monthly_intrest=By.xpath("//span[contains(text(),'Monthly Interest')]");
	
	static By monthly_installment=By.xpath("//span[contains(text(),'Monthly Instalment')]");
	
	static By table_loan_tenure_header=By.xpath("//div[@class='table-scroll-area overflow-x-auto overflow-y-hidden relative']/table/tbody/tr[1]/th[1]");
	
	static By loan_tenure_data=By.xpath("//div[@class='table-scroll-area overflow-x-auto overflow-y-hidden relative']/table/tbody/tr[3]/td[1]");
			
	static By effective_intrestrate_data=By.xpath("//div[@class='table-scroll-area overflow-x-auto overflow-y-hidden relative']/table/tbody/tr[3]/td[3]");
	
	static By monthly_install_amount=By.xpath("//div[@class='table-scroll-area overflow-x-auto overflow-y-hidden relative']/table/tbody/tr[3]/td[4]");
	
	
	
	public static WebElement Overlaypopupclose(WebDriver driver)
	{
		return driver.findElement(close_popup);
		
	}
	
	public static WebElement burgermenulink(WebDriver driver)
	{
		return driver.findElement(menulink);
		
	}
	
	public static WebElement toolsmenulink(WebDriver driver)
	{
		return driver.findElement(tools_menu);
		
	}
	
	public static WebElement calculator(WebDriver driver)
	{
		return driver.findElement(calculator_link);
		
	}
	
	public static WebElement loan_amount(WebDriver driver)
	{
		return driver.findElement(loan_amount);
		
	}

	
	public static WebElement course_duration(WebDriver driver)
	{
		return driver.findElement(course_duration);
		
	}
	
	public static WebElement loan_tenure(WebDriver driver)
	{
		return driver.findElement(loan_tenure);
		
	}
	
	public static String monthly_interest(WebDriver driver)
	{
		return driver.findElement(monthly_intrest).getText();
		
	}
	
	
	public static void Verify_monthly_interesttext(WebDriver driver)
	{
		
	Assert.assertEquals(monthly_interest(driver),Monthly_Interest_ExpectedText);
		
	if(monthly_interest(driver).equals("Monthly Interest"))
	{
		logger.log(LogStatus.PASS, "Test Passed, Monthly Interest text is exist");	
	}
	else
	{
		logger.log(LogStatus.FAIL, "Test Failed, Monthly Interest text is not exist");	
	}
		
	}
	
	
	
	public static String monthly_installment(WebDriver driver)
	{
		return driver.findElement(monthly_installment).getText();
		
	}
	
	public static void verify_monthly_installmentText(WebDriver driver)
	{
		
	Assert.assertEquals(monthly_installment(driver),Monthly_Instalment_ExpectedText);
		
	if(monthly_interest(driver).equals("Monthly Instalment"))
	{
		logger.log(LogStatus.PASS, "Test Passed, Monthly Installment text is exist");	
	}
	else
	{
		logger.log(LogStatus.FAIL, "Test Failed, Monthly Installment text is not exist");	
	}
		
	}
	
	
	public static String table_loan_tenure_header(WebDriver driver)
	{
		return driver.findElement(table_loan_tenure_header).getText();
		
	}
	
	public static void verify_table_loan_tenure_header(WebDriver driver)
	{
		
	Assert.assertEquals(table_loan_tenure_header(driver),Loan_Tenure_Header_ExpectedText);
		
	if(monthly_interest(driver).equals("Loan Tenure (Years)"))
	{
		logger.log(LogStatus.PASS, "Test Passed, loan_tenure_header text is exist");	
	}
	else
	{
		logger.log(LogStatus.FAIL, "Test Failed, loan_tenure_header text is not exist");	
	}
		
	}

	
	
	public static String loan_tenure_data(WebDriver driver)
	{
		return driver.findElement(loan_tenure_data).getText();
		
	}
	
	public static void verify_loan_tenure_data(WebDriver driver)
	{
		
	Assert.assertEquals(loan_tenure_data(driver),Loan_Tenure_Years_ExpectedText);
		
	if(loan_tenure_data(driver).equals(Loan_Tenure_Years_ExpectedText))
	{
		logger.log(LogStatus.PASS, "Test Passed, Loan Tenure data is exist and it is showing as expected");	
	}
	else
	{
		logger.log(LogStatus.FAIL, "Test Failed, Loan Tenure data is not exist");	
	}
		
	}
	
	
	public static String effective_intrestrate_data(WebDriver driver)
	{
		return driver.findElement(effective_intrestrate_data).getText();
		
	}
	
	public static void verify_effective_intrestrate_data(WebDriver driver)
	{
		
	Assert.assertEquals(effective_intrestrate_data(driver),EffectiveInterestRate_ExpectedText);
		
	if(effective_intrestrate_data(driver).equals(EffectiveInterestRate_ExpectedText))
	{
		logger.log(LogStatus.PASS, "Test Passed, Effective Interest Rate is showing as expected");	
	}
	else
	{
		logger.log(LogStatus.FAIL, "Test Failed, Effective Interest Rate is not showing fine");	
	}
		
	}
	
	
	public static String monthly_install_amount(WebDriver driver)
	{
		return driver.findElement(monthly_install_amount).getText();
		
	}
	
	
	
	public static void verify_monthly_installment_amount(WebDriver driver)
	{
		
	Assert.assertEquals(monthly_install_amount(driver),MonthlyInstallmentAmount_ExpectedText);
		
	if(monthly_install_amount(driver).equals(MonthlyInstallmentAmount_ExpectedText))
	{
		logger.log(LogStatus.PASS, "Test Passed, Monthly Installment Amount is showing as expected");	
	}
	else
	{
		logger.log(LogStatus.FAIL, "Test Failed, Monthly Installment Amount is not showing fine as expected");	
	}
		
	}
	
	
	
	
	
	
	
	

			
					
	
	
	
	

}
