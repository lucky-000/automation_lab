package com.qaprosoft.carina.douTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pagesLab.HomePage;
import com.qaprosoft.carina.demo.gui.pagesLab.JobPage;
import com.qaprosoft.carina.demo.gui.pagesLab.components.HeaderMenu;

public class SearchJobTest extends AbstractTest {
    @Test(description = "JIRA#AUTO-0005")
	   @MethodOwner(owner = "amyrchyk")
    public void searchingJobs() {
 	   final String searchingText ="Java";
 	   HomePage homePage = new HomePage(getDriver()); 
	        homePage.open();
	        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
	        HeaderMenu headerMenu = homePage.getHeaderMenu();
	        JobPage jobPage = headerMenu.clickJobs();
	        Assert.assertTrue(jobPage.isPageOpened(), "Home page is not opened!");
	        jobPage.inputSearch(searchingText);
	        jobPage.clickButtonSearch();
	        Assert.assertEquals(jobPage.readSearchingField(),searchingText,"Invalid Searching");
 	   }
    
}
