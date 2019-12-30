package TestCases;

import org.testng.annotations.Test;

import util.CreateDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;

public class NewTest {
	public WebDriver driver;
  @BeforeMethod
  public void beforeMethod() throws Exception {
	  CreateDriver.getInstance().setDriver("chrome", "windows 7", "local");
	  driver = CreateDriver.getInstance().getDriver();
  }
	
	
  @Test
  public void f() {
	  System.out.println("Test");
  }
  

  @AfterMethod
  public void afterMethod() {
	  CreateDriver.getInstance().closeDriver();
  }

}
