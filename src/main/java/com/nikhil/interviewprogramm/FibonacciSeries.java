package com.nikhil.interviewprogramm;

public class FibonacciSeries {

	public static void main(String[] args) 
	{
		int num=10;
		fibonacciseries(num);
	}
	public static void fibonacciseries(int num)
	{
		int a=0;
		int b=0;
		int c=1;
		for (int i = 1; i <num; i++) 
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println("The FibonacciSeries of the Given Range is " +a);
		}

	}

}
