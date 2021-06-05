package com.nikhil.interviewprogramm;

public class VowelsPresentInAString {

	public static void main(String[] args) 
	{
		String str ="aeio";
		StringContainVowels(str);
	}
	public static void StringContainVowels(String str)
	{
		char [] arr =str.toCharArray();
		for (int i = 0; i < arr.length; i++);
		if(str.matches("[aeiouAEIOU]"))
		{
			System.out.println("Vowels are Present");
		}
		else
		{
			System.out.println("Vowels are not Present");

		}
	}
}