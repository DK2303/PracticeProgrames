package com.esfitaInfoTech;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//?1)find the string count of upper,lower,special,digit...
		
       String ip1="DINESH2212@gmail.com";
		
		int upper=0, lower=0, number=0, special=0;
		
		for(int i=0; i<ip1.length(); i++){
			char ch=ip1.charAt(i);
			if(ch >='A' && ch<='Z')
				upper++;
			else if(ch>='a' && ch<='z')
				lower++;
			else if(ch>='0' && ch<='9')
				number++;
			else
				special++;
		}
		System.out.println("Lower case letters: " +lower);
		System.out.println("Upper case letters: " +upper);
		System.out.println("Number : " +number);
		System.out.println("Special characters: " +special);


	}

}
