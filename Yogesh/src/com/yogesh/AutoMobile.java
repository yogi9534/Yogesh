package com.yogesh;

import com.yogesh.automobiles.CarType;

class Car{
	public void carDoes() {
		System.out.println("running...");
	}
}

public class AutoMobile {

	public static void main(String[] args) {
		CarType ct = new CarType();
		ct.i = 11; 
		System.out.println("i = "+ ct.i);
		/*
		 * ct.name = "Singh"; System.out.println("name :"+ct.name);
		 */
		//ct.rollNo = 102;  - private roll no. from com.yogesh.automobiles.CarType package can't be use here
		 
	}

}
