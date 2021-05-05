package com.esfitaInfoTech;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//?2)how to check if a string contains only digits....
		
		String num="12345";
		boolean numeric = true;
		
		try{
			Integer number = Integer.parseInt(num);
		}
		catch (NumberFormatException e){
			numeric=false;
		}
		if(numeric==true)
			System.out.println(num +" :is a Number");
		else
			System.out.println(num +" :is not a number");


	}

}
