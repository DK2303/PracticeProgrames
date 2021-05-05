package com.esfitaInfoTech;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//?3)write a program to determine whether two matrices are equal or not...
		
		//int row1,col1,row2,col2;
		boolean flag=false;
		boolean flagrow=false;
		int a[][]={ 
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		int b[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		//row1=a.length;
		//col1=a[0].length;
		
		//row2=b.length;
		//col2=b[0].length;
		
		//if(row1 !=row2 || col1 !=col2){
			//System.out.println("matrices are not equal");
		if(a.length==b.length)
		{
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i][j] == b[i][j])
					{
						flag=true;
					}
					else{
						flag=false;
						break;
					}
						
				}
				}
		}
		else
		{
			flagrow = true;
		}
		if(flagrow==true)
		{
			System.out.println("rows are not equal");
			if(flagrow!=true)
				System.out.println("Matrices are Not equal");
		}
		if(flag==true)
			System.out.println("Matrices are equal");
	}

}
