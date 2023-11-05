package com.qa.java_day11;

public class Practice_parameterization {

	public static void main(String[] args) {
		// TODO Auto-generated method stu		
		addingTwoInt(30,40);
		check("Automation",1, true);
		parametersFour("aaaa", "bbbb", "cccc", "dddd");
	}
	//three parameter
	public static String check (String S1, int i, boolean b1) {
	System.out.println();	
	System.out.println();	
	System.out.println();
	return S1;
	//a method cannot have more than one method

		
	}
public static int addingTwoInt (int i, int j) {
	
	int k= i+j;
	System.out.println(k);
	return k;}
	

public static void parametersFour(String S1, String S2, String S3, String S4) {
 String S5 = S1+S2+S3+S4;
 System.out.println(S5);

}


}
