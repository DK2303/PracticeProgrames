package com.stringPractice;

import java.io.*; 
import java.util.*;

public class StringProgram {
		
		    public static void process(String[] arr) {
		        System.out.println(Arrays.toString(arr));
		    }

		    public static void main(String[] args) {
		    	String s="";
		        Scanner scanner = new Scanner(System.in);
		        System.out.println("Input : ");
		        int n = Integer.parseInt(scanner.nextLine());
		        String[] arr = new String[n];
		        for (int i = 0; i < n; i++) {
		        	System.out.println("Enter the Input: ");
		            String str = scanner.nextLine();
		            arr[i] = str;	
		            }
		        for(int j=0;j<arr.length;j++){
		        	for(int k=j+1;k<arr.length;k++){
		        	if(arr[j].equals(arr[k]))
		        	s=arr[j];
		        	}
		        	
		        }   
		        System.out.println(s);
		        process(arr);
		    }
}
