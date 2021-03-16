package com.qaprosoft.carina.demo.gui.pagesLab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.gui.pagesLab.components.HeaderMenu;



public class HomePage extends AbstractPage{

	@FindBy(xpath="//header[@class=\"b-head\"]")
	private HeaderMenu headerMenu;

	@FindBy(xpath="// p[@class='footer-lang-switch']/strong")
	private ExtendedWebElement activLanguage;
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public HeaderMenu getHeaderMenu() {
	 return headerMenu;
	}

	public void clickLanguage(String language) {
		ExtendedWebElement lang=
				findExtendedWebElement(By.xpath(String.format("//a[text()='%s']", language)));
		lang.click();
	}
	public String readLanguage() {
		 assertElementPresent(activLanguage);
		return activLanguage.getText();
		
	}


	
	

	
	
	
	

}
