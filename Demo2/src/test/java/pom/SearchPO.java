package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.Basepage;

public class SearchPO extends Basepage{	
	public SearchPO(WebDriver driver) {
		super(driver);
	}	
	@FindBy(xpath="//a[text()='Login on Twitter']")
	private WebElement TwitterLink;
	
	public WebElement TwitterLink() {
		return TwitterLink;
	}
}

