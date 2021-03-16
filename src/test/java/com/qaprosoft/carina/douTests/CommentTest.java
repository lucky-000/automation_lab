package com.qaprosoft.carina.douTests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.AbstractTest;
import com.qaprosoft.carina.core.foundation.utils.ownership.MethodOwner;
import com.qaprosoft.carina.demo.gui.pagesLab.ArticlePage;
import com.qaprosoft.carina.demo.gui.pagesLab.ForumPage;
import com.qaprosoft.carina.demo.gui.pagesLab.HomePage;
import com.qaprosoft.carina.demo.gui.pagesLab.components.HeaderMenu;
import com.qaprosoft.carina.demo.gui.pagesLab.components.ItemForum;
import com.qaprosoft.carina.demo.gui.pagesLab.components.LoginForm;

public class CommentTest extends AbstractTest {
    @Test(description = "JIRA#AUTO-0003")
	   @MethodOwner(owner = "amyrchyk")
    public void addingComment() {
 	   final String username ="myrchykandriy@gmail.com";
 	   final String pass ="Password";
 	   final String comment ="...";
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
		    headerMenu.clickForum();
		    ForumPage forumPage =  new ForumPage(getDriver());
		    ItemForum forumItem = forumPage.getItemForum();
		    forumItem.clickCommentArticle();
		    ArticlePage articlePage = new ArticlePage(getDriver());
		    articlePage.clickFieldComment();
		    articlePage.inputComment(comment);
		    articlePage.clickButtonAddComment();
		    Assert.assertEquals(articlePage.readComment(),comment,"Comment Not Added");
		   
 	   }
}
