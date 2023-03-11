package com.data;

public class practice7 {
	
	public void m2() {
		System.out.println("this is method2");
		System.out.println("this is start message");
		System.out.println("this is full message");
	}
	
	public void m1() {
		System.out.println("m1 method");
		System.out.println("this method added only for demo purpose");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("this is my first project");
		System.out.println("this is my  second project");
		System.out.println("this is my third project");
		System.out.println("application in running status");
		
		//swap two numbers ans swap two strings
				int a=10;int b=20;
				a=a+b;//32
				b=a-b;
				a=a-b;
				System.out.println(a);
				System.out.println(b);
//swap two stings
		String x="india";


		String y="country";

		// do not use substring or length methods or index
System.out.println("its complete project details added");



		x=x+"@"+y;
		System.out.println(x);
		String[] arr=x.split("@");

		x=arr[1];
		y=arr[0];
		System.out.println(x);
		System.out.println(y);
		
		
	}
	
}
