package features.step_definitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasePage;
import pages.BookingDetails;
import pages.HomePage;
import utils.DriversUtils;

public class BookingSteps extends BasePage {

	HomePage homePage = new HomePage();
	BookingDetails bookingDetails = new BookingDetails();

	@Given("I am on the home page")
	public void i_am_on_the_home_page() {
		homePage.navigateToHomePage();
	}

	@When("I browse through the page")
	public void i_browse_through_the_page() {
		homePage.goToRoomsCategory();
	}

	@Then("I have the option to book a room")
	public void i_have_the_option_to_book_a_room() {
		homePage.assertBookButtonDisplayed();
	}

	@Then("^user click on book a room$")
	public void user_click_on_book_a_room() throws Throwable {
		bookingDetails.clickOnthisRoomBtn();
	}

	@And("^user select date$")
	public void user_select_date() throws Throwable {
		bookingDetails.selectDates();
	}

	@And("^User enter valid details: (.+) ,(.+),(.+),(.+)$")
	public void user_enter_valid_details_(String firstName, String lastName, String email, String phone)
			throws Throwable {
		bookingDetails.enterFirstName(firstName);
		bookingDetails.enterLastName(lastName);
		bookingDetails.enterEmail(email);
		bookingDetails.enterPhone(phone);
	}

	@And("^User enter invalid details: (.+) ,(.+),(.+),(.+)$")
	public void user_enter_invalid_details_(String firstName, String lastName, String email, String phone)
			throws Throwable {
		bookingDetails.enterFirstName(firstName);
		bookingDetails.enterLastName(lastName);
		bookingDetails.enterEmail(email);
		bookingDetails.enterPhone(phone);
	}

	@And("^User Click on Book button$")
	public void user_click_on_book_button() throws Throwable {
		bookingDetails.clickOnbookRoomtBtn();
	}

	@Then("^User should be able to see message (.+)$")
	public void user_should_be_able_to_see_message(String status) throws Throwable {
		// TODO: Assert the message 
	}
}