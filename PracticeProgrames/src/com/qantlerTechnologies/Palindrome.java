package com.qantlerTechnologies;

import java.util.Scanner;
public class Palindrome
{
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("input: ");
		String s1=s.next();
		char[] res= new char[s1.length()];
		int i= res.length-1;
			for(int j=0;j<=s1.length()-1;j++)
			{
			res[j] = s1.charAt(i);
			i--;
			}
			String o=res.toString();
			o="";
			for(int a=0; a<res.length; a++)
				o +=res[a];
			
			if(s1.equals(o))
				System.out.println("Palindrome");
			else
				System.out.println("Not Palindrome");
	}
}
