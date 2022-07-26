package com.opsict.springbootcucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.http.HttpStatus;

import java.io.IOException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


public class StepDefsTest extends SpringIntegrationTest {
    @Given("the client calls \\/haytech")
    public void the_client_calls_haytech() throws IOException {
        executePost();
    }

    @Given("the client calls \\/hello")
    public void the_client_calls_hello() throws IOException {
        executeGet("http://localhost:8082/hello");
    }

    @Given("the client calls \\/version")
    public void the_client_calls_version() throws IOException {
        executeGet("http://localhost:8082/version");
    }




    @When("the client receives status code of {int}")
    public void the_client_receives_status_code_of(Integer statusCode) throws IOException {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " + latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    }


    @Then("the GET client  receives server  {string}")
    public void the_get_client_receives_server(String response) {
        assertThat("the response is not correct: ",latestResponse.getBody(), is(response));
    }

    @Then("the POST client receives server {string}")
    public void the_post_client_receives_server(String response) {
        assertThat("the response is not correct: ",latestResponse.getBody(), is(response));
    }

    @Then("the client receives server version {string}")
    public void the_client_receives_server_version(String version) {
        assertThat("the version is incorrect: ",latestResponse.getBody(),is(version));
    }
}