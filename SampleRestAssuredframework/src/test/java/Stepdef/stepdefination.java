package Stepdef;

import endpoints.reusablesteps;
import endpoints.userendpoints;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;


public class stepdefination extends userendpoints {
   static Response res;
    reusablesteps reu = new reusablesteps();

    @When("I TRIGGER THE POST METHODE")
    public void i_trigger_the_post_methode() {
        res = Createuser("Ashish", "engineer");


    }

    @Then("USER IS CREATED")
    public void user_is_created() {
        reu.verifyinguserCreated();
        System.out.println(res.getStatusCode());
    }
    @Then("PRINT THE BODY")
    public void print_the_body() {
        res.body().prettyPrint();
    }

    @Then("RETRIVE THE STATUS LINE")
    public void retrive_the_status_line() {
        System.out.println( res.getStatusLine());
    }

    @When("USER ADD QUERY PARAM AND TRIGGER THE METHODE")
    public void user_add_query_param_and_trigger_the_get_method() {
     res = listuser(2);

    }
    @Then("REQUEST BODY IS DISPLAY")
    public void request_body_is_displayed() {
     res.body().prettyPrint();
    }
    @Then("VERIFY FOR VALID USER")
    public void verify_for_valid_user() {
     reu.verifylistuser();

    }
    @Then("PRINT THE LAST NAME")
    public void print_the_last_name() {
     String str =res.then().extract().body().jsonPath().getString("lawson");
     System.out.println(str);

    }

 @When("USER ENTER PARAM AND LAUNCH THE METHODE")
 public void user_enter_param_and_lauch_method() {
  res = updateUser("Tea","milk");
 }
 @Then("USER DATA WILL UPDATE")
 public void user_data_will_updated() {
     reu.verifyupdateUser();

 }
 @And("VERIFY USER")
 public void verify_user() {
String str = res.then().extract().body().jsonPath().getString("name");
  System.out.println(str);


 }



}




