package com.paternprograms;

public class Patern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1; row<=3;row++){
		for(int space1=1;space1<row;space1++){
			System.out.print("  ");
		}
		for(int no3=3;no3>=row;no3--){
		System.out.print(" *");
	}
	for(int no4=2;no4>=row;no4--){
		System.out.print(" *");
	}
	
	System.out.println();
		}
}


	}


