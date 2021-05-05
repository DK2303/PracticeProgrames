package com.stringPractice;

public class StringBufferPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer("Java Program");
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.reverse());
		
		System.out.println(sb.insert(4, " is my favorete"));
		
		System.out.println(sb.append(" as well"));
		
		System.out.println(sb.append(" i am so Happy"));
		
		System.out.println(sb.replace(8, 19, "easy"));
		
		System.out.println(sb.deleteCharAt(3));
		
		System.out.println(sb.delete(7, 12));

	}

}
