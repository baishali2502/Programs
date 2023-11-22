package com.bridgelabz.basicprograms;
import java.util.*;

public class fibonacci {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = s.nextInt();
		System.out.println("First "+n+" nos. of fibonacci series : ");
		int nthfib = fibseries(n);
        System.out.print("\nHence,"+n+"th fibonacci number : "+nthfib);
	}

	private static int fibseries(int n) {
		int[] f = fib(n);
		for(int i=0;i<n;i++)
		{
			System.out.print(f[i]+" ");
		}
		
		return f[n-1];
	}
	static int[] fib(int n)
    {
        int f[] = new int[n];
        f[0] = 0;
        f[1] = 1;
 
        for (int i = 2; i < n; i++) 
        {
            f[i] = f[i - 1] + f[i - 2];
        }
 
        return f;
    }

}
