package com.nikhil.interviewprogramm;

public class PalindromeCheck {

	public static void main(String[] args) 
	{
		System.out.println("Is 121 palindrom?: " + isPalindromNumber(121));
	}
	public static boolean isPalindromNumber(int number)
	{
		int temp=number;
		int reverse=0;
		int remainder;

		while(temp!=0)
		{
			remainder=temp%10;
			reverse=(reverse*10)+remainder;
			temp=temp/10;
		}
		if(number==reverse)
		{
			return true;
		}
		return false;
	}
}
