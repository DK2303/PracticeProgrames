package com.fourWtechnologies;

public class CheckGivenNumberIsBinaryNumberOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int binary=10101;
		boolean flag=true;
		
		while(binary!=0){
			if(binary%10>1){
				flag=false;
			}
			binary=binary/10;
		}
		if(flag)
			System.out.println("Given Number is Binary");
		else
			System.out.println("Given Number is Not Binary");

	}

}
