package arrayPractice;

import java.util.Arrays;

public class SecondSmallNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] no={10,23,88,5,44,3,2,22};
		
		System.out.println(getSecondSmallest(no,no.length));
	}
	public static int getSecondSmallest(int[] no,int total){
		Arrays.sort(no);
		return no[1];
	}}	
		//int min1=0;
		//int min2=0;
		
		
		
		//for(int i=0;i<no.length;i++){
			//for(int j=0;j<no.length;j++){
				//if(no[i]<no[j]){
					//min2=min1;
					//min1=no[i];
					
				//}
				//else if(min2>no[j]){
					//min2=no[j];
				//}
			//}
			
		//}
		//System.out.println(min2);
		

	//}

//}
