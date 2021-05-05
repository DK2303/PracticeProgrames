package com.paternprograms;

public class MaxPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=123456789;
		
		int temp=0; int temp1=0; int rem;
		
		while(no>0){
			rem=no%10;
			
			for(int i=2;i<=rem/2;i++){
				if(rem%i==0)
					break;
				else
					temp1=temp;
				    temp=rem;
			}
			no=no/10;
		}
		if(temp1<temp)
			temp1=temp;
		System.out.println(temp1);

	}

}
