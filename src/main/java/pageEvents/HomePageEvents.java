package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.BaseTest;
import pageObjects.HomePageElements;
import pageObjects.LoginPageElements;

public class HomePageEvents extends BaseTest {
	// JavascriptExecutor js = (JavascriptExecutor) driver;

	public void openhellosigninLinktPage() {
		driver.findElement(By.xpath(HomePageElements.hellosignin)).click();
	}

	public void clickOnSearchBox() throws InterruptedException {
		driver.findElement(By.xpath(HomePageElements.searchBox)).sendKeys("samsung s23 ultra 5+g");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(HomePageElements.addToCart)).click();
		
		// driver.findElement(By.xpath(HomePageElements.cart)).click();
		// js.executeScript("window.scrollBy(0,350)", "");

	}
}