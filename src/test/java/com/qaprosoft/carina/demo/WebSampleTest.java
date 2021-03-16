/*
 * Copyright 2013-2021 QAPROSOFT (http://qaprosoft.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.qaprosoft.carina.demo;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.springframework.test.context.event.annotation.BeforeTestMethod;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pagesLab.ArticlePage;
import com.qaprosoft.carina.demo.gui.pagesLab.CalendarPage;
import com.qaprosoft.carina.demo.gui.pagesLab.ForumPage;
import com.qaprosoft.carina.demo.gui.pagesLab.HomePage;
import com.qaprosoft.carina.demo.gui.pagesLab.JobPage;
import com.qaprosoft.carina.demo.gui.pagesLab.ProfilePage;
import com.qaprosoft.carina.demo.gui.pagesLab.SalariesPage;

import com.qaprosoft.carina.demo.gui.pagesLab.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.pagesLab.components.ItemForum;
import com.qaprosoft.carina.demo.gui.pagesLab.components.LoginForm;

import com.qaprosoft.carina.demo.gui.pagesLab.components.SearchingItem;

/**
 * This sample shows how create Web test.
 * 
 * @author amyrchyk
 */
public class WebSampleTest extends AbstractTest {
//	    @Test(description = "JIRA#AUTO-0008")
//	    @MethodOwner(owner = "amyrchyk")
//	    public void  globalSearch() {
//	        HomePage homePage = new HomePage(getDriver());
//	        homePage.open();
//	        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
//	    
//	        final String searchingText="solvd";
//	        HeaderMenu headerMenu = homePage.getHeaderMenu();
////	       	headerMenu.inputText(searchingText);
//	        List<SearchingItem> result = headerMenu.searchTextField(searchingText);
//	        		
//	        Assert.assertFalse(CollectionUtils.isEmpty(result), "Result not found!");
//	        for(int i=0; i<result.size()-1;i++) {
//	           	System.out.println(result.get(i).readTitle());
//	        	Assert.assertTrue(StringUtils.containsIgnoreCase(result.get(i).readTitle(), searchingText), "Invalid search results!");
//	        
//	        }	           
//
//    }
//	       @Test(description = "JIRA#AUTO-0004")
//		   @MethodOwner(owner = "amyrchyk")
//	       
//	       public void salaries() {
//	    	   HomePage homePage = new HomePage(getDriver()); 
//		        homePage.open();
//		        final String city ="вся Украина";
//		        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
//		        HeaderMenu headerMenu = homePage.getHeaderMenu();
//		        SalariesPage salariesPage = headerMenu.clickSalary();
//		        Assert.assertTrue(salariesPage.isPageOpened(), "Home page is not opened!");
//		        salariesPage.clickAllCity();
//		        salariesPage.clickPositionBusiness();
//		//what to apply for verification??
//			
//	    	   }
	    //+   
//	       @Test(description = "JIRA#AUTO-0001")
//		   @MethodOwner(owner = "amyrchyk")
//	       public void autorizetion() {
//	    	   final String username ="myrchykandriy@gmail.com";
//	    	   final String pass ="Password";
//	    	   HomePage homePage = new HomePage(getDriver()); 
//		        homePage.open();
//		        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
//		        HeaderMenu headerMenu = homePage.getHeaderMenu();
//		        LoginForm loginForm = headerMenu.openLoginLink();
//		        loginForm.clickLinkByEmail();
//		        loginForm.inputLogin(username);
//		        Assert.assertEquals(loginForm.readFieldUsername(),"username","Invalid fieldEmail info!");
//		        loginForm.inputPassword(pass);
//		        Assert.assertEquals(loginForm.readFieldPassword(),"password","Invalid fieldPass info!");
//			    loginForm.clickButtonLogin();  
//	    	   }
	       
//	       @Test(description = "JIRA#AUTO-0003")
//		   @MethodOwner(owner = "amyrchyk")
//	       public void addingComment() {
//	    	   final String username ="myrchykandriy@gmail.com";
//	    	   final String pass ="Password";
//	    	   final String comment ="...";
//	    	   HomePage homePage = new HomePage(getDriver()); 
//		        homePage.open();
//		        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
//		        HeaderMenu headerMenu = homePage.getHeaderMenu();
//		        LoginForm loginForm = headerMenu.openLoginLink();
//		        loginForm.clickLinkByEmail();
//		        loginForm.inputLogin(username);
//		        Assert.assertEquals(loginForm.readFieldUsername(),"username","Invalid fieldEmail info!");
//		        loginForm.inputPassword(pass);
//		        Assert.assertEquals(loginForm.readFieldPassword(),"password","Invalid fieldPass info!");
//			    loginForm.clickButtonLogin(); 	   
//			    headerMenu.clickForum();
//			    ForumPage forumPage =  new ForumPage(getDriver());
//			    ItemForum forumItem = forumPage.getItemForum();
//			    forumItem.clickCommentArticle();
//			    ArticlePage articlePage = new ArticlePage(getDriver());
//			    articlePage.clickFieldComment();
//			    articlePage.inputComment(comment);
//			    articlePage.clickButtonAddComment();
//			    Assert.assertEquals(articlePage.readComment(),comment,"Comment Added");
//				   
//			  
//			   
//	    	   }
//	       @Test(description = "JIRA#AUTO-00010")
//		   @MethodOwner(owner = "amyrchyk")
//	       
//	       public void changeLanguage() {
//	    	   HomePage homePage = new HomePage(getDriver()); 
//		        homePage.open();
//		        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
//		        homePage.clickEnglishLanguage();
//		        Assert.assertEquals(homePage.readLanguage(),"English", "English page!");
//	    	   }
	       
//	       @Test(description = "JIRA#AUTO-0007")
//		   @MethodOwner(owner = "amyrchyk")
//	       
//	       public void calendar() {
//	    	   HomePage homePage = new HomePage(getDriver()); 
//		        homePage.open();
//		        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
//		    HeaderMenu headerMenu = homePage.getHeaderMenu();
//		    
//		    Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
//			 CalendarPage calendar = homePage.getHeaderMenu().clickCalendar();
//			 Assert.assertTrue(calendar.isPageOpened(), "Home page is not opened!");
//	    	   }
//	       @Test(description = "JIRA#AUTO-0009")
//		   @MethodOwner(owner = "amyrchyk")
//	       public void profileUser() {
//	    	   final String username ="myrchykandriy@gmail.com";
//	    	   final String pass ="Password";
//	    	   HomePage homePage = new HomePage(getDriver()); 
//		        homePage.open();
//		        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
//		        HeaderMenu headerMenu = homePage.getHeaderMenu();
//		        LoginForm loginForm = headerMenu.openLoginLink();
//		        loginForm.clickLinkByEmail();
//		        loginForm.inputLogin(username);
//		        Assert.assertEquals(loginForm.readFieldUsername(),"username","Invalid fieldEmail info!");
//		        loginForm.inputPassword(pass);
//		        Assert.assertEquals(loginForm.readFieldPassword(),"password","Invalid fieldPass info!");
//			    loginForm.clickButtonLogin();
//			    final String userURL ="andrij-mirchik/";
//			    ProfilePage profile = headerMenu.openProfile(userURL);
//			    Assert.assertTrue(profile.isPageOpened(), "Home page is not opened!");
//				
//	    	   }
//	       @Test(description = "JIRA#AUTO-0005")
//		   @MethodOwner(owner = "amyrchyk")
//	       public void searchingJobs() {
//	    	   final String searchingText ="Java";
//	    	   HomePage homePage = new HomePage(getDriver()); 
//		        homePage.open();
//		        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
//		        HeaderMenu headerMenu = homePage.getHeaderMenu();
//		        JobPage jobPage = headerMenu.clickJobs();
//		        Assert.assertTrue(jobPage.isPageOpened(), "Home page is not opened!");
//		        jobPage.inputSearch(searchingText);
//		        jobPage.clickButtonSearch();
//		        Assert.assertEquals(jobPage.readSearchingField(),searchingText,"Invalid Searching");
//	    	   }
//	       
//	       @Test(description = "JIRA#AUTO-0008")
//		   @MethodOwner(owner = "amyrchyk")
//	       public void dunamicsSalarie() {
//	    	   final String urlCity ="Kyiv/";
//	    	   HomePage homePage = new HomePage(getDriver()); 
//		        homePage.open();
//		        Assert.assertTrue(homePage.isPageOpened(), "Home page is not opened!");
//		        HeaderMenu headerMenu = homePage.getHeaderMenu();
//		        SalariesPage salaryPage = headerMenu.clickSalary();
//		        Assert.assertTrue(salaryPage.isPageOpened(), "Home page is not opened!");
//		        salaryPage.clickDunamicTab();
//		        salaryPage.clickDumanicCity();
//		       
//		          
//	    	   }
	       

}
