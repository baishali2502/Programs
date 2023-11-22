package com.bridgelabz.arrays;

import java.util.Scanner;

public class equalhalf {

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
        boolean ans = isequal(arr);
        if(ans)
          System.out.print("sum of 1st half = sum of 2nd half");
        else
        	System.out.print("sum of 1st half !=  sum of 2nd half");
	}

	private static boolean isequal(int[] arr) {
		int left =0;
		int right = 0;
		int i=0,j=arr.length-1;
		while(i<j)
		{
			left += arr[i];
			right += arr[j];
			i++;
			j--;
		}
		if(left==right)
			return true;
		else
		    return false;
	}

}
