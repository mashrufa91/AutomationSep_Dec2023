package com.java.sep10_23_day4_Control_Statements;

public class Practice_if_else {

		
		public static void main(String[] args) {
	        boolean itMoves = true;
	        boolean shouldItMove = false;

//	        if (itMoves) {
//	            if (shouldItMove) {
//	                System.out.println("No problem");
	//
//	            } else {
//	                System.out.println("Use duct tape");
//	            }
//	        } else {
//	            if (shouldItMove) {
//	                System.out.println("Use WD40");
//	            } else {
//	                System.out.println("No problem");
//	            }
	        if (itMoves == shouldItMove) {
	            System.out.println("No problem");
	        } else if (itMoves){
	            System.out.println("Use duck tape");
	        } else {
	            System.out.println("Use WD40");
	        }
	    
	
		
		
	}

}
