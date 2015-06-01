package xpanxion.SDETexam.selenium.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.xpanxion.training.java.selenium.core.PageObject;

public class HomePageHeaders extends PageObject{

	@FindBy(id = "u136")
	private WebElement homeTab;
	
	@FindBy(id = "u116-4")
	private WebElement aboutTab;
	
	@FindBy(id = "u129-4")
	private WebElement approachTab;
	
	@FindBy(id = "u123-4")
	private WebElement servicesTab;
	
	@FindBy(id = "u15732")
	private WebElement careersTab;
	
	@FindBy(id = "u144-4")
	private WebElement contactTab;
	
	public HomePageHeaders(WebDriver driver) {
		super(driver);
	}
	
	public WebElement getHomeTab() {
		return homeTab;
	}

	public void setHomeTab(WebElement homeTab) {
		this.homeTab = homeTab;
	}

	public WebElement getAboutTab() {
		return aboutTab;
	}

	public void setAboutTab(WebElement aboutTab) {
		this.aboutTab = aboutTab;
	}

	public WebElement getApproachTab() {
		return approachTab;
	}

	public void setApproachTab(WebElement approachTab) {
		this.approachTab = approachTab;
	}

	public WebElement getServicesTab() {
		return servicesTab;
	}

	public void setServicesTab(WebElement servicesTab) {
		this.servicesTab = servicesTab;
	}

	public WebElement getCareersTab() {
		return careersTab;
	}

	public void setCareersTab(WebElement careersTab) {
		this.careersTab = careersTab;
	}

	public WebElement getContactTab() {
		return contactTab;
	}

	public void setContactTab(WebElement contactTab) {
		this.contactTab = contactTab;
	}
	
}
