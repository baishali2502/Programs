package com.bridgelabz.basicprograms;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number :");
		int n = s.nextInt();
		boolean ans = isPal(n);
		if(ans)
		  System.out.print("Palindrome");
		else
			System.out.print("Not Palindrome");

	}

	private static boolean isPal(int n) {
		int original = n;
		int revnum=0;
		
		while(n>0)
		{
			int rem = n%10;
			revnum = revnum*10+rem;
			n = n/10;
		}
		if(revnum==original)
			return true;
		else
		    return false;
	}

}
