package utility;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Keywords {
	
	
	
	
	
	public static void scrollDown(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
 	    js.executeScript("window.scrollBy(0,250)", "");
		
	}
	

	public static void scrollUp(WebDriver driver)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
 	    js.executeScript("window.scro(250,0)", "");
		
	}
	
	
	

}
