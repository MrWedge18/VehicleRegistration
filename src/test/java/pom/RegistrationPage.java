package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage {

	WebDriver driver;
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="/html/body/h1")
	private WebElement pageTitle;
	
	@FindBy(xpath="/html/body/form/ul/li[2]/select")
	private WebElement title;
	
	@FindBy(id="ownername")
	private WebElement ownerName;
	
	@FindBy(xpath="/html/body/form/ul/li[6]/input")
	private WebElement maleRadio;
	
	@FindBy(xpath="/html/body/form/ul/li[7]/input")
	private WebElement femaleRadio;
	
	@FindBy(id="address")
	private WebElement address;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(name="country")
	private WebElement country;
	
	@FindBy(id="zip")
	private WebElement zipCode;
	
	@FindBy(xpath="/html/body/form/ul/li[19]/input")
	private WebElement wheel4Radio;
	
	@FindBy(xpath="/html/body/form/ul/li[20]/input")
	private WebElement wheel2Radio;
	
	@FindBy(xpath="/html/body/form/ul/li[22]/input")
	private WebElement petrolRadio;
	
	@FindBy(xpath="/html/body/form/ul/li[23]/input")
	private WebElement dieselRadio;
	
	@FindBy(name="mfg")
	private WebElement mfg;
	
	@FindBy(name="submit")
	private WebElement submit;

	public WebElement getPageTitle() {
		return pageTitle;
	}

	public Select getTitle() {
		System.out.println(driver);
		System.out.println(title);
		return new Select(title);
	}

	public WebElement getOwnerName() {
		return ownerName;
	}

	public WebElement getMaleRadio() {
		return maleRadio;
	}

	public WebElement getFemaleRadio() {
		return femaleRadio;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public Select getCountry() {
		return new Select(country);
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getWheel4Radio() {
		return wheel4Radio;
	}

	public WebElement getWheel2Radio() {
		return wheel2Radio;
	}

	public WebElement getPetrolRadio() {
		return petrolRadio;
	}

	public WebElement getDieselRadio() {
		return dieselRadio;
	}

	public Select getMfg() {
		return new Select(mfg);
	}

	public WebElement getSubmit() {
		return submit;
	}
}
