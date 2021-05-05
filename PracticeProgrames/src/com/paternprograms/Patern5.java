package com.paternprograms;

public class Patern5 {
	public static void main(String args[]){
		for(int row=1;row<=5;row++){
			for(int clm1=1;clm1<row;clm1++){
				System.out.print(' ');
			}
			for(int clm2=5;clm2>=row;clm2--){
				System.out.print("*"); //Out put ***
				                               // **
				                               //  *
			}
			System.out.println();
		}
	}

}
