package j8selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class uploadWNG {
WebDriver browserVar = borwser();
	
	@Test
	public WebDriver borwser()	{	
	System.setProperty("webdriver.gecko.driver", "C:\\Aentertainment\\hp old lapop files\\Resume and IT\\resume to canada\\Resume after arrival\\learning\\Testing\\selenium\\downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");
	WebDriver browserVar1 = new FirefoxDriver();
	browserVar1.get("http://leafground.com/pages/upload.html");
	return(browserVar1);
	}
	
	@Test
	public void uploadmethod() throws AWTException, InterruptedException
	{
		WebElement uploadbtn = browserVar.findElement(By.name("filename"));
		
		System.out.println("button name " + uploadbtn.getTagName());
		
		//this also works - uploadbtn.sendKeys("C:\\Users\\Anu\\Downloads\\testleaf.xlsx");
		
		Actions var2 = new Actions(browserVar);
		var2.click(uploadbtn).build().perform();
			
		Robot keyactnvar = new Robot();
		Thread.sleep(4000);
		 //incase action class is not used -- keyactnvar.keyPress(KeyEvent.VK_ENTER);
		// keyactnvar.keyRelease(KeyEvent.VK_ENTER);
		
		 String pathnameVar="C:\\Users\\Anu\\Downloads\\testleaf.xlsx";
		 //C:\Users\Anu\Downloads\testleaf.xlsx
		StringSelection strvar1 = new StringSelection(pathnameVar);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strvar1, null);
		 
		keyactnvar.keyPress(KeyEvent.VK_CONTROL);
		 keyactnvar.keyPress(KeyEvent.VK_V);
		 keyactnvar.keyRelease(KeyEvent.VK_V);
		 keyactnvar.keyRelease(KeyEvent.VK_CONTROL);
		 keyactnvar.keyPress(KeyEvent.VK_ENTER);
		 keyactnvar.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
