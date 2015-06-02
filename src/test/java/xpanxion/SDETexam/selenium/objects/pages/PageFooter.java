package xpanxion.SDETexam.selenium.objects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import xpanxion.SDETexam.selenium.template.MainPageTemplate;

public class PageFooter extends MainPageTemplate{

	public PageFooter(WebDriver driver) {
		super(driver);
		
	}

	public PageFooter(WebDriver driver, boolean openHomePage) {
		super(driver, openHomePage ? "https://www.xpanxion.com" : null);
	}
	
	
}
