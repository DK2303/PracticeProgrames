package arrayPractice;

public class RemovingDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a={7,3,1,5,1,13,10,3};
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j])
					a[j]=0;
			}
		}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]);
			System.out.print(",");
		}
	}

}
