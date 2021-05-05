package com.netxdSoftwarePvtLtd;

public class Palindrome1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=454;
		int no1=no;
		int rem;
		String no2="";
		
		for(int i=0;i<=2;i++){
			rem=no%10;
			no2+=rem;
			no=no/10;
		}
		System.out.println(no2);
		Integer op=Integer.parseInt(no2);
		if(no1==op)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not Palindrome Number");
			

	}

}
