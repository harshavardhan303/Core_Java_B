package com.ait.day8.FinalDemo;

public class FinalMethodClass {

	public FinalMethodClass() {
		System.out.println("This is a Default Constructor");
	}
	
	final int a=10;
	final void show() {
		System.out.println("The value of a is:"+a);
	}
}
