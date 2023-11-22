package com.bridgelabz.algo;
import java.util.*;

public class binarysearch {

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
		System.out.print("Enter element to be searched : ");
		int elem = s.nextInt();
		int pos = binarysearch(arr,elem,0,arr.length-1);
        if(pos==-1)
        	System.out.print("Element not found");
        else
        	System.out.print("Element found at index = "+pos);
	}

	private static int binarysearch(int[] arr,int elem,int i,int j) 
	{
		if(i<=j) {
		   int mid = (i+j)/2;
		   if(arr[mid]==elem)
			return mid;
		   else if(arr[mid]<elem)
			return binarysearch(arr,elem,mid+1,j);
		   else
			return binarysearch(arr,elem,i,mid-1);
		}
		else
			return -1;		
	}

}
