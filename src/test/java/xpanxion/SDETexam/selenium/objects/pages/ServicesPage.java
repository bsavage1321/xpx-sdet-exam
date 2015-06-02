package xpanxion.SDETexam.selenium.objects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import xpanxion.SDETexam.selenium.template.MainPageTemplate;

public class ServicesPage extends MainPageTemplate {

	@FindBy(id = "u3151-4")
	private WebElement servicesTag;
	
	public ServicesPage(WebDriver driver) {
		super(driver);
		
	}

	public WebElement getServicesTag() {
		return servicesTag;
	}

	public void setServicesTag(WebElement servicesTag) {
		this.servicesTag = servicesTag;
	}
	

}
