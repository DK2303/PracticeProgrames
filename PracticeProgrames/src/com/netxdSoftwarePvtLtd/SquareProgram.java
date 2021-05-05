package com.netxdSoftwarePvtLtd;

public class SquareProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no=1234;
		int res=0;
		int rem;
		while(no>0){
			rem=no%10;
			res+=rem*rem;
			no=no/10;
		}
		System.out.println(res);
	}

}
//   4*4=16
//   3*3=9
//   2*2=4
//   1*1=1
//----------------
//total=30