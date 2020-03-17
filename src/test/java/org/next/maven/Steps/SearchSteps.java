package org.next.maven.Steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.next.maven.pages.HomePage;
import org.next.maven.pages.SearchPage;
import sun.jvm.hotspot.utilities.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.MatcherAssert.assertThat;


public class SearchSteps {

    HomePage homePage = new HomePage();
    SearchPage searchPage = new SearchPage();

    @Given("^I am on home page$")
    public void i_am_on_home_page() {

        String actual = homePage.getCurrentUrl();
        assertThat(actual, actual.endsWith("co.uk/"));

    }

    @When("^I look for product \"([^\"]*)\"$")
    public void i_look_for_product(String hoodies)  {

        searchPage.doSearch("hoodies");
        String actual = homePage.getCurrentUrl();
        assertThat(actual, containsString(hoodies) );

    }

    @Then("^I should be able to see all the respective products$")
    public void i_should_be_able_to_see_all_the_respective_products()  {

    }

}
