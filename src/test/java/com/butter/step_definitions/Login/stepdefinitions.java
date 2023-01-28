package com.butter.step_definitions.Login;

import com.butter.utilities.ConfigurationReader;
import com.butter.utilities.Driver;
import io.cucumber.java.en.Given;

import java.lang.module.Configuration;

public class stepdefinitions {

    @Given("User log's in")
    public void user_log_s_in() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));


    }
}
