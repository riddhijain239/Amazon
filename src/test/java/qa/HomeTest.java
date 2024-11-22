package qa;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.HomePageEvents;
import pageEvents.LoginPageEvents;

public class HomeTest extends BaseTest {

	LoginPageEvents loginPageEvents = new LoginPageEvents();
	HomePageEvents homePageEvents = new HomePageEvents();

	@Test
	public void openAmazon() throws InterruptedException {
		homePageEvents.openhellosigninLinktPage();
		loginPageEvents.enterLoginCredentialsAndSignin();
		loginPageEvents.enterPassword();
		homePageEvents.clickOnSearchBox();

		loginPageEvents.clickLogoutLink();
		
	}
}