package com.nikhil.interviewprogramm;

public class FactorialNumber {

	public static void main(String[] args) 
	{
		int num = 10;
		factorialNum(num);
	}
	public static void factorialNum(int num)
	{
		int sum=0;
		for (int i = 1; i <=num; i++) 
		{
			sum=sum+i;
		}
		System.out.println("The Sum of the factorial of the Numbe is " +sum);
	}

}
