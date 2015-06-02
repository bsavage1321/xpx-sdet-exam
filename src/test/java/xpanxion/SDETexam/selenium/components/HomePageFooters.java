package xpanxion.SDETexam.selenium.components;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.xpanxion.training.java.selenium.core.PageObject;

public class HomePageFooters extends PageObject{


/*	
	public HomePageFooters(WebDriver driver, boolean openHomePage) {
		super(driver, openHomePage ? "https://www.xpanxion.com" : null);
	}
*/
	public HomePageFooters(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "u10570-4")
	private WebElement aboutFooter;
	
	@FindBy(id = "u10578-4")
	private WebElement ourStoryFooter;
	
	@FindBy(id = "u10577-4")
	private WebElement locationsFooter;
	
	@FindBy(id = "u10576-4")
	private WebElement missionFooter;
	
	@FindBy(id = "u10575-4")
	private WebElement newsFooter;
	
	@FindBy(id = "u10574-4")
	private WebElement approachFooter;
	
	@FindBy(id = "u10573-4")
	private WebElement crossSourcingFooter;
	
	@FindBy(id = "u10572-4")
	private WebElement bridgePointFooter;
	
	@FindBy(id = "u10586-4")
	private WebElement careersFooter;
	
	@FindBy(id = "u10585-4")
	private WebElement unitedStatesFooter;
	
	@FindBy(id = "u10584-4")
	private WebElement indiaFooter;
	
	@FindBy(id = "u10571-4")
	private WebElement servicesFooter;
	
	@FindBy(id = "u10583-4")
	private WebElement softwareDevFooter;
	
	@FindBy(id = "u10582-4")
	private WebElement qualityAssurFooter;
	
	@FindBy(id = "u10581-4")
	private WebElement businessIntFooter;
	
	@FindBy(id = "u10579-4")
	private WebElement softwareMgmtFooter;

	public WebElement getAboutFooter() {
		return aboutFooter;
	}

	public void setAboutFooter(WebElement aboutFooter) {
		this.aboutFooter = aboutFooter;
	}

	public WebElement getOurStoryFooter() {
		return ourStoryFooter;
	}

	public void setOurStoryFooter(WebElement ourStoryFooter) {
		this.ourStoryFooter = ourStoryFooter;
	}

	public WebElement getLocationsFooter() {
		return locationsFooter;
	}

	public void setLocationsFooter(WebElement locationsFooter) {
		this.locationsFooter = locationsFooter;
	}

	public WebElement getMissionFooter() {
		return missionFooter;
	}

	public void setMissionFooter(WebElement missionFooter) {
		this.missionFooter = missionFooter;
	}

	public WebElement getNewsFooter() {
		return newsFooter;
	}

	public void setNewsFooter(WebElement newsFooter) {
		this.newsFooter = newsFooter;
	}

	public WebElement getApproachFooter() {
		return approachFooter;
	}

	public void setApproachFooter(WebElement approachFooter) {
		this.approachFooter = approachFooter;
	}

	public WebElement getCrossSourcingFooter() {
		return crossSourcingFooter;
	}

	public void setCrossSourcingFooter(WebElement crossSourcingFooter) {
		this.crossSourcingFooter = crossSourcingFooter;
	}

	public WebElement getBridgePointFooter() {
		return bridgePointFooter;
	}

	public void setBridgePointFooter(WebElement bridgePointFooter) {
		this.bridgePointFooter = bridgePointFooter;
	}

	public WebElement getCareersFooter() {
		return careersFooter;
	}

	public void setCareersFooter(WebElement careersFooter) {
		this.careersFooter = careersFooter;
	}

	public WebElement getUnitedStatesFooter() {
		return unitedStatesFooter;
	}

	public void setUnitedStatesFooter(WebElement unitedStatesFooter) {
		this.unitedStatesFooter = unitedStatesFooter;
	}

	public WebElement getIndiaFooter() {
		return indiaFooter;
	}

	public void setIndiaFooter(WebElement indiaFooter) {
		this.indiaFooter = indiaFooter;
	}

	public WebElement getServicesFooter() {
		return servicesFooter;
	}

	public void setServicesFooter(WebElement servicesFooter) {
		this.servicesFooter = servicesFooter;
	}

	public WebElement getSoftwareDevFooter() {
		return softwareDevFooter;
	}

	public void setSoftwareDevFooter(WebElement softwareDevFooter) {
		this.softwareDevFooter = softwareDevFooter;
	}

	public WebElement getQualityAssurFooter() {
		return qualityAssurFooter;
	}

	public void setQualityAssurFooter(WebElement qualityAssurFooter) {
		this.qualityAssurFooter = qualityAssurFooter;
	}

	public WebElement getBusinessIntFooter() {
		return businessIntFooter;
	}

	public void setBusinessIntFooter(WebElement businessIntFooter) {
		this.businessIntFooter = businessIntFooter;
	}

	public WebElement getSoftwareMgmtFooter() {
		return softwareMgmtFooter;
	}

	public void setSoftwareMgmtFooter(WebElement softwareMgmtFooter) {
		this.softwareMgmtFooter = softwareMgmtFooter;
	}
	
}
