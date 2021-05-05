package com.esfitaInfoTech;

public class Program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		int toFind = 100;
		boolean found = false;
		
		for (int n : num){    //For each loop
			if(n == toFind){
				found=true;
				break;
			}
		}
		if(found)
			System.out.println(toFind + " is Found");
		else
			System.out.println(toFind + " is Not Found");

	}

}
