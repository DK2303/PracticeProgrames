package com.esfitaInfoTech;

import java.util.Scanner;

public class Program6 {

	public static void main(String[] args) {
		//8 TODO Auto-generated method stub
		
		//?6)Check if a given integer is odd or even.
		
		int n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number you want to check: ");
		n = s.nextInt();
		if(n % 2==0){
			System.out.println("The Given Number "+n+" is Even");
		}
		else{
			System.out.println("The Given Number "+n+" is odd");
		}
		
		

	}

}
