package com.java.sep16_23_day5;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	print1to100();
		//print100to1();
		//print5to495inmultiplesof10andaddtheMultiples();
		printfirst20multipleof9andaddthosemultiples();
		
}
	
public static void print1to100() {
for (int i=1; i<=100; i++) {
	
System.out.println(i + "");
	
}
}

public static void print100to1() {
	int sum = 0;
for (int i=100; i>=1; i--) {
	
System.out.println(i + "");
sum= sum+1;	
}	
System.out.println("sum from 100 to 1 is: " + sum);}


public static void print5to495inmultiplesof10andaddtheMultiples() {
	int sum = 0;
	for(int i=5; i<=495; i=i+10) {
	System.out.println(i);	
	sum = sum+i;
	}
	System.out.println("the sum is "+sum);
		
		
	}
	


public static void printfirst20multipleof9andaddthosemultiples() {
	int sum = 0;
for (int i=9; i<=9*20; i=i+9) {
	
System.out.println(i + "");
sum= sum+i;	


}	
System.out.println("the sum is "+sum);		
		
	}}

