package com.day2Practice;

public class DecimalToBinary {
	public static void main(String[] args){
		//decimal to binary
	String rem="";
	int no=10;
	while(no>0){
    rem=no%2+rem;
	no=no/2;
	}
	System.out.print(rem);

	}
	
}
