package com.paternprograms;

public class FindNumericInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="12345";
		boolean numeric = true;
		
		try{
			Integer number = Integer.parseInt(num);
		}catch (NumberFormatException e){
			numeric=false;
		}
		if(numeric)
			System.out.println(num +" is a Number");
		else
			System.out.println(num +" is not a number");

	}

}
