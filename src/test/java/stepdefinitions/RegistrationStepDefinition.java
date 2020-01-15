package stepdefinitions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;
import pom.RegistrationPage;

public class RegistrationStepDefinition {

	static WebDriver driver;
	static RegistrationPage page;

	// Sets up WebDriver and RegistrationPage for all other tests
	@Given("^User is on registration page$")
	public void userIsOnRegistrationPage() throws Throwable {
		System.out.println("Registration Page");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mwang3\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver(options);

		driver.get("file:///C:/Users/mwang3/Documents/VehicleRegistrationForm.html");
		page = new RegistrationPage(driver);
		String pageTitle = page.getPageTitle().getText();

		Assert.assertEquals("Vehicle Registration Form", pageTitle);
	}

	@When("^User selects a title$")
	public void userSelectsTitle() throws Throwable {
		System.out.println("User selects title");

		page.getTitle().selectByIndex(1);
	}

	@And("^User enters a valid name$")
	public void userEntersName() throws Throwable {
		System.out.println("User enters name");

		page.getOwnerName().sendKeys("Michael");
	}

	@And("^User selects a gender$")
	public void userSelectsGender() throws Throwable {
		System.out.println("User selects gender");

		page.getMaleRadio().click();
	}

	@And("^User enters a valid address")
	public void userEntersAddress() throws Throwable {
		System.out.println("User enters address");

		page.getAddress().sendKeys("42WallabyWay");
	}

	@And("^User enters a valid city$")
	public void userEntersCity() throws Throwable {
		System.out.println("User enters city");

		page.getCity().sendKeys("Sydney");
	}

	@And("^User enters a valid state$")
	public void userEntersState() throws Throwable {
		System.out.println("User enters state");

		page.getState().sendKeys("NewSouthWales");
	}

	@And("^User selects a country$")
	public void userSelectsCountry() throws Throwable {
		System.out.println("User selects country");

		page.getCountry().selectByVisibleText("Australia");
	}

	@And("^User enters a valid zip code$")
	public void userEntersZipCode() throws Throwable {
		System.out.println("User enters zip code");

		page.getZipCode().sendKeys("555555");
	}

	@And("^User selects a vehicle type$")
	public void userSelectsVehicleType() throws Throwable {
		System.out.println("User selects vehicle type");

		page.getWheel4Radio().click();
	}

	@And("^User selects a fuel type")
	public void userSelectsFuelType() throws Throwable {
		System.out.println("User selects fuel type");

		page.getPetrolRadio().click();
	}

	@And("^User selects a year of mfg$")
	public void userSelectsYearMfg() throws Throwable {
		System.out.println("User selects year of mfg");

		page.getMfg().selectByIndex(1);
	}

	@And("^User clicks submit$")
	public void userClicksSubmit() throws Throwable {
		System.out.println("User clicks submit");

		page.getSubmit().click();
	}
	
	/**Switches to alert, calls assertEquals on expected and the alert's text,
	 * Closes alert, then switches back
	 * @param expected The expected text of the alert
	 */
	public void assertAlert(String expected) throws Throwable {
		Alert alert = driver.switchTo().alert();
		String alertText = alert.getText();
		Assert.assertEquals(expected, alertText);
		alert.accept();
		
		driver.switchTo().activeElement();
	}

	@Then("^Alert fur successful registration is displayed$")
	public void successfulRegistration() throws Throwable {
		System.out.println("Successful registration");
		
		assertAlert("You are Succesfully registered your vehicle");
	}
	
	@Then("^Alert for missing title is displayed")
	public void noTitle() throws Throwable {
		System.out.println("Missing title");
		
		assertAlert("Select title from the list");
	}
	
	@Then("^Alert for invalid owner name is displayed")
	public void invalidName() throws Throwable {
		System.out.println("Invalid Name");
		
		assertAlert("Owner Name should not be empty and must contain alphabets with in the range of 5 to 20");
	}
	
	@Then("Alert for missing gender is displayed")
	public void missingGender() throws Throwable {
		System.out.println("Missing gender");
		
		assertAlert("Please Select gender");
	}
	
	@Then("Alert for invalid address is displayed")
	public void invalidAddress() throws Throwable {
		System.out.println("Invalid address");
		
		assertAlert("address should not be empty and must be alphanumeric with in the range of 5 to 20");
	}
	
	@Then("Alert for invalid city is displayed")
	public void invalidCity() throws Throwable {
		System.out.println("Invalid city");
		
		assertAlert("city should not be empty and must have alphabet characters only");
	}
	
	@Then("Alert for invalid state is displayed")
	public void invalidState() throws Throwable {
		System.out.println("Invalid state");
		
		assertAlert("State should not be empty and must have alphabet characters only");
	}
	
	@Then("Alert for missing country is displayed")
	public void missingCountry() throws Throwable {
		System.out.println("Missing country");
		
		assertAlert("Select the country from the list");
	}
	
	@Then("Alert for invalid zip code is displayed")
	public void invalidZipCode() throws Throwable {
		System.out.println("Invalid zip code");
		
		assertAlert("ZIP code should not be empty and must have 6 numeric characters only");
	}
	
	@Then("Alert for missing vehicle type is displayed")
	public void missingVehicleType() throws Throwable {
		System.out.println("Missing vehicle type");
		
		assertAlert("Please Select Vehicle type");
	}
	
	@Then("Alert for missing fuel type is displayed")
	public void missingFuelType() throws Throwable {
		System.out.println("Missing fuel type");
		
		assertAlert("Please Select fuel type");
	}
	
	@Then("Alert for missing year of mfg is displayed")
	public void missingMfg() throws Throwable {
		System.out.println("Missing mfg");
		
		assertAlert("Select mfg year from the list");
	}
	
	@And("^Page is closed")
	public void closePage() throws Throwable {
		driver.close();
	}
}
