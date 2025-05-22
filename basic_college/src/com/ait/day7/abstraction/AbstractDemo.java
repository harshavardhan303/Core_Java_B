package com.ait.day7.abstraction;

public class AbstractDemo {

	public static void main(String[] args) {
		Shape obj=new Square();
		obj.calArea();
		obj.show();
		obj=new Rectangle();
		obj.calArea();
		obj.show();
	}

}
