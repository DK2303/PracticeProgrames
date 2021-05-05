package com.netxdSoftwarePvtLtd;

public class PatternProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// pattern  01010
		//          10101
		//          01010
		//          10101
		//          01010
		
		for(int i=0;i<2;i++){
			for(int j=5;j>0;j--){
				if(j%2!=0)
					System.out.print("0");
				else
					System.out.print("1");
			}
			System.out.println();
			for(int k=5;k>0;k--){
				if(k%2!=0)
					System.out.print("1");
				else
					System.out.print("0");
				
			}
			System.out.println();
		}
       System.out.println("01010");
	}

}
