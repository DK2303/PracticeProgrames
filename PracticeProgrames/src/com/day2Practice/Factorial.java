package com.day2Practice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=5;
		int fact;
		fact=no;
		while(no>1){
			no--;
			fact=fact*no;
		}
		System.out.println(fact);

	}

}
