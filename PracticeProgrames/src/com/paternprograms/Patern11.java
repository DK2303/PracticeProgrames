package com.paternprograms;

public class Patern11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=i;j++){
				if(i%2==0)
					System.out.print("@");
				else
					System.out.print("$");
			}
			System.out.println();
	}

}
}
