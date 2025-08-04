package Janitri.Login_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	WebDriver driver;
	
		public Login_Page(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			
		}
		
		@FindBy (id="formEmail")
		WebElement userinput;
		
		@FindBy(id="formPassword")
		WebElement password;
		
		@FindBy(css="button.login-button")
		WebElement loginbutton;
	
		@FindBy(xpath="//img[@class=\"passowrd-visible\"]") // select eye icon
		WebElement eyeIcon;
		
		@FindBy(xpath="//p[@class='normal-text']")  // error message
		WebElement errormessage;
		
		
		//Actions
		
		public boolean isloginButtonEnabled()
		{
			return loginbutton.isEnabled();
		}
		
		public void enterUserid(String name)
		{
			userinput.sendKeys(name);
		}

		public void enterpassword(String pwd)
		{
			password.sendKeys(pwd);
		}

		public void clickOnLogin()
		{
			loginbutton.click();	
		}
		public void togglepasswordvisibility()
		{
			eyeIcon.click();
		}
		public boolean isPasswordMasked() {
	        return password.getAttribute("type").equals("password");   //It checks if the type attribute is still "password" — i.e. input is still masked.


	    }

	    public String getErrorMessage() {
	        return errormessage.getText(); //errorMessage is a WebElement for the error messages like "Invalid credentials" are shown.


}
}
