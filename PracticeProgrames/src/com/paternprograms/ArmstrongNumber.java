package com.paternprograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Input:");
		String ip=sc.next();
		int no=Integer.parseInt(ip);
		int no2=no;
		int arm=0;
		while(no>0){
			int rem=no%10;
			arm=arm+(rem*rem*rem);
			no=no/10;
		}
		System.out.println(arm);
	if(no2==arm)
		System.out.println("Armstrong Number");
	else
		System.out.println("Not Armstrong Number");
	}

}
