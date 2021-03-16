package com.qaprosoft.carina.douTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pagesLab.HomePage;
import com.qaprosoft.carina.demo.gui.pagesLab.SalariesPage;
import com.qaprosoft.carina.demo.gui.pagesLab.components.HeaderMenu;

public class SalariesTests extends AbstractTest {
    @Test(description = "JIRA#AUTO-0004")
	   @MethodOwner(owner = "amyrchyk")
    
    public void chooseSalaries() {
 	   HomePage homePage = new HomePage(getDriver()); 
	        homePage.open();
	        final String city ="вся Украина";
	        final String position="Business analyst";
	        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
	        HeaderMenu headerMenu = homePage.getHeaderMenu();
	        SalariesPage salariesPage = headerMenu.clickSalary();
	        Assert.assertTrue(salariesPage.isPageOpened(), "Home page is not opened!");
	        salariesPage.chooseCity(city);
	        salariesPage.choosePosition(position);
	        Assert.assertTrue(salariesPage.stringToInt(), "Result incorect");
		       	
    }
    
    @Test(description = "JIRA#AUTO-0008")
	   @MethodOwner(owner = "amyrchyk")
    public void searchingDynamicSalariesInCity() {
 	  final String urlCity ="Kyiv/";
 	  final String city ="Киев";
 	   HomePage homePage = new HomePage(getDriver()); 
	        homePage.open();
	        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
	        HeaderMenu headerMenu = homePage.getHeaderMenu();
	        SalariesPage salaryPage = headerMenu.clickSalary();
	        Assert.assertTrue(salaryPage.isPageOpened(), "Home page is not opened!");
	        salaryPage.clickDunamicTab();
	        salaryPage.chooseDumanicCity(city);
	        Assert.assertEquals(salaryPage.getUrlPage(urlCity),getDriver().getCurrentUrl(),"");
	        
        
	       
   
 	   }
}
