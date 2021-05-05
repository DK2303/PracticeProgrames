package com.fourWtechnologies;

public class DistinctElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={1,2,3,4,5,2,4,6};
		for(int i=0;i<a.length;i++){
			int j;
			for(j=0;j<i;j++)
				if(a[i]==a[j])
					break;
				if(i==j)
					System.out.print(a[i]+",");
			}
		}

	}


