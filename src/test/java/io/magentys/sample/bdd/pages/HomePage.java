package io.magentys.sample.bdd.pages;

import io.magentys.cinnamon.conf.Environment;
import io.magentys.cinnamon.webdriver.element.PageElement;
import io.magentys.cinnamon.webdriver.pages.PageException;
import io.magentys.cinnamon.webdriver.pages.PageObject;
import io.magentys.cinnamon.webdriver.support.FindByKey;

import javax.inject.Inject;
import org.openqa.selenium.WebDriver;

public class HomePage extends PageObject {
    private static final String WEB_URL = "web-url";
    private final Environment environment;

    @FindByKey("home-page.main-menu")
    private PageElement mainMenu;

    @Inject
    public HomePage(WebDriver driver, Environment environment) {
        super(driver);
        this.environment = environment;
    }

    public void open() {
        webDriver.get(environment.getStringProperty(WEB_URL));
    }

    public boolean waitUntilOpened() {
        //TODO implement me
        return false;
    }

}
