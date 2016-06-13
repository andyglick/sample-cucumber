package io.magentys.sample.bdd.stepdefs;

import io.magentys.cinnamon.webdriver.pages.PageException;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import com.google.inject.Inject;
import io.magentys.sample.bdd.pages.HomePage;

import cucumber.api.java.en.When;

public class HomeStepDefs {
    private final HomePage homePage;

    @Inject
    public HomeStepDefs(HomePage homePage) {
        this.homePage = homePage;
    }

    @When("^I open the website$")
    public void I_open_the_website() throws Throwable {
        homePage.open();
    }

}
