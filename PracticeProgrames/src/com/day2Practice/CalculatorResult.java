package com.day2Practice;

public class CalculatorResult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator res=new Calculator();
		int a=res.add(20, 40);
		float b=res.div(140, 20);
		int c=res.sub(50, 20);
		long d=res.mul(100, 1000);
		
		System.out.println("Total Add value is: "+a);
		System.out.println("Total Sub Value is: "+c);
		System.out.println("Total Mul Value is: "+d);
		System.out.println("Total Div Value is: "+b);
		
	}

}
