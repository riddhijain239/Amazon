package pageObjects;

public interface LoginPageElements {
	// By XPATH identifier
	
	String email = "ap_email";
	String continueBtn = "continue";
	String password = "ap_password";
	String sign = "signInSubmit";
	
	
	
	// Logout by XPATH
	String userPageLink = "//span[normalize-space()='Account & Lists']"; 
	String signoutLink = "//span[normalize-space()='Sign Out']";
}

