package com.qaprosoft.carina.demo.gui.pagesLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;


public class SalariesPage extends AbstractPage{
	


	@FindBy(xpath="// select[@name='title']")
	private ExtendedWebElement position;
	@FindBy(xpath="//a[@href='https://jobs.dou.ua/salaries/dynamics/']")
	private ExtendedWebElement dunamicTab;
	@FindBy(xpath="// select[@name='city']")
	private ExtendedWebElement city;
		@FindBy(xpath="// select[@name='snapshot']")
	private ExtendedWebElement cityDynamic;
	
	@FindBy(xpath="//span[@class='num']")
	private ExtendedWebElement resultSalary;
	public SalariesPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://jobs.dou.ua/salaries/");
	
		// TODO Auto-generated constructor stub
	}
	

	public void clickDunamicTab() {
		dunamicTab.click();
	}
	
	public void chooseDumanicCity(String city) {
		cityDynamic.select(city);
	}
	
	public String getUrlPage(String urlCity) {
		String urlPage="https://jobs.dou.ua/salaries/dynamics/"+urlCity;
		return urlPage; 
	}
	
	public void chooseCity(String city) {
		this.city.select(city);
	}
	public void choosePosition(String position) {
		this.position.select(position);
	}
//	public String readResultSalary() {
//		return resultSalary.getText();
//	}
	public boolean stringToInt() {
		int resultSal = Integer.parseInt(resultSalary.getElement().getText());
		if (resultSal>0) {return true;}
		return false;
	}
}
