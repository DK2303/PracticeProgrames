package arrayPractice;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] no={10,2,5,9,11,22,1,2,3,4,5,6,7,8,9};
		
		int n=no.length;
		
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(no[j]>no[j+1]){
					
					int temp=no[j];
					no[j]=no[j+1];
					no[j+1]=temp;
				}
			}
		}
		for(int i=0;i<no.length;i++){
			System.out.print(no[i]+",");
		}

	}

}
