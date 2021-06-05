package com.nikhil.interviewprogramm;

public class ScondLargestNumber 
{
	public static void main(String[] args) 
	{
		int temp;
		int [] arr = {10,20,30,40,50};
		for (int i = 0; i < arr.length; i++) 
		{
			for (int j = i+1; j < arr.length; j++) 
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Second Latgest Number int the Array is " +arr[arr.length-2]);
	}
}