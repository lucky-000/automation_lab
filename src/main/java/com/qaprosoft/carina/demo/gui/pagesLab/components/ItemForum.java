package com.qaprosoft.carina.demo.gui.pagesLab.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class ItemForum extends AbstractUIObject{

	@FindBy(xpath="//a[@class='g-comments-round __lazy'][1]")
	private ExtendedWebElement commentArticle;
	public ItemForum(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
		// TODO Auto-generated constructor stub
	}
	public void clickCommentArticle() {
		commentArticle.click();
	}
}
