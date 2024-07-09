package com.tnsif.interfaceprgm;

public class Warrior implements Weapon,Character {

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("attck");
	}

	@Override
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("welcome");
		
	}
	public static void main(String[] args) {
		Warrior w=new Warrior();
		w.attack();
		w.use();
	}

}
