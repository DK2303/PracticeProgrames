package com.paternprograms;

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findFactorial(6));

	}
	private static int findFactorial(int no){
		if(no==0)
			return 1;
		else{
			System.out.println(no);
			return no*findFactorial(no-1);
		}
	}
	
}
