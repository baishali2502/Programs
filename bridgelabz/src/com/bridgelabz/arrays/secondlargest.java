package com.bridgelabz.arrays;

import java.util.*;

public class secondlargest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size :");
		int n = s.nextInt();
		System.out.print("Enter elements : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
        int ans = secLargest(arr);
        if(ans==Integer.MIN_VALUE)
        	 System.out.print("No second-largest element found");
        else
             System.out.print("Second largest element : "+ans);
	}

	private static int secLargest(int[] arr) 
	{
		int max = Integer.MIN_VALUE;
		int secmax = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			//if ith elem > max , arr[i] becomes the new max value
			//                    & secmax takes the value of prev max val
			if(arr[i]>max)
			{
				secmax = max;
				max = arr[i];
			}
			else if(arr[i]>secmax && arr[i]<max) //if arr[i] falls btw max & secmax,
			{                                    // we update secmax with arr[i]    
				secmax = arr[i];              
			}
		}
		if(secmax==max)
			return Integer.MIN_VALUE; // denotes no 2nd-largest value found
		else
		    return secmax;
	}

}
