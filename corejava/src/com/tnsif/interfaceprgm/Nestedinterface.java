package com.tnsif.interfaceprgm;

import com.tnsif.interfaceprgm.Myinterface.Ninterface;

public class Nestedinterface implements Myinterface.Ninterface{


	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("inner inetrface");
	}
	
	public static void main(String[] args) {
		Nestedinterface n=new Nestedinterface();
		n.print();
		System.out.println(Ninterface.a);
		}

}
