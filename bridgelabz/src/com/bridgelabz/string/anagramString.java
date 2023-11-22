package com.bridgelabz.string;
import java.util.*;

public class anagramString {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("Enter String-1 : ");
        String str1 = s.next();
        System.out.print("Enter String-2 : ");
        String str2 = s.next();
        boolean ans = isAnagram(str1,str2);
        if(ans)
        	System.out.print("Anagram of each other");
        else
        	System.out.print("Not anagram of each other");
        
	}

	private static boolean isAnagram(String str1, String str2) {
		if(str1.length()!=str2.length())
			return false;
		// freq table for str1
		TreeMap<Character,Integer> map1 = new TreeMap<>();
		for(int i=0;i<str1.length();i++)
		{
			char key = str1.charAt(i);
			if(map1.containsKey(key))
				map1.put(key,map1.get(key)+1);
			else
				map1.put(key,1);				
		}
		// traverse through each char in the string str2 , 
        // if , the char is present in the freq table then dec the corresponding val of the char 
		for(int i=0;i<str2.length();i++)
		{
			char key = str2.charAt(i);
			if(map1.containsKey(key))
				map1.put(key,map1.get(key)-1);
			else
				return false;				
		}
		// we take the list of freq in the freq-table
        // if, any value is found != 0 , then we return false
        for(Integer val : map1.values())
        {
            if(val!=0)
              return false;
        }
        return true;
	}

}
