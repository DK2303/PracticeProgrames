package com.day2Practice;

public class PrimeNumbersInFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0,n2=1,n3=0,count=10;
		String n4="";
		try{for(int i=0;i<count;i++){
			n3=n1+n2;
			n4+=n3;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;		
		}
		
		Integer n5=Integer.parseInt(n4);
		for(int j=3;j<n5/2;j++){
			if(n5%j!=0)
				System.out.print(n5);
		}
		}
		catch(Exception e){
			System.out.println();
		}
		}
		

	}


