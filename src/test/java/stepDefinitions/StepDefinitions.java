package stepDefinitions;

import io.cucumber.java.en.*;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import pages.Pages;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

import static org.junit.Assert.assertEquals;


public class StepDefinitions {

    Pages elements = new Pages();

    final static Logger logger = LogManager.getLogger(StepDefinitions.class);
    @Given("User goes to verimix homepage")
    public void user_goes_to_verimix_homepage() {
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        logger.info("User went to verimix homepage");

    }
    @Then("Verify that the page is opening correctly")
    public void verify_that_the_page_is_opening_correctly() {
        String title = "Verimix Yazılım | Kurumsal Yazılım Çözümleri";
        assertEquals(title,Driver.getDriver().getTitle());
        logger.info("Verimix homepage opened successfully");
    }
    @Then("Scrolls to the end of the page")
    public void scrolls_to_the_end_of_the_page() {
        ReusableMethods.endPage();
        logger.info("Scrolled to the end of the page");
    }
    @Then("Verify that the linkedIn icon can be visible in the footer")
    public void verify_that_the_linked_in_icon_can_be_visible_in_the_footer() {
      assert(elements.LinkedinIcon.isDisplayed());
      logger.info("Verified that the linkedIn icon could be visible in the footer");
    }
    @Then("Click on linkedin icon")
    public void click_on_linkedin_icon() {
        elements.LinkedinIcon.click();
        logger.info("clicked on linkedin icon");
    }
    @Then("Verify that redirect to the correct page")
    public void verify_that_redirect_to_the_correct_page() {

      String title="Verimix Yazılım | LinkedIn" ;
      ReusableMethods.switchToWindow(title);
      ReusableMethods.bekle(10);

      logger.info("Verified that redirected to the correct page");

      Driver.quitDriver();
    }


}
