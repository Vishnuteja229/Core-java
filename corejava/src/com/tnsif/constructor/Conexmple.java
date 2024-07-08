package com.tnsif.constructor;

public class Conexmple {
	Conexmple() {
	System.out.println("default con");
}
	Conexmple(int i){
		System.out.println("para con");
	}
	Conexmple(int i,int j){
		System.out.println("hello");
	}
	Conexmple(int i,String n){
		System.out.println("diff type");
	}
	public static void main(String[] args) {
		Conexmple c=new Conexmple();
		Conexmple c1=new Conexmple(6);
		Conexmple c2=new Conexmple(6,7);
		Conexmple c3=new Conexmple(6,"hit");
	}
}
