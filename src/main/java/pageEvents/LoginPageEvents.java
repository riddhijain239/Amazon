package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseTest;
import pageObjects.LoginPageElements;

public class LoginPageEvents extends BaseTest {

	public void enterLoginCredentialsAndSignin() {
		// Enter User name
		driver.findElement(By.id(LoginPageElements.email)).sendKeys("riddhijain239@gmail.com");

		// Click on login button
		driver.findElement(By.id(LoginPageElements.continueBtn)).click();
	}

	public void enterPassword() {
		driver.findElement(By.id(LoginPageElements.password)).sendKeys("riddhi1234");
		driver.findElement(By.id(LoginPageElements.sign)).click();
	}
	
	
	public void clickLogoutLink() throws InterruptedException {
		
		Actions action = new Actions(driver);
		WebElement element = driver.findElement(By.xpath(LoginPageElements.userPageLink));
		action.moveToElement(element).build().perform();
		Thread.sleep(1500);
		driver.findElement(By.xpath(LoginPageElements.signoutLink)).click();
		
	}

}
