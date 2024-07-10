package com.tnsif.exceptiondemo;

public class Nestedtrycatch {
public static void check() {
	String str="VTK";
	int slen=str.length();
	System.out.println("str len="+slen);
	String anostr=null;
	int y=6;
	try {
		try {
			System.out.println(str.charAt(y));
			
		}
		catch(StringIndexOutOfBoundsException ex) {
			System.out.println("index out of bound except"+ex.getMessage());
		}
	   System.out.println("str len "+anostr.length());
	}
	catch(NullPointerException npe) {
		System.out.println("exp is thrown"+npe.getMessage());
		
	}
}
}
