package com.esfitaInfoTech;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Input Value is: ");
		a = sc.nextInt();
		
		for(int i=1; i<=a; i++){
			for(int j=1; j<=i; j++){
			if(i%2==0)
				System.out.print("");
			else
				System.out.print("*");
			}
			System.out.println();
	}
	}
}


