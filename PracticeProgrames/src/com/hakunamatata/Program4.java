package com.hakunamatata;

import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("The Input Is: ");
		int ip=sc.nextInt();
		String res=Integer.toBinaryString(ip);
		System.out.println(res);
		
		String res1=Integer.toHexString(ip);
		System.out.println(res1);
		
		String res3=Integer.toOctalString(ip);
		System.out.println(res3);

	}

}
