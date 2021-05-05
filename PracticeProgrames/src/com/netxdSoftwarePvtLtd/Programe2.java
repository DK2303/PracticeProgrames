package com.netxdSoftwarePvtLtd;

public class Programe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2)? please multiple the given number using power 3    No-123.
		
		int no=123;
		int rem;
		int cubetotal=0;
		int total=0;
		
		while(no>0){
			rem=no%10;
			cubetotal+=rem*rem*rem;
			total+=rem;
			no=no/10;
		}
		System.out.println((cubetotal+total)*(cubetotal+total)*(cubetotal+total));
	}

}
