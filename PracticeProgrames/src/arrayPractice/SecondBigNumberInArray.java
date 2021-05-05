package arrayPractice;

public class SecondBigNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num={10,11,6,7,5,15,2,3,4,12};
		int m1=0, m2=0;
		for(int i=0;i<=num.length-1;i++){
				if(m1<num[i]){
					m2=m1;
					m1=num[i];
				}
				else if(m2<num[i]){
					m2=num[i];
				}
				
			}
		System.out.println(m2);
					
		}
	}
	
	


