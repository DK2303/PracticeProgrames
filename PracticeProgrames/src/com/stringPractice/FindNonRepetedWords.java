package com.stringPractice;

public class FindNonRepetedWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Java Programe";
		
		for(int i=0;i<s.length();i++){
			boolean flag=true;
			for(int j=0;j<s.length();j++){
				if(i!=j&&s.charAt(i)==s.charAt(j)){
					flag=false;
					break;}
							}
			if(flag){
				System.out.print(s.charAt(i)+" ");
			}
			
		}
		


	}

}
