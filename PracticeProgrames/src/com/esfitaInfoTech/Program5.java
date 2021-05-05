package com.esfitaInfoTech;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Program5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList rd= new ArrayList();
		
		rd.add("Ram");
		rd.add("Kumar");
		rd.add("Ram");
		rd.add("Vinoth");
		
		String rs1 = rd.toString();
		
		System.out.println(rs1);
		
		LinkedHashSet<String> s=new LinkedHashSet<String>(rd);
		
		System.out.println(s);
		
		
		
		

	}

}
