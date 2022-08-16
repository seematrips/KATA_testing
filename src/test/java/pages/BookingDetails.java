package pages;

import static utils.DriversUtils.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import utils.DriversUtils;

public class BookingDetails {

	public WebDriver getDriver = DriversUtils.getDriver();

	public BookingDetails() {
		PageFactory.initElements(getDriver(), this);
	}

	By btnbookthisRoom = By.xpath("//button[normalize-space()='Book this room']");

	By Txtname = By.xpath("//input[@name='firstname']");
	By TxtLastname = By.xpath("//input[@name='lastname']");
	By TxtEmail = By.xpath("//input[@name='email']");
	By PhoneNum = By.xpath("//input[@name='phone']");
	By btnBOOK = By.xpath("//button[normalize-space()='Book']");

	// Actions Methods

	public void clickOnthisRoomBtn() {
		getDriver.findElement(btnbookthisRoom).click();

	}

	public void enterFirstName(String firstName) {
		getDriver.findElement(Txtname).sendKeys(firstName);
	}

	public void enterLastName(String lastName) {
		getDriver.findElement(TxtLastname).sendKeys(lastName);
	}

	public void enterEmail(String email) {
		getDriver.findElement(TxtEmail).sendKeys(email);
	}

	public void enterPhone(String phone) {
		getDriver.findElement(PhoneNum).sendKeys(phone);
	}

	public void clickOnbookRoomtBtn() {
		getDriver.findElement(btnBOOK).click();
	}

	public void selectDates() {
		WebElement selectdateSource = getDriver.findElement(By.xpath("//button[normalize-space()='17']"));
		
		WebElement selectdateDest = getDriver.findElement(By.xpath("//button[normalize-space()='19']"));
		
		Actions act = new Actions(getDriver);
		//act.doubleClick(selectdateSource);
		act.doubleClick(selectdateSource).clickAndHold().release(selectdateDest).build().perform();
		//act.click(selectdateDest);
	}

}
