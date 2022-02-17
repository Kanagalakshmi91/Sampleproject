package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Registrationutils extends Baseutils {
	
	@FindBy(xpath = "//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a")
	public WebElement Registrationlink;
	
	@FindBy(id = "username")
	public WebElement Username;
	
	@FindBy(id = "password")
	public WebElement Password;
	
	@FindBy(id = "re_password")
	public WebElement Repassword;
	
	@FindBy(id = "full_name")
	public WebElement Fullname;
	
	@FindBy(id = "email_add")
	public WebElement Emailaddress;
	
	@FindBy(id = "captcha-form")
	public WebElement Captcha;
	
	@FindBy(id = "tnc_box")
	public WebElement Agreebox;
	
	@FindBy(id = "Submit")
	public WebElement Submitbutton;
	
	@FindBy(xpath = "//div[@class = 'auth_error']")
	public WebElement autherror;
	
	@FindBy(id = "username")
	public WebElement Existingusername;
	
	@FindBy(id = "password")
	public WebElement Existingpassword;
	
	@FindBy(id = "login")
	public WebElement Loginbutton;
	
	public Registrationutils() {
		PageFactory.initElements(driver, this);
	}
	
	public void newRegistration() {
		Registrationutils log = new Registrationutils();
		log.click(Registrationlink);
	}
	
	public void getUsername(String name) {
		Registrationutils log = new Registrationutils();
		log.inputTextBox(Username, name);
	}
	
	public void getPassword(String pass) {
		Registrationutils log = new Registrationutils();
		log.inputTextBox(Password, pass);
	}
	
	public void getRePassword(String repass) {
		Registrationutils log = new Registrationutils();
		log.inputTextBox(Repassword, repass);
	}
	
	public void getFullname(String fullname) {
		Registrationutils log = new Registrationutils();
		log.inputTextBox(Fullname, fullname);
	}
	
	public void getEmailaddress(String email) {
		Registrationutils log = new Registrationutils();
		log.inputTextBox(Emailaddress, email);
	}
	
	public void getCaptcha(String chapcha) {
		Registrationutils log = new Registrationutils();
		log.inputTextBox(Captcha, chapcha);
	}
	
	public void agreeButton() {
		Registrationutils log = new Registrationutils();
		log.click(Agreebox);
	}

	public void submitButton() {
		Registrationutils log = new Registrationutils();
		log.click(Submitbutton);
	}
	
	public void getExistingUsername(String name) {
		Registrationutils log = new Registrationutils();
		log.inputTextBox(log.Existingusername, name);
	}
	
	public void getExistingPassword(String password) {
		Registrationutils log = new Registrationutils();
		log.inputTextBox(log.Existingpassword, password);
	}
	
	public void clickLoginbutton() {
		Registrationutils log = new Registrationutils();
		log.click(log.Loginbutton);
	}

	public String getLoginError() {
		Registrationutils log = new Registrationutils();
		return log.autherror.getText();
	}
	
}
