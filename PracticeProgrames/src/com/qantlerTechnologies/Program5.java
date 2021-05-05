package com.qantlerTechnologies;

import java.util.Scanner;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//?5)Write a Program to get the input from user
		//   and check if the user input is palindrome.
		Scanner sc = new Scanner(System.in);
System.out.println("Input : ");	
		String ip = sc.next();
		int no=Integer.parseInt(ip);
	int no2=no;
	int rem=0;
	while(no>0){
		rem=(rem*10)+no%10;
		no=no/10;
	}
	System.out.println(rem);
	if(no2==rem){
		System.out.println("Palindrome");
	}
	else
		System.out.println("Not Palindrome");

	}

}