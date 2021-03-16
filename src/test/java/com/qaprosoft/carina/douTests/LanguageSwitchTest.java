package com.qaprosoft.carina.douTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pagesLab.HomePage;

public class LanguageSwitchTest extends AbstractTest{
	@Test(description = "JIRA#AUTO-00010")
	@MethodOwner(owner = "amyrchyk")
    public void changeLanguage() {
 	   HomePage homePage = new HomePage(getDriver()); 
	        homePage.open();
	        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
	        homePage.clickLanguage("English");
	        Assert.assertEquals(homePage.readLanguage(),"English", "Language not changed");
 	   }
}
