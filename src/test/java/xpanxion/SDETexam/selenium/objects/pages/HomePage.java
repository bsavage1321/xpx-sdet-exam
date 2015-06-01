package xpanxion.SDETexam.selenium.objects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import xpanxion.SDETexam.selenium.template.MainPageTemplate;

public class HomePage extends MainPageTemplate {
	
	@FindBy(id = "u3097-6")
	private WebElement taglineText;
	
	//@FindBy(id = "u136")
	//private WebElement homeHeaderText;
	/*
	public WebElement getHomeHeaderText() {
		return homeHeaderText;
	}

	public void setHomeHeaderText(WebElement homeHeaderText) {
		this.homeHeaderText = homeHeaderText;
	}
	*/
	public WebElement getTaglineText() {
		return taglineText;
	}

	public void setTaglineText(WebElement taglineText) {
		this.taglineText = taglineText;
	}

	public HomePage(WebDriver driver) {
		super(driver);
		
	}
	
	public HomePage(WebDriver driver, boolean openHomePage) {
		super(driver, openHomePage ? "https://www.xpanxion.com" : null);
	}
	

	

	

}
