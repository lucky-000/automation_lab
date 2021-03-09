package com.qaprosoft.carina.demo.gui.pagesLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;


public class SalariesPage extends AbstractPage{
	

	@FindBy(xpath="// select[@name='city']/option[@value='all']")
	private ExtendedWebElement city;
	@FindBy(xpath="//*[contains(text(),'Business analyst')]")
	private ExtendedWebElement position;
	@FindBy(xpath="//a[@href='https://jobs.dou.ua/salaries/dynamics/']")
	private ExtendedWebElement dunamicTab;
//	@FindBy(xpath="// select[@name='city']")
//	private ExtendedWebElement city1;
		@FindBy(xpath="//option[contains(text(),'ส่ๅโ')]")
	private ExtendedWebElement cityDynamic;
	
	public SalariesPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://jobs.dou.ua/salaries/");
	
		// TODO Auto-generated constructor stub
	}

	public void clickAllCity() {
		city.click();
	}
	public void clickPositionBusiness() {
		position.click();
	}

	public void clickDunamicTab() {
		dunamicTab.click();
	}
	
	public void clickDumanicCity() {
		city.click();
	}
	public void getUrlPage(String urlCity) {
		setPageAbsoluteURL("https://jobs.dou.ua/salaries/"+urlCity);
	}
	
	
}
