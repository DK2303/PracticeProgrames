package com.day2Practice;

public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int binary=10000;
		int dec=0;
		int count=0;
		int rem;
		while(binary>0){
			rem=binary%10;
			dec+=(rem*Math.pow(2, count));
			binary=binary/10;
			count++;
		}
		System.out.println(dec);

	}

}
