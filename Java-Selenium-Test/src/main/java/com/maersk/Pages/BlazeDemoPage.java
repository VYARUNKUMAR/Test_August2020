package com.maersk.Pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BlazeDemoPage {
	
	WebDriver driver;
	WebDriverWait wait;
	static Logger log = Logger.getLogger(BlazeDemoPage.class);
	
	@FindBy(how = How.XPATH, using = "//h1[text() = 'Welcome to the Simple Travel Agency!']")
	private WebElement blazeDemoLogin;
	
	@FindBy(how = How.XPATH, using = "//select[@name = 'fromPort']")
	private WebElement departureCityDropdown;
	
	@FindBy(how = How.XPATH, using = "//select[@name = 'toPort']")
	private WebElement destinationCityDropdown;
	
	@FindBy(how = How.XPATH, using = "//input[@value = 'Find Flights']")
	private WebElement findFlightsBtn;
	
	@FindBy(how = How.XPATH, using = "//input[@value = '43']/preceding::input")
	private WebElement chooseThisFlightsBtn;
	
	@FindBy(how = How.XPATH, using = "//input[@value = 'Purchase Flight']")
	private WebElement purchaseFlightBtn;
	
	@FindBy(how = How.XPATH, using = "(//tr/td)[2]")
	private WebElement confirmationID;
	
	/*
	 * @return the loginPage
	 */
	public WebElement getBlazeDemoLogin(){
		return blazeDemoLogin;
	}
	
	/*
	 * @return the DepartureCityDropdown
	 */
	public WebElement getDepartureCityDropdown(){
		return departureCityDropdown;
	}
	
	/*
	 * @return the DestinationCityDropdown
	 */
	public WebElement getDestinationCityDropdown(){
		return destinationCityDropdown;
	}
	
	/*
	 * @return the Find Flights button
	 */
	public WebElement getFindFlightsBtn(){
		return findFlightsBtn;
	}
	
	/*
	 * @return the Choose Flights button
	 */
	public WebElement getChooseThisFlightsBtn(){
		return chooseThisFlightsBtn;
	}
	
	/*
	 * @return the Purchase Flight button
	 */
	public WebElement getPurchaseFlightBtn(){
		return purchaseFlightBtn;
	}
	
	/*
	 * @return the Confirmtion ID
	 */
	public WebElement getConfirmationID(){
		return confirmationID;
	}
	
	public BlazeDemoPage(WebDriver webDriver){
		this.driver = webDriver;
		wait = new WebDriverWait(driver, 180);
		PageFactory.initElements(driver, this);
	}
	
	/*
	 * To verify user navigated to website
	 */
	public void verifyUserNavigatedSuccessfully(){
		wait.until(ExpectedConditions.visibilityOf(getBlazeDemoLogin()));
		getBlazeDemoLogin().isDisplayed();
		log.info("User navigated successfully to BlazeDemo Page.");
		
	}
	
	/*
	 * To enter the departure City
	 */
	public void enterDeparture(String departureCity){
		wait.until(ExpectedConditions.visibilityOf(getDepartureCityDropdown()));
		Select sct = new Select(getDepartureCityDropdown());
		sct.selectByVisibleText("Boston");
	}
	
	/*
	 * To enter the destination City
	 */
	public void enterDestination(String destinationCity){
		wait.until(ExpectedConditions.visibilityOf(getDestinationCityDropdown()));
		Select sct = new Select(getDestinationCityDropdown());
		sct.selectByVisibleText("London");
	}
	
	/*
	 * To click on Find Flights Button
	 */
	public void findFlightsClick(){
		wait.until(ExpectedConditions.visibilityOf(getFindFlightsBtn()));
		getFindFlightsBtn().click();
	}
	
	/*
	 * To click on Choose Flights Button
	 */
	public void chooseThisFlightBtnClick(String flightNum){
		wait.until(ExpectedConditions.visibilityOf(getChooseThisFlightsBtn()));
		getChooseThisFlightsBtn().click();
	}
	
	/*
	 * To click on Purchase Flight Button
	 */
	public void purchaseFlightBtnClick(){
		wait.until(ExpectedConditions.visibilityOf(getPurchaseFlightBtn()));
		getPurchaseFlightBtn().click();
	}
	
	/*
	 * To display Confirmation ID
	 */
	public void displayConfirmationID(){
		wait.until(ExpectedConditions.visibilityOf(getConfirmationID()));
		System.out.println(getConfirmationID());
	}
}