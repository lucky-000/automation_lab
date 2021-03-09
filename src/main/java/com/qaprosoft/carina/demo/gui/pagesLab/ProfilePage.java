package com.qaprosoft.carina.demo.gui.pagesLab;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public class ProfilePage extends AbstractPage {

	public ProfilePage(WebDriver driver, String urlUser) {
		super(driver);
		setPageURL("/users/"+urlUser);
		// TODO Auto-generated constructor stub
	}

}
