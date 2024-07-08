package com.tnsif.constructor;

import java.util.Scanner;

public class Customerdemo {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your name");
	String name =sc.nextLine();
	System.out.println("Enter your cid");
	int id =sc.nextInt();
	System.out.println("Enter your caddress");
	String address =sc.nextLine();
	
	Customer c=new Customer();
	c.setCname(name);
	c.setCid(id);
	c.setCaddress(address);
	System.out.println(c);
	boolean out = instanceof Customer;
	System.out.println(out);
	
	
}
}
