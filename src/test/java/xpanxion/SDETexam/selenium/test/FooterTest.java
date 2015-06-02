package xpanxion.SDETexam.selenium.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;







import xpanxion.SDETexam.selenium.components.HomePageFooters;
import xpanxion.SDETexam.selenium.objects.pages.AboutPage;
//import xpanxion.SDETexam.selenium.components.PageFooter;
import xpanxion.SDETexam.selenium.objects.pages.HomePage;



import xpanxion.SDETexam.selenium.objects.pages.PageFooter;

import com.xpanxion.training.java.selenium.core.BaseTest;

public class FooterTest extends BaseTest{

	public static final Logger LOG = LoggerFactory.getLogger(SampleTest.class);
	/*
	@Test
	public void testHomePageNav() {
		final HomePage homePage = new HomePage(this.driver, true);
		System.out.println("Verifying Home Page Loaded");
		Assert.assertEquals(homePage.getTaglineText().getText(), "THINK RURAL.\nLEVERAGE GLOBAL.");
		
		
	}
	*/
	@Test
	public void testAboutPageNavFooter() {
		final PageFooter aboutPageViaFooter = new PageFooter(this.driver, true).navToAboutPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/about.html");
	}
	
	@Test
	public void testOurStoryNavFooter() {
		final PageFooter ourStoryViaFooter = new PageFooter(this.driver, true).navToOurStoryPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(),"http://xpanxion.com/about.html");
	}
	
	@Test
	public void testLocationsNavFooter() {
		final PageFooter locationPageViaFooter = new PageFooter(this.driver, true).navToLocationsPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/locations.html");
	}
	
	@Test
	public void testMissionNavFooter() {
		final PageFooter missionPageViaFooter = new PageFooter(this.driver, true).navToMissionPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/mission.html");
	}
	
	@Test
	public void testNewsNavFooter() {
		final PageFooter newsPageViaFooter = new PageFooter(this.driver, true).navToNewsPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/news.html");
	}
	
	@Test
	public void testApproachNavFooter() {
		final PageFooter ApproachPageViaFooter = new PageFooter(this.driver, true).navToApproachPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/approach.html");
	}
	
	@Test
	public void testCrossSourcingNavFooter() {
		final PageFooter crossSourcingPageViaFooter = new PageFooter(this.driver, true).navToCrossSourcingPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/cross-sourcing.html");
	}
	
	@Test
	public void testBridgepointNavFooter() {
		final PageFooter bridgepointPageViaFooter = new PageFooter(this.driver, true).navToBridgePointPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/bridgepoint.html");
	}
	
	@Test
	public void testCareersNavFooter() {
		final PageFooter careersPageViaFooter = new PageFooter(this.driver, true).navToCareersPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/careers.html");
	}
	
	@Test
	public void testUnitedStatesNavFooter() {
		final PageFooter unitedStatesPageViaFooter = new PageFooter(this.driver, true).navToUnitedStatesPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/us.html");
	}
	
	@Test
	public void testIndiaNavFooter() {
		final PageFooter indiaPageViaFooter = new PageFooter(this.driver, true).navToIndiaPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/india.html");
	}
	
	@Test
	public void testServicesNavFooter() {
		final PageFooter servicesPageViaFooter = new PageFooter(this.driver, true).navToServicesPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/services.html");
	}
	
	@Test
	public void testSoftwareDevNavFooter() {
		final PageFooter softwareDevPageViaFooter = new PageFooter(this.driver, true).navToSoftwareDevViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/software-development.html");
	}
	
	@Test
	public void testQualityAssurNavFooter() {
		final PageFooter qualityAssurPageViaFooter = new PageFooter(this.driver, true).navToQualityAssurPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/quality-assurance.html");
	}
	
	@Test
	public void testBusnessIntNavFooter() {
		final PageFooter businessIntPageViaFooter = new PageFooter(this.driver, true).navToBusinessIntelPageViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/business-intelligence.html");
	}
	
	public void testSoftwareMgmtNavFooter() {
		final PageFooter softwareMgmtPageViaFooter = new PageFooter(this.driver, true).navToSoftwareMgmtViaFooters();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/management-services.html");
	}
	
	
	/*
	@Test
	public void testFootersNavigation() {
		final PageFooter aboutPageFooter = new PageFooter(this.driver, true).navToAboutPageViaFooters();
		aboutPageFooter.navToAboutPage();
		Assert.assertEquals(driver.getCurrentUrl(), "http://xpanxion.com/about.html");
	}*/
}
