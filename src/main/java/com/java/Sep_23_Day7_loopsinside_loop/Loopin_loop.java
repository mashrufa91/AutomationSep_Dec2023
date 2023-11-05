package com.java.Sep_23_Day7_loopsinside_loop;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Loopin_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=1; i<=5; i++){
		  for (int j=1; j<=i; j++) {
	System.out.print("* ");
	}
System.out.println();
}
	}}