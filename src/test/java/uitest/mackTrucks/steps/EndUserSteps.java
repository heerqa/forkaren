package uitest.mackTrucks.steps;


import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import resttest.AppStatus;
import uitest.mackTrucks.pages.ExtendedPageObject;
import uitest.mackTrucks.pages.LandingPage;



public class EndUserSteps extends ExtendedPageObject {

	LandingPage landingPage;




	@Step
	public void user_is_on_Landing_page() throws InterruptedException {
		landingPage.openURL();
	}

	@Step
	public void user_click_on_menu(String string) throws InterruptedException {
		landingPage.user_click_on_menu(string);
	}

	@Step
	public void user_can_see_related_page_displayed(String string) throws InterruptedException {
		Assert.assertEquals(string, landingPage.user_can_see_related_page_displayed());
	}






}
