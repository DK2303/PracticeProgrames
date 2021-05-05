package com.qantlerTechnologies;

public class FindDuplicateNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//9)? Write a Program to find duplicate number in a given array.{2,3,5,2,6,7,6}
		
		int[] num={2,3,5,2,6,7,6};
		
		for(int i=0;i<num.length;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]==num[j])
				System.out.println(num[j]);
			}
		}
	}

}
