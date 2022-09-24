package com_ActiTime_Tests;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



import com_ActiTime_Generic.BaseTest;


public class Demo extends BaseTest{
	@Test
	public void testA()
	{
		Reporter.log("hii", true);
		Assert.fail();
		
	}
	

}
