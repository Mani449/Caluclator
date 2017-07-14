package com.learning.mani;

import junit.framework.TestCase;

public class TestCalculator extends TestCase{

	Calculator calc=new Calculator();
	
	public void testSum()
	{
		assertTrue(calc.sum(2, 3)==5.0f);
		System.out.println("Sum Test passed");
	}
	
	public void testDifference()
	{

		assertTrue(calc.difference(2, 3)==-1.0f);
		System.out.println("Difference Test passed");
	}
	
	public void testMultiply()
	{

		assertTrue(calc.multiply(2, 3)==6.0f);
		System.out.println("Multiply Test passed");
	}
	public void testDivide()
	{

		assertTrue(calc.divide(2, 0)==0.0f);
		System.out.println("Divide Test passed");
	}
	
}
