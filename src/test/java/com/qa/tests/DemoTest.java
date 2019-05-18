package com.qa.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest {

	
	@Test
	
	public void Multiply() {
		System.out.println("MULTIPLY");
		int a=10;
		int b = 20;
		AssertJUnit.assertEquals(200, b*a);
	}
	
	@Test
	
	public void Div() {
		System.out.println("DIV");
		int a=10;
		int b = 20;
		AssertJUnit.assertEquals(2, b/a);
	}
	
	@Test
	
	public void Sum() {
		System.out.println("SUM");
		int a=10;
		int b = 20;
		AssertJUnit.assertEquals(30, a+b);
	}
	
	@Test
	
	public void Sub() {
		System.out.println("SUB");
		int a=10;
		int b = 20;
		AssertJUnit.assertEquals(10, b-a);
	}
	
}
