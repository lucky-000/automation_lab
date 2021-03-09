package com.qaprosoft.carina.demo.gui.pagesLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class JobPage extends AbstractPage {
	@FindBy(xpath="// input[@class='job']")
	private ExtendedWebElement jobSearchField;
	@FindBy(xpath="// input[@class='btn-search']")
	private ExtendedWebElement jobSearchButton;
	
	public JobPage(WebDriver driver) {
		super(driver);
		setPageAbsoluteURL("https://jobs.dou.ua/");
		// TODO Auto-generated constructor stub
	}
	public void inputSearch(String searchingText) {
		jobSearchField.type(searchingText);
	}
	public void clickButtonSearch() {
		jobSearchButton.click();
	}
	public String readSearchingField() {
		assertElementPresent(jobSearchField);
		return jobSearchField.getAttribute("value");
		
	}

}
