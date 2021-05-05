package arrayPractice;

import java.util.Scanner;

public class ArrayStudentMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int[] mark = new int[5];
		
		
		for(int i=0; i<=mark.length-1; i++){
			Scanner sc = new Scanner(System.in);
			System.out.println("Student Mark = ");
			int ip=sc.nextInt();
			mark[i]=ip;	
		}
		System.out.println("Student marks are= ");
		for (int j=0;j<=mark.length-1;j++){
			System.out.println( mark[j]);
		}
		

	}

}
