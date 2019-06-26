package com.project.pageObjects;

import java.text.DecimalFormat;
import java.util.ArrayList;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pageValues 
{
  private WebDriver driver;  
  ArrayList<WebElement> ar = new ArrayList<WebElement>();
  public pageValues(WebDriver driver)
  {
	  this.driver = driver;
	  PageFactory.initElements(driver,this);
  }
  
 @FindBy(id ="txt_val_1")
  public WebElement value1;
 
 @FindBy(id ="txt_val_2")
 WebElement value2;
 
 @FindBy(id ="txt_val_4")
 WebElement value3;
 
 @FindBy(id ="txt_val_5")
 WebElement value4;
 
 @FindBy(id ="txt_val_")
 WebElement value5;
 
 @FindBy(id ="txt_ttl_val")
 WebElement total;

 public WebElement getTotal()
 {
	 return total;
 }
 // Count of  Right side Values
 public int countOfValues()
 {
     ar.add(value1);
	 ar.add(value2);
	 ar.add(value3);
	 ar.add(value4);
	 ar.add(value5);
	 int count = ar.size();
     return count;
 }
 
 //Total of Values
 public int totalOfValues()
 {
	 int total =0;
	 for(WebElement e : ar)
	 {
		 DecimalFormat df = new DecimalFormat("###,###.##"); 
		 total = total+Integer.parseInt((df.format(e.getText()).replace("$","")));
	 }
	 return total;
 }
 
 // Checking contains '$'
 public  void isCurrency()
 {
	 boolean flag  ;
	 for(WebElement e : ar)
	 {
	   flag = e.getText().contains("$");
	 if (flag = true)
	 {
		 System.out.println(e.getText() +"is formatted as $");
	 }
	 else
	 {
	  System.out.println(e.getText() + " is not formatted as $");
     }
 }
 }
}
