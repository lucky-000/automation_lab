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
import com.qaprosoft.carina.demo.gui.pagesLab.components.SearchingItem;



public class HomePage extends AbstractPage{

	private final  Keys keyToSearch = Keys.ENTER;
	@FindBy(id="txtGlobalSearch")
	private ExtendedWebElement searchTextField;
	
	@FindBy(xpath="//div[@class='gs-title']")
	private List<SearchingItem> resultSearching;
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public ExtendedWebElement searchText(String searchingText) {
		
		return searchTextField;
		
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
