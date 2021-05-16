package uitest.mackTrucks.stepDefinitions;


import io.cucumber.java.en.When;
import uitest.mackTrucks.steps.EndUserSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class DefinitionSteps {

	@Steps
	EndUserSteps steps;

	


	@Given(": user is login with username {string} and password {string}")
	public void user_is_login_with_username_and_password(String string, String string2) {
		// implement my own logic
	}



	@When(": User enter General information with following data")
	public void user_enter_General_information_with_following_data(io.cucumber.datatable.DataTable dataTable) {

	// implement my own logic
	}
	@When(": user enters Password Configuration Information")
	public void user_enters_Password_Configuration_Information(io.cucumber.datatable.DataTable dataTable) {

		// implement my own logic
	}
	@When(": user click on  ADD button")
	public void user_click_on_ADD_button() {
		// implement my own logic
	}
	@Then(":  verify the  enity is added and data is correct")
	public void verify_the_enity_is_added_and_data_is_correct() {
		// implement my own logic
	}





	@When(": user click on delete button")
	public void user_click_on_delete_button() {
		// implement my own logic
	}
	@Then(": The enity should be deleted")
	public void the_enity_should_be_deleted() {
		// implement my own logic
	}

	@Given(": user ia login with username {string} and password {string}")
	public void user_ia_login_with_username_and_password(String string, String string2) {
		// implement my own logic
	}


	@Then(": user is on Security Administraion page")
	public void user_is_on_Security_Administraion_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@When(": user click on edit button")
	public void user_click_on_edit_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@When(": user enter new values to any field")
	public void user_enter_new_values_to_any_field() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@When(": click on Save button")
	public void click_on_Save_button() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}
	@Then(": The enity with new values must be saved")
	public void the_enity_with_new_values_must_be_saved() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}


	@Given("user is on Landing page")
	public void user_is_on_Landing_page() throws InterruptedException {
		steps.user_is_on_Landing_page();
	}

	@Given("user click on {string} menu")
	public void user_click_on_menu(String string) throws InterruptedException {
		steps.user_click_on_menu(string);
	}

	@Then("user can see related page {string} displayed")
	public void user_can_see_related_page_displayed(String string) throws InterruptedException {
		steps.user_can_see_related_page_displayed(string);
	}


}
