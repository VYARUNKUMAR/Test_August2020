package com.maersk.StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.maersk.Pages.BlazeDemoPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	public WebDriver webDriver;
	static BlazeDemoPage objBlazeDemoPage;
	
	@Before
	public void setUp(){
		if(webDriver == null){
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "/src/test/java/com/maersk/Drivers/chromedriver.exe");
			webDriver = new ChromeDriver();
			webDriver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
			webDriver.manage().window().maximize();
			
			objBlazeDemoPage = new BlazeDemoPage(webDriver); 
		}
	}
	
	@Before("@BlazeDemo")
	public void launchBlazeDemo(){
		webDriver.get("http://blazedemo.com/");
		webDriver.navigate().refresh();
		webDriver.get("http://blazedemo.com/");
	}
	
	@After()
	public void tearDown() {
		if(webDriver != null){
			webDriver.quit();
		}
	}
}