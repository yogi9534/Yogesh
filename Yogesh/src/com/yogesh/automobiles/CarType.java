package com.yogesh.automobiles;

public class CarType {

	 // int i = 10; //default modifier - only accessible inside com.yogesh.automobiles package
	 public int i = 10; // it will not give error in AutoMobile.java file under com.yogesh package - public works everywhere
	 protected String name = "Yogesh";  // protected works for inside a package or another package if sub class is used 
	 private int rollNo = 101; // private used only inside a class of a package
}
