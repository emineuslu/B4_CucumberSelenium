package com.kraftech.stepDefinitions;

import com.kraftech.pages.BasePage;
import com.kraftech.pages.UserProfilePage;
import com.kraftech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class UserProfile_StepDefs extends BasePage {

    UserProfilePage userProfilePage=new UserProfilePage();

    @Then("The user should be able to see following subMenu")
    public void theUserShouldBeAbleToSeeFollowingSubMenu(List<String> subMenu) {
        List <String> actualSubMenu= BrowserUtils.getElementsText(userProfilePage.tabList);
        System.out.println("actualSubMenu = " + actualSubMenu);
        System.out.println("subMenu = " + subMenu);
        Assert.assertEquals(subMenu,actualSubMenu);
    }
}
