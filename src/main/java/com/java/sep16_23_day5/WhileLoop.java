package com.java.sep16_23_day5;

public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print1to10();
		//print10to1();
		//print1to10AndAdd1to10 ();
		//print5to100inthemultiplesof5Andaddthosemulttiples() ;
		printfirst20multipleof9andaddthosemultiples();
	}

	
	public static void print1to10() {
		int i= 1;
		while (i<=10) {
	System.out.println(i);
	i++;
					
	}}
		
		public static void print10to1 () {
			
			int j=10;
			while (j>=1) {
			System.out.println(j);
			j--;

			;}
			
			
		}
			
		
		
		
		
		
		
		public static void print1to10AndAdd1to10 () {
			int i=1;
			int sum=0;
			while (i<=10) {
			
			System.out.println(i);//1,2,3
			sum= sum+i; //sum =0+1=1=1+2
			i++;
		}
			System.out.println("the total sum of 1 to 10 is: "+sum);
		}
		
		
		public static void print5to100inthemultiplesof5Andaddthosemulttiples() {
			//5,10,15..100
			//5+10+15...100
			int i=5;
			int sum=0;
			while (i<=100) {
			
			System.out.println(i);//1,2,3
			
			i=i+5;
			sum=sum+1;
			
		}
			System.out.println("the total sum of multiples are: "+sum);
		}
		
			
			
		
		
		public static void printfirst20multipleof9andaddthosemultiples() {
			int i =9;
			int sum= 0;
			while(i<=9*20) {
			System.out.println(i);	
				i=i+9;
				sum=sum+9;
					
			}
			
			System.out.println("the total sum of multiples are: "+sum);	
			
			
		
			
		}
		
		
		
		
		
		
	}
	
		
		
		
		
	



	
	