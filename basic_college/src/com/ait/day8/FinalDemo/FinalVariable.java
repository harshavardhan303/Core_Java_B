package com.ait.day8.FinalDemo;

public class FinalVariable {

	final int x=100;
	final static int y;
	final static int z=10;
	
	void change() {
		x=30;
		y=100;
	}

	@Override
	public String toString() {
		return "FinalVariable [x=" + x + "]";
	}
	//var>static>method
	static {
		y=10;
		z=100;
		System.out.println("value of y:"+y);
	}

	
}
