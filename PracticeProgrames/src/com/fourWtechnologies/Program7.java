package com.fourWtechnologies;

public class Program7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//7)? merge 2 sorted integer array in to 1 array without duplicates.
		
		int[] a={1,3,4,5};
		int[] b={1,2,3,4,5,6};
		
		int[] res=new int[a.length+b.length];
		int count=0;
		
		for(int i=0;i<a.length;i++){
			res[i]=a[i];
			count++;
		}
		for(int j=0;j<b.length;j++){
			res[count++]=b[j];
		}
		
			for(int k=0;k<res.length;k++){
				System.out.print(res[k]+",");
			}
			for(int m=0;m<res.length;m++){
				for(int r=m+1;r<res.length;r++){
					if(res[m]>res[r]){
					int temp=res[r];
					res[r]=res[m];
					res[m]=temp;
					}
				}
			}
			System.out.println();
			for(int n=0;n<res.length;n++){
				int p;
				for(p=0;p<n;p++)
					if(res[n]==res[p])
						break;
					if(n==p)
						System.out.print(res[n]+",");
				}
		}
	}



