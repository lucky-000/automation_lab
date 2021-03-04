package com.qaprosoft.carina.demo.gui.pagesLab.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class SearchingItem extends AbstractUIObject{

	@FindBy(xpath="./a")
	public ExtendedWebElement titleLink;
	
	public SearchingItem(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
		// TODO Auto-generated constructor stub
	}
	public String readTitle() {
		return titleLink.getElement().getText();
		
	}
	
}
