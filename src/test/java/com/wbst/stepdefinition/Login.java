package com.wbst.stepdefinition;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.luckybox.Helperclass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login  extends Helperclass{

	public Login() throws Exception{
		super();
	}
	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() throws Exception {

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	}

	@When("the user enters valid username and password")
	public void the_user_enters_valid_username_and_password() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter email']")).sendKeys("jatinpandey91204@yopmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys("Jatin@123");

	}

	@When("clicks the login button")
	public void clicks_the_login_button() throws Exception {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("the user should be redirected to the homepage")
	public void the_user_should_be_redirected_to_the_homepage() throws Exception {
		Thread.sleep(2000);
		String actual = driver.findElement(By.xpath("//div[@id='loginSuccess']")).getText();
		System.out.println(actual);

		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Accept')]")).click();
		String expected = "Login Successfully";

		if (expected.equalsIgnoreCase(actual)) {
			System.out.println("Test Case Pass");
		} else {
			System.err.println("Test Case Fail");

			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			String targetPath = System.getProperty("user.dir") + "/target/screenshots/homePageScreenshot.png";
			FileUtils.copyFile(screenshot, new File(targetPath));//changes

		}
	}
}
