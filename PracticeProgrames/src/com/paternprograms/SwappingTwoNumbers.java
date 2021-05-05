package com.paternprograms;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5,b=6;
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println("a is="+a);
		System.out.println("b is="+b);
		
		//swapping two numbers without using 3rd variable.
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is="+a);
		System.out.println("b is="+b);
	}
	
}
