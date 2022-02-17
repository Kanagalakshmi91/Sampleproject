package Stepdefinition;

import java.io.IOException;
import java.util.Scanner;

import org.base.Baseutils;
import org.base.Registrationutils;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinitions extends Baseutils {
	
	Registrationutils login = new Registrationutils();
	
	@Given("Launch the Adactin Webpage")
	public void launch_the_adactin_webpage() {
	   getUrl("https://adactinhotelapp.com/");
	}

	@When("Click Newregistration page link")
	public void click_newregistration_page_link() {
	    login.newRegistration();
	}

	@When("Input username fiels with {string}")
	public void input_username_fiels_with(String string) {
	    login.getUsername(string);
	}

	@When("Input password fiels with {string}")
	public void input_password_fiels_with(String string) {
	    login.getPassword(string);
	}

	@When("Input repassword fiels with {string}")
	public void input_repassword_fiels_with(String string) {
	   login.getRePassword(string);
	}

	@When("Input fullname fiels with {string}")
	public void input_fullname_fiels_with(String string) {
	    login.getFullname(string);
	}

	@When("Input emailaddress fiels with {string}")
	public void input_emailaddress_fiels_with(String string) {
	    login.getEmailaddress(string);
	    Scanner scan = new Scanner(System.in);
	    login.getCaptcha(scan.next());
	}

	@When("Click agree button")
	public void click_agree_button() {
	    login.agreeButton();
	}

	@When("Click Register button")
	public void click_register_button() {
	   login.submitButton();
	}

	@Then("Check user login created")
	public void check_user_login_created() {
	    
	}
}