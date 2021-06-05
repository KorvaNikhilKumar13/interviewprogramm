package com.nikhil.interviewprogramm;

public class RemoveWhitSpacesInString {

	public static void main(String[] args) 
	{
		String str="Nikhi lKumar";
		removeWhiteSpaces(str);
	}
	public static void removeWhiteSpaces(String str)
	{
		char [] arr =str.toCharArray();
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]==' ')
			{
				for (int j = i; j < arr.length; j++) 
				{
					arr[j]=arr[j+1];
				}
			}
			System.out.println(arr[i]);
		}
	}
}