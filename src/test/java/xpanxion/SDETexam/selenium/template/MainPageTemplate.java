package xpanxion.SDETexam.selenium.template;


import org.openqa.selenium.WebDriver;

import xpanxion.SDETexam.selenium.components.HomePageFooters;
import xpanxion.SDETexam.selenium.components.HomePageHeaders;
import xpanxion.SDETexam.selenium.objects.pages.AboutPage;
import xpanxion.SDETexam.selenium.objects.pages.ApproachPage;
import xpanxion.SDETexam.selenium.objects.pages.CareersPage;
import xpanxion.SDETexam.selenium.objects.pages.ContactPage;
import xpanxion.SDETexam.selenium.objects.pages.HomePage;
import xpanxion.SDETexam.selenium.objects.pages.PageFooter;
import xpanxion.SDETexam.selenium.objects.pages.ServicesPage;

import com.xpanxion.training.java.selenium.core.PageObject;
import com.xpanxion.training.java.selenium.core.utils.WaitUtils;

public class MainPageTemplate extends PageObject {
	
	private HomePageHeaders homePageHeaders;
	private HomePageFooters homePageFooters;
	
	public MainPageTemplate(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public MainPageTemplate(WebDriver driver, String url) {
		super(driver, url);

		this.setHomePageHeaders(new HomePageHeaders(driver));
		this.setHomePageFooters(new HomePageFooters(driver));
	}

	public HomePageHeaders getHomePageHeaders() {
		return homePageHeaders;
	}

	public void setHomePageHeaders(HomePageHeaders homePageHeaders) {
		this.homePageHeaders = homePageHeaders;
	}
	
	public HomePageFooters getHomePageFooters() {
		return homePageFooters;
	}

	public void setHomePageFooters(HomePageFooters homePageFooters) {
		this.homePageFooters = homePageFooters;
	}
	

	public AboutPage navToAboutPage() {
		this.homePageHeaders.getAboutTab().click();
		WaitUtils.waitUntilElementIsVisible(this.driver, this.homePageHeaders.getHomeTab());
		return new AboutPage(this.driver);
	}
	
	public ApproachPage navToApproachPage() {
		this.homePageHeaders.getApproachTab().click();
		WaitUtils.waitUntilElementIsVisible(this.driver, this.homePageHeaders.getApproachTab());
		return new ApproachPage(this.driver);
	}
	
	public ServicesPage navToServicesPage() {
		this.homePageHeaders.getServicesTab().click();
		WaitUtils.waitUntilElementIsVisible(this.driver, this.homePageHeaders.getServicesTab());
		return new ServicesPage(this.driver);
	}
	
	public CareersPage navToCareerPage() {
		this.homePageHeaders.getCareersTab().click();
		WaitUtils.waitUntilElementIsVisible(this.driver, this.homePageHeaders.getCareersTab());
		return new CareersPage(this.driver);
	}
	
	public ContactPage navToContactPage() {
		this.homePageHeaders.getContactTab().click();
		WaitUtils.waitUntilElementIsVisible(this.driver, this.homePageHeaders.getContactTab());
		return new ContactPage(this.driver);
	}

	
	public PageFooter navToAboutPageViaFooters() {
		this.homePageFooters.getAboutFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getAboutFooter());
		return new PageFooter(this.driver);
	}

	public PageFooter navToOurStoryPageViaFooters() {
		this.homePageFooters.getOurStoryFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getOurStoryFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToLocationsPageViaFooters() {
		this.homePageFooters.getLocationsFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getLocationsFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToMissionPageViaFooters() {
		this.homePageFooters.getMissionFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getMissionFooter());
		return new PageFooter(this.driver);
	}
	public PageFooter navToNewsPageViaFooters() {
		this.homePageFooters.getNewsFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getNewsFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToApproachPageViaFooters() {
		this.homePageFooters.getApproachFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getApproachFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToCrossSourcingPageViaFooters() {
		this.homePageFooters.getCrossSourcingFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getCrossSourcingFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToBridgePointPageViaFooters() {
		this.homePageFooters.getBridgePointFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getBridgePointFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToCareersPageViaFooters() {
		this.homePageFooters.getCareersFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getCareersFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToUnitedStatesPageViaFooters() {
		this.homePageFooters.getUnitedStatesFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getUnitedStatesFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToIndiaPageViaFooters() {
		this.homePageFooters.getIndiaFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getIndiaFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToServicesPageViaFooters() {
		this.homePageFooters.getServicesFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getServicesFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToSoftwareDevViaFooters() {
		this.homePageFooters.getSoftwareDevFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getSoftwareDevFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToQualityAssurPageViaFooters() {
		this.homePageFooters.getQualityAssurFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getQualityAssurFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToBusinessIntelPageViaFooters() {
		this.homePageFooters.getBusinessIntFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getBusinessIntFooter());
		return new PageFooter(this.driver);
	}
	
	public PageFooter navToSoftwareMgmtViaFooters() {
		this.homePageFooters.getSoftwareMgmtFooter().click();
		WaitUtils.waitUntilElementIsVisible(this.driver,  this.homePageFooters.getSoftwareMgmtFooter());
		return new PageFooter(this.driver);
	}
}
