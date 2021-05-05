package com.qantlerTechnologies;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//?4)Write a Program to Generate Fibonacci Series.
		
		int i=1;
		int fibonacciNumber=1;
		int temp=0;
		while(i<=100){
		 fibonacciNumber=temp+i;
		if(fibonacciNumber>=100)
			break;
		else
		System.out.print(fibonacciNumber);
		System.out.print(",");
		i=temp;
		temp=fibonacciNumber;
		 }
		
			
		}

	}

