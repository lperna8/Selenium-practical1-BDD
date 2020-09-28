package stepDefinition;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on Amazons landing page$")
    public void user_is_on_amazons_landing_page() throws Throwable {
    	System.out.println("landing page opens");
        
    }

    @When("^User searches for Appium book$")
    public void user_searches_for_appium_book() throws Throwable {
         System.out.println(" validate search page");
    }

    @Then("^Search results are displayed$")
    public void search_results_are_displayed() throws Throwable {
    	System.out.println("validate the books");
         
    }
    
    
           @Given("^User is on Search results page$")
        public void user_is_on_search_results_page() throws Throwable {
             
        }

        @Given("^User selected the 10th book$")
        public void user_selected_the_10th_book() throws Throwable {
             
        }

        @When("^User reviews the Appium book search results$")
        public void user_reviews_the_appium_book_search_results() throws Throwable {
           
        }

        @When("^User checks the ratings of the books$")
        public void user_checks_the_ratings_of_the_books() throws Throwable {
            System.out.println("Rating of the book");
        }

        @Then("^user selects the 10th book$")
        public void user_selects_the_10th_book() throws Throwable {
             
        }

        @Then("^User adds the book to the cart$")
        public void user_adds_the_book_to_the_cart() throws Throwable {
            
        }

        @And("^user reviews the final price of the book$")
        public void user_reviews_the_total_price_of_the_book() throws Throwable {
            System.out.println("Total price of the book");
        }

    }

