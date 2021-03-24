package net.trycloud.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.trycloud.pages.TryCloudLoginPage;
import net.trycloud.utilities.ConfigurationReader;
import net.trycloud.utilities.Driver;

public class US1StepDefinitions {

        TryCloudLoginPage tryCloudLoginPage = new TryCloudLoginPage();

        /*
        Test Case 1
         */

        @Given("User is on the login page")
        public void user_is_on_login_page(){
                Driver.getDriver().get(ConfigurationReader.getProperty("loginURL"));
        }



        @When("user enters correct login info")
        public void user_enters_correct_login_info(){
                tryCloudLoginPage.UserNameBox.sendKeys(ConfigurationReader.getProperty("user1"));
                tryCloudLoginPage.PasswordBox.sendKeys(ConfigurationReader.getProperty("password"));
        }


        @And("clicks login button")
        public void clicks_login_button(){
                tryCloudLoginPage.loginButton.click();
        }


        @Then("user lands on homepage")
        public void user_lands_on_homepage(){

        }
// -------------------------------------------------------------------------------------------------------

        /*
        Test Case 2
         */

        @When("user enters incorrect info")
        public void userEntersIncorrectInfo() {
        }

        @Then("User should see message stating incorrect credentials was used, title should be the same")
        public void userShouldSeeMessageStatingIncorrectCredentialsWasUsedTitleShouldBeTheSame() {
        }
}

