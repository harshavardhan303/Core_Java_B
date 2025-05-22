package com.tns.day7.abstraction;

abstract public class Shape {
protected float area;
abstract void calArea();
void show() {
	System.out.println("The area is:"+area);
}
}
