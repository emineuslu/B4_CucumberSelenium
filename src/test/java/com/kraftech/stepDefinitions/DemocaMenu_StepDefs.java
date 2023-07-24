package com.kraftech.stepDefinitions;

import com.kraftech.pages.DashboardPage;
import com.kraftech.pages.DemocaMenuPage;
import com.kraftech.utilities.BrowserUtils;
import com.kraftech.utilities.ConfigurationReader;
import com.kraftech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en_old.Ac;
import io.cucumber.java.eo.Se;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class DemocaMenu_StepDefs {

     DemocaMenuPage democaMenuPage=new DemocaMenuPage();

    @Given("The user is go to the web page")
    public void the_user_is_go_to_the_web_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

   @When("The user is go to elements page")
    public void the_user_is_go_to_elements_page() {
        democaMenuPage.clickElements();
        BrowserUtils.waitFor(3);
    }

    @Then("The user should be able to see following Menu")
    public void the_user_should_be_able_to_see_following_menu( List<String> expectedList) {
        System.out.println("expectedList = " + expectedList);
        System.out.println("expectedList.size() = " + expectedList.size());

        List<String>actualList= BrowserUtils.getElementsText(democaMenuPage.democaMenu);
        System.out.println("actualList = " + actualList);
        System.out.println("actualList.size() = " + actualList.size());

        Assert.assertEquals(expectedList,actualList);
    }


}
