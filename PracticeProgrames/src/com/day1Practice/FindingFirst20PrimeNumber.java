package com.day1Practice;

public class FindingFirst20PrimeNumber {
	public static void main(String[] args){
		int count=0;
		int value=1;
		while(count<=10)
		{
			int no=value;
			boolean prime=true;
			for(int i=3; i<=no/2; i++){
				if(no%i==0){
					System.out.println("Not a Prime:"+no);
					prime=false;
					break;
				}
			}
				if(prime==true){
					System.out.println("Prime:"+no);
					count++;
				}
			value=value+2;
		}
	}
}
