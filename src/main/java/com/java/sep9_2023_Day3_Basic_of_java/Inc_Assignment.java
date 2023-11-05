package com.java.sep9_2023_Day3_Basic_of_java;

public class Inc_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =2;
		int b = a-- - --a + a++ + ++a;
				
		//a=2, //b=2.... 
		//a=1, b 2
		//a=0..a=1
		//a=1
		//1+0+1+o
		//b=2 -0+0+0+1=3
		//a=1,0,1,0,1
		
		int i=10;
		int j= i--;
		int k= --i + j++;
		int l= i-- - --k - --j + j++;
		
		//i=10 9 8
		//j=10
		//k=8+ 11
		
		//l=7-18-9+8+9
				
	
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		
	}

}
