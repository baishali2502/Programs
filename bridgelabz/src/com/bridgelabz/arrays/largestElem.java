package com.bridgelabz.arrays;
import java.util.*;

public class largestElem {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("Enter size :");
		int n = s.nextInt();
		System.out.print("Enter elements : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int ans = maxElem(arr);
		System.out.print("Largest elem : "+ans);
	}

	public static int maxElem(int[] arr) {
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			max = Math.max(max,arr[i]);
		}
		return max;
	}

}
