package com.data;

public class practice7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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




		x=x+"@"+y;
		System.out.println(x);
		String[] arr=x.split("@");

		x=arr[1];
		y=arr[0];
		System.out.println(x);
		System.out.println(y);
		
		
	}
	
}
