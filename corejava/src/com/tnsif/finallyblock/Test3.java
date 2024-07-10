package com.tnsif.finallyblock;
//exp vth no matching catch block
public class Test3 {
	public static void main(String[] args) {
		
	
try {
	System.out.println(100/0);
}
catch(NullPointerException e) {
	System.out.println("exp caught");
}
finally {
	System.out.println("hello");
}
}
}
