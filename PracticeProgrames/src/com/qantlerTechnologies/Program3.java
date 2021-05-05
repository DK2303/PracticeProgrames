package com.qantlerTechnologies;

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Input:  ");
		String s1 = s.nextLine();
		String[] arr = s1.split(" ");
		int[] in = new int[arr.length];
		int i=0;
		while(i<in.length)
		{
			in[i] = Integer.parseInt(arr[i]);
			i++;
		}
		
		for(int j=0; j<in.length; j++)
		{
			for(int k=j+1; k<in.length; k++)
			{
				if(in[j]<in[k])
				{
					int temp = in[j];
					in[j] = in[k];
					in[k] = temp;
				}
			}
		}
		for(int o=0; o<in.length; o++)
		{
			System.out.print(in[o]+" ");
		}
	}

}
