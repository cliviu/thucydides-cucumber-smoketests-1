package com.bddinaction.flyinghigh.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.thucydides.cucumber.CucumberWithThucydides;
import org.junit.runner.RunWith;

@RunWith(CucumberWithThucydides.class)
@CucumberOptions(features="src/test/resources/features/authentication/logging_on_with_an_invalid_account.feature")
public class LoggingOnWithAnInvalidAccount{}
