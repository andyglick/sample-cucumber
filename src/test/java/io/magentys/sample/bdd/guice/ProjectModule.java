package io.magentys.sample.bdd.guice;

import com.google.inject.AbstractModule;

import cucumber.api.guice.CucumberScopes;
import io.magentys.sample.bdd.stepdefs.ObjectBindingStepDefs;

public final class ProjectModule extends AbstractModule {
    @Override
    public void configure() {
        try {
            // Bindings for classes that are shared for the lifetime of the
            // scenario.
            bind(ObjectBindingStepDefs.class).in(CucumberScopes.SCENARIO);
        } catch (final Exception e) {
            addError(e.getMessage());
        }
    }
}
