package com.qantlerTechnologies;

public class FibonaciNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int fn;
		int temp=0;
		
		while(i<=100){
			fn=temp+i;
			if(fn>=100)
				break;
			else
				System.out.print(fn);
				System.out.print(",");
				i=temp;
				temp=fn;
		}

	}

}
