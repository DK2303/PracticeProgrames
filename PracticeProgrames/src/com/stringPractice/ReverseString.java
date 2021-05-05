package com.stringPractice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String ip ="DINESH";
		String ip1="Kumar";
		String ip2="Dinesh";
		String ip3="dinesh";
		
		
		String  op1 =ip.replace('D', 'A');
		
		String  op2 =ip.replace('A', 'D');
		
		boolean op3 =ip.equals(ip3);
		
		boolean op4 =ip.equalsIgnoreCase(ip3);
		
		char    op5 =ip.charAt(0);
		
		int     op6 =ip.compareTo(ip1);
		
		String  op7 =ip.toLowerCase();
		
		String  op8 =ip3.toUpperCase();
		
	
		
		
		
		String p="";	
		for(int i=ip.length()-1;i>=0;i--){
			p+=ip.charAt(i);
			
		}
		
		System.out.println(op1);
		System.out.println(op2);
		System.out.println(op3);
		System.out.println(op4);
		System.out.println(op5);
		System.out.println(op6);
		System.out.println(op7);
		System.out.println(op8);
		System.out.println(p);
	}

}
