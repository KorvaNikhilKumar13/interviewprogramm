package com.nikhil.interviewprogramm;

public class GivenNoisPrimeorNot {

	public static void main(String[] args) 
	{
		int num=16;
		primecheck(num);
	}
	public static void primecheck(int num)
	{
		if(num<0)
		{
			System.out.println("Not a Valid Number");
		}
		if(num==0 ||num==1)
		{
			System.out.println("It is not a Prime Number");
		}
		else if(num==2||num==3)
		{
			System.out.println("It is a Prime Number");
		}
		else if((num*num-1)/24==0)
		{
			System.out.println("It is a Prime Number");
		}
		else
		{
			System.out.println("It is not a Prime Number");
		}
	}
}
