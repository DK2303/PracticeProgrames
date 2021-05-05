package com.qantlerTechnologies;

public class PrintPrimeNumber1to100 {
	public static void main(String[] args){
		int i;
		int maxCheck=100;
		
	boolean isPrime=true;
	String primeNumberFound="";
	
	for(i=1; i<=maxCheck;i++){
		isPrime=CheckPrime(i);
		if(isPrime){
			primeNumberFound=primeNumberFound+i+" ";
		}
	}
		System.out.println("Prime Number From 1 to "+maxCheck+" are:");
		System.out.println(primeNumberFound);
	}

	public static boolean CheckPrime(int numberToCheck) {
		// TODO Auto-generated method stub
		int remainder;
		for(int i=2; i<=numberToCheck/2;i++){
			remainder=numberToCheck%i;
			if(remainder==0){
				return false;	
			}
		}
		return true;
		
	}

}
