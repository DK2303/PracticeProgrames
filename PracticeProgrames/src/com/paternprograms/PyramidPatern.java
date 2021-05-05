package com.paternprograms;

public class PyramidPatern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<5;i++){
			for(int j=5-i;j>1;j--){
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i=4;i>0;i--){
			for(int j=i;j<=4;j++){
				System.out.print(" ");
			}
			for(int k=i;k>0;k--){
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
