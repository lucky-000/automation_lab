package com.qaprosoft.carina.demo.gui.pagesLab.components;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.core.gui.AbstractUIObject;

public class LoginForm extends AbstractUIObject  {
	
	
	
	@FindBy(id="_loginByMail")
	private ExtendedWebElement loginByEmail;
	
	@FindBy(xpath="//input[@name='username'][1]")
	private ExtendedWebElement username;
	
	@FindBy(xpath="//input[@type='password']")
	private ExtendedWebElement password;
	
	@FindBy(xpath="//button[@class='big-button btnSubmit'][contains(text(),'Войти')]")
	private ExtendedWebElement buttonLogin;
	
	public LoginForm(WebDriver driver, SearchContext searchContext) {
		super(driver, searchContext);
		// TODO Auto-generated constructor stub
	}
	
	public void clickLinkByEmail() {
		loginByEmail.click();
	}
	
	public void inputLogin(String login) {
		username.type(login);
		
	}
	public void inputPassword(String pass) {
		password.type(pass);
		
	}
	public void clickButtonLogin() {
		buttonLogin.click();
	}
	public String readMessage() {
		assertElementPresent(buttonLogin);
		return buttonLogin.getAttribute("");
	}
	public String readFieldUsername() {
		assertElementPresent(username);
		return username.getAttribute("name");
	}
	public String readFieldPassword() {
		assertElementPresent(password);
		return password.getAttribute("name");
	}
	
}
