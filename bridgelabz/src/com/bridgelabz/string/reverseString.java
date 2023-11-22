package com.bridgelabz.string;
import java.util.*;
public class reverseString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter string : ");
		String str = s.next();
		String rev = reverse(str);
		System.out.print("Reverse string : "+rev);

	}

	private static String reverse(String str) {
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		return rev;
	}

}
