package com.fourWtechnologies;

public class StringContainsOnlyInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String no="12345";
		boolean flag=false;
		try{
			Integer no1=Integer.parseInt(no);
			flag=true;
		}
		catch(Exception e){
		System.out.println("Exception");
		}
		if(flag==true)
			System.out.println("Given Number is Integer");
		else
			System.out.println("Given Number is Not Integer");

	}

}
