package com.netxdSoftwarePvtLtd;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=545;
		int no5=no;
		int no4=no;
		int test=0;
		int count=0;
		while(no4!=0){
			no4=no4/10;
			++count;
		}
		System.out.println(count);

		String no1="";
		for(int i=1;i<=count;i++){
			test=no%10;
			no1+=test;
			no=no/10;

		}
		System.out.println(no1);
		Integer op=Integer.parseInt(no1);
		System.out.println(op);
		
		if(op==no5)
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		
		
		int[] no2={1,2,3,4,5,6,7,8};
		String no3="";
		for(int i=no2.length-1;i>=0;i--){
			no3+=no2[i];
		
		}
		System.out.println(no3);
		
		                                                                                                                    
			}

}
