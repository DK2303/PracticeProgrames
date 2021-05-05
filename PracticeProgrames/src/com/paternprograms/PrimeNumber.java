package com.paternprograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=7;
		int i=2;
		boolean prime=true;
		while(i<num){
			if(num%i==0)
			prime=false;
			i=i+1;
		}
		if(prime){
			System.out.println(i+" "+"is Prime Number");}
		else{
			System.out.println(i+" "+"is Not A Prime Number");
		}
		
	}

}
