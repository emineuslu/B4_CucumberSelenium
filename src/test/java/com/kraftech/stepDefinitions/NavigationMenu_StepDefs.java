package com.kraftech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NavigationMenu_StepDefs {

    @Given("Login as Mike")
    public void login_as_mike() {
        System.out.println("Login as Mike");
    }

    @Then("Validate that Dashboard text is visible")
    public void validate_that_dashboard_text_is_visible() {
        System.out.println("Validate that Dashboard text is visible");
    }

    @When("Go to developers menu")
    public void go_to_developers_menu() {
        System.out.println("Go to developers menu");
    }

    @Then("Validate that Developers text is visible")
    public void validate_that_text_is_visible(String string) {
        System.out.println("Validate that Developers text is visible");
    }

    @When("Login as Sebastian")
    public void login_as_sebastian() {
        System.out.println("Login as Sebastian");
    }

    @When("Go to Forms-Input menu")
    public void go_to_forms_ınput_menu() {
        System.out.println("Go to Forms-Input menu");
    }

    @Then("Validate that General Form Elements - Input text is visible")
    public void validate_that_general_form_elements_ınput_text_is_visible() {
        System.out.println("Validate that General Form Elements - Input text is visible");
    }


    @When("Login as John")
    public void login_as_john() {
        System.out.println("Login as John");
    }

    @When("Go to My Profile menu")
    public void go_to_my_profile_menu() {
        System.out.println("Go to My Profile menu");
    }

    @Then("Validate that User Profile text is visible")
    public void validate_that_user_profile_text_is_visible() {
        System.out.println("Validate that User Profile text is visible");
    }

}
