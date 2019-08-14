package com.page.utills;

import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;
import com.automation.utills.SeleniumCore;
import com.automation.utills.SeleniumUtills;
import com.page.objects.LoginLogoutObjects;

public class LoginLogoutUtills extends BaseClass {


	public SeleniumCore seleniumCore;
	public SeleniumUtills seleniumUtills;
	public LoginLogoutObjects loginLogoutObjects;

	public LoginLogoutUtills(){
		seleniumCore = PageFactory.initElements(driver, SeleniumCore.class);
		seleniumUtills = PageFactory.initElements(driver, SeleniumUtills.class);
		loginLogoutObjects = PageFactory.initElements(driver, LoginLogoutObjects.class);
	}

	public void appLogin(String name,String pass){
		seleniumCore.enterText(loginLogoutObjects.usernamelocater, name);
		seleniumCore.enterText(loginLogoutObjects.passwordlocater, pass);
	}
	public void loginButton(){
		seleniumCore.clickOnElement(loginLogoutObjects.loginlocater);

	}
}
