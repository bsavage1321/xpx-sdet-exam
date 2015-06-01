package xpanxion.SDETexam.selenium.test;

import org.eclipse.jetty.util.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import xpanxion.SDETexam.selenium.objects.pages.AboutPage;
import xpanxion.SDETexam.selenium.objects.pages.ApproachPage;
import xpanxion.SDETexam.selenium.objects.pages.CareersPage;
import xpanxion.SDETexam.selenium.objects.pages.ContactPage;
import xpanxion.SDETexam.selenium.objects.pages.HomePage;
import xpanxion.SDETexam.selenium.objects.pages.ServicesPage;

import com.xpanxion.training.java.selenium.core.BaseTest;

public class homeHeaderTest extends BaseTest {
	
	public static final Logger LOG = LoggerFactory.getLogger(SampleTest.class);
	
	@Test
	public void testHomePageNav() {
		final HomePage homePage = new HomePage(this.driver, true);
		LOG.info("Verifying Home Page Loaded");
		Assert.assertEquals(homePage.getTaglineText().getText(), "THINK RURAL.\nLEVERAGE GLOBAL.");
		
	}
	
	@Test
	public void testAboutPageNav() {
		// Visit the about page
		final AboutPage aboutPage = new HomePage(this.driver, true).navToAboutPage();
		
		// Check the text to see if it is the expected text.
		LOG.info("Checking to see if tagline text is correct...");
		Assert.assertEquals(aboutPage.getHowWeGotStarted().getText(), "HOW WE GOT STARTED");
	
	}
	
	@Test
	public void testApproachPageNav() {
		final ApproachPage approachPage = new HomePage(this.driver, true).navToApproachPage();
		LOG.info("Verifying page has loaded.....");
		Assert.assertEquals(approachPage.getCrossSourcing().getText(), "CROSS SOURCING");
	}
	
	@Test
	public void testServicesPageNav() {
		final ServicesPage servicesPage = new HomePage(this.driver, true).navToServicesPage();
		LOG.info("Verifying Services Page has loaded...");
		Assert.assertEquals(servicesPage.getServicesTag().getText(), "SERVICES");
	}
	
	@Test
	public void testCareersPageNav() {
		final CareersPage careersPage = new HomePage(this.driver, true).navToCareerPage();
		LOG.info("Verifying Careers Page has loaded");
		Assert.assertEquals(careersPage.getChangingSoftware().getText(), "XPANXION IS CHANGING HOW SOFTWARE IS MADE.");
	}
	
	@Test
	public void testContactPageNav() {
		final ContactPage contactPage = new HomePage(this.driver, true).navToContactPage();
		LOG.info("Verifying Contact Page has loaded");
		Assert.assertEquals(contactPage.getMessageContact().getText(), "Message:");
	}
	
	
}
