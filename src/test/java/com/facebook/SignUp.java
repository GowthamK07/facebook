package com.facebook;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import facebook.base.base;
import facebook.objectrepository.alllocators;
import io.cucumber.datatable.DataTable;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SignUp  extends base{
	
	base b = new base() ;
	
	alllocators l =new alllocators ();
	

	@When("launch {string}")
	public void launch(String string) {
		
	    driver.get(string);
	}

	
	@When("Enter Email {string}")
	public void enter_Email(String evalue) {

       
		b.inputText(l.getLogmail(), evalue);
	}

	@When("Enter password{int} {string}")
	public void enter_password(Integer int1, String pvalue) {

		b.inputText(l.getLogpass(), pvalue);
	}
	


	@When("Click Login")
	public void click_Login() {
		

	    l.getLogbutton().click();
	    
	        
	    } 
	 
	

	@When("click forgot password")
	public void click_forgot_password () {
		
	b.button(l.getForgot());
	    
	}
	
	@Then("enter email amd search {string}")
	public void enter_email_amd_search(String email) {
		
		
//		w.until(ExpectedConditions.elementToBeClickable(l.getForgotemail()));
		b.inputText(l.getForgotemail(), email);
		
		b.button(l.getForgotsearch());
	   
	}

	@When("click Create New Account")
	public void click_Create_New_Account() {
		b.button(l.getNewaccount());
	    
	}

	@When("Enter First and sure Name {string} {string}")
	public void enter_First_and_sure_Name(String string, String string2) {
		b.inputText(l.getFname(), string);
		b.inputText(l.getLname(), string2);
	    
	}

	@When("Enter Email amd ReEnter {string} {string}")
	public void enter_Email_amd_ReEnter(String string, String string2) {
		b.inputText(l.getEmail(), string);
		b.inputText(l.getReenter(), string2);
	    
	}

	@When("Enter Password {string}")
	public void enter_Password(String string) {
		b.inputText(l.getPassword(), string);
	    
	}
	
	@When("Select DOB {string} {string} {string}")
	public void select_DOB(String string, String string2, String string3) {
		b.choosebytext(l.getDay(), string);
		b.choosebytext(l.getMonth(), string2);
		b.choosebytext(l.getYear(), string3);
	}


	@When("select gender")
	public void select_gender() {
		
		b.button(l.getMale());
		
	    
	}
	@When("Click Signup")
	public void click_Signup() {
		b.button(l.getSignbutton());
	   
	}
	
	
	

}
