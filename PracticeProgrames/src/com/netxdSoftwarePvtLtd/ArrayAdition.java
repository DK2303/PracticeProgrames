package com.netxdSoftwarePvtLtd;

public class ArrayAdition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] no={1,2,3,4,5};
		
		int temp=0;
		
		for(int i=0;i<no.length;i++){
			for(int j=0;j<no.length;j++){
				if(no[i]==no[j])
					continue;
				else
					temp+=no[j];
			}
			System.out.println(temp);
			temp=0;
		}

	}

}
