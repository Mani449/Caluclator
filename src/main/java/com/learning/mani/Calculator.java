package com.learning.mani;

public class Calculator {

	public float sum(float a, float b)
	{
		return a+b;
	}
	public float difference(float a, float b)
	{
		return a-b;
	}
	public float multiply(float a, float b)
	{
		return a*b;
	}
	public float divide(float a, float b)
	{
		return b==0 ? 0: a/b; 
	}
}
