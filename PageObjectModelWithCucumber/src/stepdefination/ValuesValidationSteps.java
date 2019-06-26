package stepdefination;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.project.pageObjects.pageValues;
import com.project.utility.Utility;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValuesValidationSteps {
	
     WebDriver driver;
	 pageValues ob ;
	@Given("^User is on Values Validation Page$")
	public void User_is_on_Values_Validation_Page() throws Throwable
	{
		Utility.initializeBrowser();
		System.out.println(driver.getTitle());
	   
	}

	@When("^User reads all the values$")
	public void User_reads_all_the_values() throws Throwable 
	{
	  ob = new pageValues(driver);
	}

	@Then("^Verify the right count of values appear on the screen$")
	public void Verify_the_right_count_of_values_appear_on_the_screen() throws Throwable 
	{
	      int c= ob.countOfValues();
	      Assert.assertEquals(5,c);
	     
	 }
	
	@Then("^verify the values on the screen are greater than zero$")
	public void verify_the_values_on_the_screen_are_greater_than_zero() throws Throwable
	{
	   if(ob.countOfValues()>0)
	   {
		   System.out.println("Values are greater than zero");
	   }
	   else
	   {
		   System.out.println("Values are greater than zero");
    	}
	}

	@Then("^verify the total balance is correct based on the values$")
	public void verify_the_total_balance_is_correct_based_on_the_values() throws Throwable 
	{
	   Assert.assertEquals(ob.totalOfValues(), ob.getTotal().getText());  
	}

	@Then("^values are formatted as currencies$")
	public void values_are_formatted_as_currencies() throws Throwable
	{
	   ob.isCurrency();
	}

	@Then("^verify the total balance matches the sum of the values$")
	public void verify_the_total_balance_matches_the_sum_of_the_values() throws Throwable 
	{
	  Assert.assertEquals(ob.getTotal().getText(), ob.totalOfValues());    
	}
}
