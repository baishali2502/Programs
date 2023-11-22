package com.bridgelabz.basicprograms;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = s.nextInt();
		boolean ans = isPrime(num);
		if(ans)
			System.out.print("Prime No.");
		else
			System.out.print("Not Prime No.");

	}

	private static boolean isPrime(int num) 
	{
		if(num==2)
			return true;
		
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
				return false;
		}
		
		return true;
	}

}
