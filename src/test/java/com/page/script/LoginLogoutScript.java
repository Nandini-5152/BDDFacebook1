package com.page.script;

import org.junit.BeforeClass;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.page.utills.LoginLogoutUtills;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginLogoutScript extends BaseClass {


	public LoginLogoutUtills loginLogoutUtills;

	@BeforeClass
	public void loadFiles(){
		loadProbFile();
		loginLogoutUtills = PageFactory.initElements(driver,LoginLogoutUtills.class);
	}

	
	

	/*@Given("^user is alredy avilable in loginpage$")
	public void user_is_alredy_avilable_in_loginpag(){	
		String loginTitle = driver.getTitle();
		if (loginTitle.equalsIgnoreCase("facebook")) {
			System.out.println("login page displayed");	
		} else {
			System.out.println("login page is not displayed");
		}
	}*/

	@When("^title of loginpage is facebook$")
	public void title_of_loginpage_is_facebook(){
		String loginTitle = driver.getTitle();
		if (loginTitle.equalsIgnoreCase("facebook")) {
			System.out.println("Facebook -log i or sign up page is displayed");	
		} else {
			System.out.println("Facebook -log i or sign up page is not displayed");
		}
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
		loginLogoutUtills.appLogin("samplefbaccount@gmail.com","sample12345");

	}

	@And("^User clicks on login button$")
	public void User_clicks_on_login_button(){	
		loginLogoutUtills.loginButton();
	}

}
