package com.qaprosoft.carina.demo.gui.pagesLab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractPage;

public class ArticlePage extends AbstractPage {

	@FindBy(xpath="//*[@id=\"inlineForm\"]//textarea")
	private ExtendedWebElement commentArticle;

	@FindBy(xpath="//input[@class='form-button']")
	private ExtendedWebElement buttonAdd;
	@FindBy(xpath="//div[@class='comment_text b-typo']/p")

	private ExtendedWebElement commentAdded;
	public ArticlePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void clickFieldComment() {
		commentArticle.click();
	}
	public void inputComment(String comment) {

		commentArticle.type(comment);
	}
	public void clickButtonAddComment() {
		buttonAdd.click();
	}
	public String readComment() {
		assertElementPresent(commentAdded);
		return commentAdded.getText();
	}
}
