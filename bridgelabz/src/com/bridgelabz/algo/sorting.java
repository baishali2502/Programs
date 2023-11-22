package com.bridgelabz.algo;

import java.util.Scanner;

public class sorting {

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
		System.out.print("Sorting algos :\n1.Bubble sort\n2.Selection sort\n3.Insertion sort\nChoose: ");
		int choice = s.nextInt();
		if(choice==1)
			bubble(arr);
		else if(choice==2)
			selection(arr);
		else
			insertion(arr);
		System.out.print("Sorted array : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

	private static void insertion(int[] arr) {
		int size = arr.length;

	    for (int i = 1; i < size; i++) {
	      int key = arr[i];
	      int j = i - 1;

	      // Compare key with each element on the left of it until an element smaller than
	      // it is found.
	      // For descending order, change key<array[j] to key>array[j].
	      while (j >= 0 && key < arr[j]) {
	    	  arr[j + 1] = arr[j];
	          j--;
	      }

	      // Place key at after the element just smaller than it.
	      arr[j + 1] = key;
	    }
		
	}

	private static void selection(int[] arr) {
		for(int i=0;i<arr.length-1;i++)
		{
			int minIndex = i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
					minIndex = j;
			}
			//swap
			int temp = arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex] = temp;
		}
		
	}

	private static void bubble(int[] arr) {
		int n = arr.length;
		int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                     
                    // Swap arr[j] and arr[j+1]
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
 
            // If no two elements were
            // swapped by inner loop, then break
            if (swapped == false)
                break;
        }
		
	}

}
