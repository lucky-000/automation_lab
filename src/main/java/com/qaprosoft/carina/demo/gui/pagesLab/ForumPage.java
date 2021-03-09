package com.qaprosoft.carina.demo.gui.pagesLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.gui.AbstractPage;
import com.qaprosoft.carina.demo.gui.pagesLab.components.ItemForum;

public class ForumPage extends AbstractPage {
	@FindBy(xpath="//div[@class='l-content']")
	private ItemForum contentForum;
	public ForumPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public ItemForum getItemForum() {
		return contentForum;
	}
}
