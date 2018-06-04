package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import library.Basepage;
import pom.GooglePO;
import pom.SearchPO;

public class Test1 extends BaseTest{	
	@Test
	public void testtwitterHome() {
		try {
			driver.get("https://www.google.com/");
			GooglePO googlePO=new GooglePO(driver);
			googlePO.searchTxtBx().sendKeys("Twitter"+Keys.ENTER);
			SearchPO searchPO=new SearchPO(driver);
			searchPO.verifyElement(searchPO.TwitterLink());
			searchPO.TwitterLink().click();
			String eTitle = "Login on Twitter";
			wait.until(ExpectedConditions.titleContains(eTitle));
			String aTitle =driver.getTitle();
			Reporter.log("Title displayed is"+aTitle, true);
			Assert.assertEquals(aTitle, eTitle);
		} catch (Exception e) {
			Assert.fail();
		}
	}

}

