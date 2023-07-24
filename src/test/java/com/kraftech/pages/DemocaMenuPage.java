package com.kraftech.pages;

import com.kraftech.utilities.BrowserUtils;
import com.kraftech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DemocaMenuPage extends BasePage {

    @FindBy(xpath = "(//div[@class='card mt-4 top-card'])[1]")
    public WebElement element1;

    @FindBy(xpath = "(//div[@class='header-wrapper'])[1]")
    public WebElement element2;

    @FindBy(xpath= "//div/span[@class='group-header']")
    public List<WebElement> democaMenu;

    public void clickElements(){
       element1.click();
       BrowserUtils.waitFor(2);
       element2.click();

    }





}
