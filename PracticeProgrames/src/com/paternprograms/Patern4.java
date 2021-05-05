package com.paternprograms;

public class Patern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int row=1;row<=3;row++){
			for(int clm=3;clm>=row;clm--){
				System.out.print(clm);//we print row out put is 111 
				                                              //22
				                                              //3
				//Print clm 321
				          //32
				          //3
			}
			System.out.println();
		}

	}

}
