package com.qantlerTechnologies;

class Demo
{
	public static void main(String[] args)
	{
		int n =2; String no = "";
		
		int maxNumber=100;
		boolean flag = true;
		for(int i=1;i<=maxNumber;i++)
		{
			no=no+i+" ";
			for(int j=1;j<=n/2;j++){
				
			if(n%i==0)
			{
				no +=n;
				n++;
			}
			else
			{
				continue;				}
		}
		}
		System.out.println("Prime Numbers are: " +no+"  ");
	}
}