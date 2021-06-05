package com.nikhil.interviewprogramm;

public class ReverseString {

	public static void main(String[] args)
	{
		String str ="Java World";
		reverseString(str);
	}
	public static void reverseString(String str)
	{
		char [] ch =str.toCharArray();
		for (int i=ch.length-1;i>= 0; i--) 
		{
			System.out.print("The Reverse of the String is " +ch[i]);
		}
	}

}
