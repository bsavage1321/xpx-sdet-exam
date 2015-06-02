package xpanxion.SDETexam.selenium.objects.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import xpanxion.SDETexam.selenium.template.MainPageTemplate;

public class ApproachPage extends MainPageTemplate {

	
	@FindBy(id = "u18285-4")
	private WebElement crossSourcing;
	
	public ApproachPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public WebElement getCrossSourcing() {
		return crossSourcing;
	}

	public void setCrossSourcing(WebElement crossSourcing) {
		this.crossSourcing = crossSourcing;
	}
	

}
