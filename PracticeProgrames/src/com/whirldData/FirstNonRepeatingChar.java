package com.whirldData;

public class FirstNonRepeatingChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sometimes";
		for(int i=0;i<s.length();i++){
			boolean unique=true;
			for(int j=0;j<s.length();j++){
				if(i!=j&&s.charAt(i)==s.charAt(j)){
					unique=false;
					break;
				}
			}
			if(unique){
				System.out.println(s.charAt(i));
				break;
			}
			}
		
		}
}

