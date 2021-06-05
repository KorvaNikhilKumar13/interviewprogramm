package com.nikhil.interviewprogramm;

public class SwapNumbers 
{
	public static void main(String[] args) 
	{
		int num1=10;
		int num2=20;
		swap(num1,num2);
	}
	public static void swap(int num1,int num2)
	{
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("After Swap of the number1 "+num1);
		System.out.println("After Swap of the number2 "+num2);
	}
}