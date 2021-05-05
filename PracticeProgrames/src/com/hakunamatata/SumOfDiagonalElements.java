package com.hakunamatata;

public class SumOfDiagonalElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1)Sum of diagonal elements {123}
		//                           {456}
		//                           {789}
		
		int[][] no={{1,2,3},
				    {4,5,6},
				    {7,8,9}};
		
		int v1=0; int v2=0;
		int n=3;
		int total=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j)
					v1+=no[i][j];
				if(i==n-j-1)
					v2+=no[i][j];
			}
		}
		total=v1+v2;
		System.out.println(total);

	}

}
