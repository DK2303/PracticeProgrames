package com.whirldData;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Given Number Is: ");
		int n=sc.nextInt();
		
		int f=0;
		int s=1;
		int t;
		for(int i=n;i>=0;i--){
		for(int j=i;j<=n;j++){
			System.out.print(f+" ");
			t=f+s;
			f=s;
			s=t;
		}
		System.out.println();
		}
	}

}
