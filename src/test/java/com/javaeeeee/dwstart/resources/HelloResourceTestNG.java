package com.javaeeeee.dwstart.resources;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class HelloResourceTestNG {
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }


  @Test
  public void getGreeting() {
	  WebDriver driver = new FirefoxDriver();
      String baseUrl = "http://52.25.96.80:8085/hello";
      String expectedTitle = "Hello world!";
      String actualTitle = "";

      // launch Firefox and direct it to the Base URL
      driver.get(baseUrl);

      // get the actual value of the title
      actualTitle = driver. driver.findElement(By.xpath("xhtml:html/xhtml:body/xhtml:pre")).getText();

      /*
       * compare the actual title of the page witht the expected one and print
       * the result as "Passed" or "Failed"
       */
      if (actualTitle.contentEquals(expectedTitle)){
          System.out.println("Test Passed!");
      } else {
          System.out.println("Test Failed");
      }
      
      //close Firefox
      driver.close();
      
      // exit the program explicitly
      System.exit(0);
    
  }

  @Test
  public void getJSONGreeting() {
	  WebDriver driver = new FirefoxDriver();
      String baseUrl = "http://52.25.96.80:8085/hello";
      String expectedTitle = "Hello world!";
      String actualTitle = "";

      // launch Firefox and direct it to the Base URL
      driver.get(baseUrl);

      // get the actual value of the title
      actualTitle = driver.getTitle();

      /*
       * compare the actual title of the page witht the expected one and print
       * the result as "Passed" or "Failed"
       */
      if (actualTitle.contentEquals(expectedTitle)){
          System.out.println("Test Passed!");
      } else {
          System.out.println("Test Failed");
      }
      
      //close Firefox
      driver.close();
      
      // exit the program explicitly
      System.exit(0);
    
  }
}
