package com.paternprograms;

public class Patern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=3;row++){
			for(int clm1=2;clm1>=row;clm1--){
				System.out.print(" ");
			}
			for(int clm2=1;clm2<=row;clm2++){
				System.out.print(clm2);
			}
			System.out.println();
		}

	}

}
