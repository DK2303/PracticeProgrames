package com.stringPractice;

public class StringPractice {
	public static void main(String[] args){
		String s="HelloWorld Hi";
		String s1="HelloWorld";
		String s2="hellofriend hi i am dinesh";
		char[] a= new char[s1.length()];
		for(int i=0;i<s1.length();i++){
			a[i]=s1.charAt(i);
		if(a[i]>=a[3] && a[i]<=a[6]){
			//System.out.print(a[i]);
		}
		}
				
			System.out.println(s.substring(3, 7));
			System.out.println(s.substring(5));
			
			System.out.println(s.compareTo(s1));
			System.out.println(s.compareToIgnoreCase(s2));
			
			System.out.println(s.startsWith("Hello"));
			
			System.out.println(s2.endsWith("dinesh"));
			
			System.out.println(s2.indexOf("am"));
			
			System.out.println(s2.indexOf(0, 10));
		
	}
}
