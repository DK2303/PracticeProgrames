package com.netxdSoftwarePvtLtd;

public class PatternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Pattern       4
		//              34
		//             234
		//            1234
		
		for(int i=4;i>0;i--){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int k=i;k<=4;k++){
			System.out.print(k);	
			}
			System.out.println();
		}

	}

}
