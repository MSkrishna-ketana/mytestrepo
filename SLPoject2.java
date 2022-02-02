package com.mskrishna.training;

import java.util.Scanner;

public class SLPoject2 {

	public static void main(String[] args) {
		
System.out.println("enter the number of elements");

Scanner sc = new Scanner(System.in);

String[] string = new String[sc.nextInt()];

System.out.println("enter the mail ids");

sc.nextLine();

for(int a=0; a < string.length; a++) {
	
	string[a] = sc.nextLine();
}
 
boolean x = false;

System.out.println("enter the mail id to search");

Scanner st = new Scanner(System.in);

String s = st.nextLine();

for ( int i = 0 ; i < string.length ; i++) {
	
	if(s.equals(string[i])) {
		
		x = true ;
		
		break;
		
	}
	
	if(x) {
		
		System.out.println(s+" is found in the given mail id");
		
	}
	
	else {
		
		System.out.println(s+" is not found in the given mail id");
	}
}


	}

}



