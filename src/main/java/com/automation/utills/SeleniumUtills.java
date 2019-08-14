package com.automation.utills;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.automation.base.BaseClass;

public class SeleniumUtills extends BaseClass {

	
	public void selectMenu(WebElement locater){
		Actions act = new Actions(driver);
		act.click(locater).build().perform();
	}
	
	public void selectSubMenu(WebElement menulocater,WebElement submenulocater){
		Actions act = new Actions(driver);
		act.moveToElement(menulocater).build().perform();
		act.click(submenulocater).build().perform();
	}
	
	public void clickOnEnter(){
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).build().perform();
	}
	public void clickOnEscap(){
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ESCAPE).build().perform();
	}
}
