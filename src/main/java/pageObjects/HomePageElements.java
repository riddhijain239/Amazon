package pageObjects;

public interface HomePageElements {
	// By XPATH identifier
		String hellosignin = "//div[@class='nav-line-1-container']";
		String signin = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']";
		String addToCart = "//button[@id='a-autoid-1-announce']";
		
		// Product search by X-Path
		String searchBox ="//input[@id='twotabsearchtextbox']";
		
		// Go to cart
		//String cart = "//span[normalize-space()='Cart']";
		
}
