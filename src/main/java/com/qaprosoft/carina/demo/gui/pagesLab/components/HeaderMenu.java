package com.qaprosoft.carina.demo.gui.pagesLab.components;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;
import com.qaprosoft.carina.demo.gui.pagesLab.CalendarPage;
import com.qaprosoft.carina.demo.gui.pagesLab.JobPage;
import com.qaprosoft.carina.demo.gui.pagesLab.ProfilePage;
import com.qaprosoft.carina.demo.gui.pagesLab.SalariesPage;


public class HeaderMenu extends AbstractUIObject {
	
	private final  Keys keyToSearch = Keys.ENTER;
	@FindBy(xpath="//a[@href='https://jobs.dou.ua/salaries/']") 
	private ExtendedWebElement salaries;
	@FindBy(xpath="//a[@href='https://dou.ua/calendar/']")
	private ExtendedWebElement calendar;
	
	@FindBy(id="login-link")
	private ExtendedWebElement loginLink;
	@FindBy(xpath="min-profile")
	private ExtendedWebElement checkLogin;	
	@FindBy(xpath="//a[@href='https://dou.ua/forums/']")
	private ExtendedWebElement forum;
	@FindBy(id="txtGlobalSearch")
	private ExtendedWebElement searchTextField;
	@FindBy(id="txtGlobalSearch")
	private ExtendedWebElement searchPage;
	@FindBy(xpath="//a[@class='min-profile']")
	private ExtendedWebElement profileButton;
	@FindBy(xpath="//a[@href='https://jobs.dou.ua/']")
	private ExtendedWebElement jobs;

	
	
	
	@FindBy(xpath="//div[@class='gs-title']")
	private List<SearchingItem> resultSearching;

	public HeaderMenu(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
		// TODO Auto-generated constructor stub
	}
	public ExtendedWebElement searchText(String searchingText) {
		
		return searchTextField;
		
	}


	public void clickForum() {
		forum.click();
	}
	public SalariesPage clickSalary() {
		salaries.click();
		return new SalariesPage(driver);
	}
	public CalendarPage clickCalendar() {
		calendar.click();
		return new CalendarPage(getDriver());
	}
	public LoginForm openLoginLink() {
		loginLink.click();
		return new LoginForm(driver, rootElement);
	}
	public ProfilePage openProfile(String url) {
		profileButton.click();
		return new ProfilePage(driver,url);
	}
	public JobPage clickJobs() {
		jobs.click();
		return new JobPage(getDriver());
	}
	public void inputText(String searchingText) {
		searchTextField.type(searchingText);  
		searchTextField.sendKeys(keyToSearch);
	}
	public List<SearchingItem> searchTextField(String q){
		searchTextField.type(q);
		searchTextField.sendKeys(keyToSearch);
		return resultSearching;
	}

}
