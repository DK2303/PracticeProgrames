package com.day2Practice;

public class CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1010;
		int count=0;
		while(no>0){
			no=no/10;
			count++;
			//System.out.println(cod);
		}
		System.out.println(count);

	}

}
