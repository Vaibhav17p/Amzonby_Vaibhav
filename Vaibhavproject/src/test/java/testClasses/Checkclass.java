package testClasses;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Checkclass {
	@BeforeClass
	public void beforeclas()
	{
		System.out.println("BeforeClaSS");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("BeforeMethod");
	}
	@Test
	public void testclassA()
	{
		System.out.println("TestClaSS-A");
	}

	@Test
	public void testclassB()
	{
		System.out.println("TestClaSS-B");
	}
	@Test
	public void testclassc()
	{
		System.out.println("TestClaSS-c");
	}
	
	@AfterMethod
	public void afteremethod()
	{
		System.out.println("AfterMethod");
	}
	@AfterClass
	public void aftermethod()
	{
		System.out.println("AfterClaSS");
	}
}
