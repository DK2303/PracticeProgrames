package arrayPractice;

public class SortingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//? bubble sort
		
		int[] no={1,2,5,4,9,1,5,80,70,90,4,45,34};
		
		int temp=0;
		
		for(int i=0;i<no.length;i++){
			for(int j=i+1;j<no.length;j++){
				if(no[i]>no[j]){   //we changed < to > the result will come reverse.
					temp=no[i];
					no[i]=no[j];
					no[j]=temp;
				}
			}
		}
		for(int i=0;i<no.length;i++){
			System.out.print(no[i]+",");
		}
	}

}
