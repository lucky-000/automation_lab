package com.qaprosoft.carina.demo.gui.pagesLab;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.components.FooterMenu;
import com.qaprosoft.carina.demo.gui.components.WeValuePrivacyAd;
import com.qaprosoft.carina.demo.gui.pagesLab.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.pagesLab.components.SearchingItem;



public class HomePage extends AbstractPage{

	@FindBy(xpath="//header[@class=\"b-head\"]")
	private HeaderMenu headerMenu;
	@FindBy(xpath="//a[text()='English']")
	private ExtendedWebElement englishLanguage;
	@FindBy(xpath="// p[@class='footer-lang-switch']/strong")
	private ExtendedWebElement activLanguage;
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public HeaderMenu getHeaderMenu() {
	 return headerMenu;
	}
	public void clickEnglishLanguage() {
		englishLanguage.click();
	}
	public String readLanguage() {
		 assertElementPresent(activLanguage);
		return activLanguage.getText();
		
	}


	
	

	
	
	
	

}
