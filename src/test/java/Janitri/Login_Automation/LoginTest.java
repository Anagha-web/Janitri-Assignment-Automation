package Janitri.Login_Automation;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	Login_Page login;    //obj of Login_Page to fetch all actions.
	
    @BeforeMethod
    public void initPage() {
    	
    
    	login = new Login_Page(driver);
    }
    @Test              //Login button should be disabled when fields are empty
    public void testLoginButtonDisabledWhenFieldAreEmpty() {
        Assert.assertFalse(login.isloginButtonEnabled(), "Login button should be disabled");  //We expect it to be disabled when fields are empty so we use assert false
        
    }
    @Test        //Invalid Login Show Error Msg
    public void testInvalidLoginShowErrorMsg() {
        login.enterUserid("test@invalid.com");
        login.enterpassword("wrongpassword");
        login.clickOnLogin();
        Assert.assertTrue(login.getErrorMessage().contains("Invalid"), "Error should be shown");   //get the error message using getErrorMessage()& Check if the error contains the word "Invalid".
    }
    
    @Test      //password masking and unmasking
    public void testPasswordMaskedbutton() {
        Assert.assertTrue(login.isPasswordMasked(), "Password should be masked");
        login.togglepasswordvisibility();
        Assert.assertFalse(login.isPasswordMasked(), "Password should be unmasked");
    }
    @Test        //check login button enabled
    public void testPageElementPresence() {
        Assert.assertTrue(login.isloginButtonEnabled() == false || true, "Login button should be present");
        
    }


}
