package com.hakunamatata;

import java.util.Scanner;

public class ConvertNumberToWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//4)?- Input- 4158, OutPut-four thousand one hundred fifty eight.
		Scanner sc=new Scanner(System.in);
		System.out.println("Input Number Is: ");
		
		long ip=sc.nextLong();
		
		long no=ip;
		
		System.out.printf(convertToWords(no));
		
		}	
	static String[] one={"","One ", "Two ", "Three ", "Four ", "Five ",
			             "Six ", "Seven ", "Eight ", "Nine ", "Ten ", "Eleven ",
			             "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ",
			             "Seventeen ", "Eighteen ", "Nineteen "};
	
	static String[] ten={"", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ",
			      "Seventy ", "Eighty ", "Ninety "};
	
	
	static String numToWords(int no, String s){
		String str=" ";
	if(no>19){
		str += ten[no/10]+one[no%10];
	}
	else{
		str += one[no];
	}
	
	if(no!=0){
		str +=s;
	}
	return str;
	}
	
	static String convertToWords(long no){
	String out="";
	
	out +=numToWords((int)(no/10000000),"crore ");
	
	out +=numToWords((int)((no/100000)%100),"lakh ");
	
	out +=numToWords((int)((no/1000)%100),"thousand ");
	
	out +=numToWords((int)((no/100)%10),"hundred ");
	
	if(no>100 && no%100>0){
		out +="and ";
	}
	out +=numToWords((int)(no%100)," ");
	return out;
	
	}
}


