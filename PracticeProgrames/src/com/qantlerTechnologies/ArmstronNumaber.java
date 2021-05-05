package com.qantlerTechnologies;

public class ArmstronNumaber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=0,a,temp;
		int n=153;
		temp=n;
		while(n>0){
			a=n%10;
			c+=a*a*a;
			n=n/10;
		}
		if(temp==c)
			System.out.println("Armstrong Number: "+c);
		else
			System.out.println("Not Armstrong Number: "+c);

	}

}
