package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.Home_Page;
import pageObjects.Login_Page;

public class POM_TestCase1 {

	public static void main(String[] args) throws InterruptedException {
		
		//Open Browser
		WebDriver driver = new FirefoxDriver();
		
		//Navigate to URL
		System.out.println("Browser opens and navigate to URL");
		driver.get("http://store.demoqa.com/");
		Thread.sleep(4000L);
		
		//User Action
		Home_Page.lnk_MyAccount(driver).click();
		System.out.println("MyAccount is clicked in the HomePage screen");
		
		Login_Page.txtbx_username(driver).sendKeys("aw7");
		System.out.println("Username has been entered");
		
		Login_Page.txtbx_Password(driver).sendKeys("1234");
		System.out.println("Password has been entered");
		
		Login_Page.TckBx_RememberMe(driver).isSelected();
		System.out.println("RemenberMe TickBox is ticked");
		
		Login_Page.btn_Login(driver).click();
		System.out.println("Login button is clicked");
		System.out.println("Wait for few seconds before browser is closed.");
		Thread.sleep(7000L);
		
		
		//Browser is closing
		driver.close();
		System.out.println("Browser is now closed");
		

	}

}
