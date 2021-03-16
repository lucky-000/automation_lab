package com.qaprosoft.carina.douTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pagesLab.HomePage;
import com.qaprosoft.carina.demo.gui.pagesLab.ProfilePage;
import com.qaprosoft.carina.demo.gui.pagesLab.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.pagesLab.components.LoginForm;

public class ProfileTest extends AbstractTest  {
    @Test(description = "JIRA#AUTO-0009")
	   @MethodOwner(owner = "amyrchyk")
    public void profileUser() {
 	   final String username ="myrchykandriy@gmail.com";
 	   final String pass ="Password";
 	   HomePage homePage = new HomePage(getDriver()); 
	        homePage.open();
	        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
	        HeaderMenu headerMenu = homePage.getHeaderMenu();
	        LoginForm loginForm = headerMenu.openLoginLink();
	        loginForm.clickLinkByEmail();
	        loginForm.inputLogin(username);
	        Assert.assertEquals(loginForm.readFieldUsername(),"username","Invalid fieldEmail info!");
	        loginForm.inputPassword(pass);
	        Assert.assertEquals(loginForm.readFieldPassword(),"password","Invalid fieldPass info!");
		    loginForm.clickButtonLogin();
		    final String userURL ="andrij-mirchik/";
		    ProfilePage profile = headerMenu.openProfile(userURL);
		    Assert.assertTrue(profile.isPageOpened(), "Home page is not opened!");
			
 	   }
}
