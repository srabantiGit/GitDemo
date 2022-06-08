package project;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*
 * Difference betten @BeforeMethod and @BeforeTest
 * 
 * BeforeMethod : Is nothing but specific to class file and it executes before each and every method
 * 
 * BeforeTest : Depends on testNg XML file based upon the test folder scope
 * 
 * Two annotations which depends on class level : BeforeClass and BeforeMethod, these two annotations are class level.
 * 
 * Two annotations are TestNG XML level : BeforeTest and BeforeSuite, based upon the folders and based upon the test suits.
 * 
 * In TestNG order of the test methods execution depends upon the alphabetic order.
 * 
 * Group annotation is very important 
 * 
 * dependsOnMethod one test case is completely depends upon the mentioned test case, so in that case instead of executing 
 * in alphabetical order TestNG will execute the method first on which the other method is dependent. We can mention multiple method
 * in dependsOnMethod annotation separated by comma.
 * 
 * enabled=false will skip execution of the particular mentioned method.
 * 
 * These are all helper attributes.
 * 
 * timeOut helper attribute will hold the method and wait not fail until the mentioned time span (eg timeOut=4000).
 * 
 * Parameterising from TrestNG XML file.
 * 
 */

public class day1 {
	
	@Test
	public void Demo() {
		// TODO Auto-generated method stub
		System.out.println("Hello I am in Test");

	}
	
	@BeforeSuite
	public void bfSuite()
	{
		System.out.println("I am in BeforeSuite");
	}
	
	@AfterSuite
	public void afSuite()
	{
		System.out.println("I am the no 1 from last ");
	}
	
	@BeforeTest
	public void bfTest()
	{
		System.out.println("I am in BeforeTest");
	}
	
	
	@AfterTest
	public void lastexecution()
	{
		System.out.println("I will execute last (AfterTest)");
		
	}
	
	
	@BeforeGroups
	public void bfGroups()
	{
		System.out.println("I am in BeforeGroups");
	}
	
	@AfterGroups
	public void afGroups()
	{
		System.out.println("I am in AfterGroups");
	}
	
	@BeforeClass
	public void bfClass()
	{
		System.out.println("I am in BeforeClass");
	}
	
	@AfterClass
	public void afClass()
	{
		System.out.println("I am in AfterClass");
	}
	
	@BeforeMethod
	public void bfMethod()
	{
		System.out.println("I am in BeforeMethod");
	}
	
	@AfterMethod
	public void afMethod()
	{
		System.out.println("I am in AfterMethod");
	}
	
	@Test
	public void Demo1() {
		// TODO Auto-generated method stub
		System.out.println("Bye");

	}

}
