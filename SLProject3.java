package com.mskrishna.training;


	

	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class SLProject3 {
		public static void main(String[] args) throws Exception
	    {
	       
	        String fileName = "hello.txt";
	        try {
	        	BufferedWriter out = new BufferedWriter(
	                new FileWriter(fileName));
	 
	            out.write("Hello World:\n");
	 
	            out.close();
	        }
	       
	        catch (IOException e) {

	            System.out.println("Exception Occurred" + e);
	        }

	        String str = "This is java";

	        appendStrToFile(fileName, str);
	 
	        try {
	            BufferedReader in = new BufferedReader(
	                new FileReader("hello.txt"));
	 
	            String mystring;
	            
	            while ((mystring = in.readLine()) != null) {
	                System.out.println(mystring);
	            }
	        }
	        catch (IOException e) {
	            System.out.println("Exception Occurred" + e);
	        }
	    }

		private static void appendStrToFile(String fileName, String str) {
			
			
			
		}

		
	    }
		
			




