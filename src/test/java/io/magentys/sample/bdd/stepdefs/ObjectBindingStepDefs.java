package io.magentys.sample.bdd.stepdefs;

import java.util.List;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.magentys.sample.bdd.domain.MenuItem;

public class ObjectBindingStepDefs {

    List<MenuItem> items;

    @When("^I create the following Menu items:$")
    public void i_create_a_new_Menu_item(final List<MenuItem> items) throws Throwable {
        this.items=items;
    }

    @Then("^the menu should contain (\\d+) items$")
    public void the_menu_should_contain_items(final int count) throws Throwable {
        Assert.assertEquals(count, items.size());
    }

    @Then("^the menu should contain \"([^\"]*)\"$")
    public void the_menu_should_contain(final String expectedName) throws Throwable {

        for (final MenuItem menuItem : items) {
            if(menuItem.getName().equals(expectedName)) {
                // found
                return;
            }
        }

        Assert.fail("No menu item found for: " + expectedName);

    }

}
