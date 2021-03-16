package com.qaprosoft.carina.douTests;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pagesLab.HomePage;
import com.qaprosoft.carina.demo.gui.pagesLab.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.pagesLab.components.SearchingItem;

public class GlobalSearchTest extends AbstractTest {
	@Test(description = "JIRA#AUTO-0008")
    @MethodOwner(owner = "amyrchyk")
    public void  globalSearch() {
        HomePage homePage = new HomePage(getDriver());
        homePage.open();
        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
    
        final String searchingText="solvd";
        HeaderMenu headerMenu = homePage.getHeaderMenu();
        List<SearchingItem> result = headerMenu.searchTextField(searchingText);
        		
        Assert.assertFalse(CollectionUtils.isEmpty(result), "Result not found!");
        for(int i=0; i<result.size()-1;i++) {
//           	System.out.println(result.get(i).readTitle());
        	Assert.assertTrue(StringUtils.containsIgnoreCase(result.get(i).readTitle(), searchingText), "Invalid search results!");
        
        }
        
	}
	

}
