package com.day2Practice;

public class FindPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=12;
		boolean prime=true;
		int i;
		for(i=2;i<=no/2;i++){
			if(no%i==0)
				prime=false;
		}
		if(prime==true)
			System.out.println("Prime Number");
			else
				System.out.println("Not Prime Number");
		
	}
}