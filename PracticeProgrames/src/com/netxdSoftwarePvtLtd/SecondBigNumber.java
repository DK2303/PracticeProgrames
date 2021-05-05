package com.netxdSoftwarePvtLtd;

public class SecondBigNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] no={10,22,56,78,34,22,11,100};
		
		int m1=0;int m2=0;
		for(int i=0;i<=no.length-1;i++){
			if(m1<no[i]){
				m2=m1;
				m1=no[i];
			}
			else if(m2<no[i]){
				m2=no[i];
			}
		}
		System.out.println(m2);
	}

}
