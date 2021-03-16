package com.qaprosoft.carina.douTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pagesLab.CalendarPage;
import com.qaprosoft.carina.demo.gui.pagesLab.HomePage;
import com.qaprosoft.carina.demo.gui.pagesLab.components.HeaderMenu;

public class CalendarTest extends AbstractTest {
    @Test(description = "JIRA#AUTO-0007")
	   @MethodOwner(owner = "amyrchyk")
    
    public void openingCalendarPage() {
 	   HomePage homePage = new HomePage(getDriver()); 
	        homePage.open();
	        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
	    HeaderMenu headerMenu = homePage.getHeaderMenu();
	    
	    Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
		 CalendarPage calendar = homePage.getHeaderMenu().clickCalendar();
		 Assert.assertTrue(calendar.isPageOpened(), "Home page is not opened!");
 	   }
}
