package com.paternprograms;

public class Patern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=3;row++){
			for(int space=4;space>=row;space--){
				System.out.print(" ");
			}
			for(int no1=1;no1<=row;no1++){
				System.out.print("*");
			}
			for(int no2=1;no2<row;no2++){
				System.out.print("*");
			}
			System.out.println();
			}
		
		for(int row1=1;row1<=3;row1++){
			for(int space1=0;space1<=row1;space1++){
				System.out.print(" ");
			}
			for(int no3=3;no3>=row1;no3--){
			System.out.print("*");
		}
		for(int no4=2;no4>=row1;no4--){
			System.out.print("*");
		}
		System.out.println();
		}
	}
}
	
			

			
			
	

	

