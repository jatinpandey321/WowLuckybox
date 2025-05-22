package com.wbst.stepdefinition;

import org.openqa.selenium.By;

import com.luckybox.Helperclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Logout extends Helperclass {
	
	public Logout() {
		super();
	}

	@Given("the user clicks on the profile image")
	public void the_user_clicks_on_the_profile_image() throws Exception {
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//div[@class='relative inline-block text-left custom-dropdown auth-dropdown']")).click();
	}

	@When("the user clicks on the Sign Out button")
	public void the_user_clicks_on_the_sign_out_button() throws Exception {
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Sign out')]")).click();
	}

	@Then("the logout should be successful")
	public void the_logout_should_be_successful() {
	    
	}

}
