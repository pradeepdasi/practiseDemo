package com.data;

import java.util.Scanner;

public class practic4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner s=new Scanner(System.in);
		/*
		 * System.out.println("1 Redcolor");
		 * 
		 * System.out.println("2 Bluecolor");
		 * 
		 * System.out.println("1 Greencolor");
		 * 
		 * System.out.println("color color ..........  1/2/3"); int color=s.nextInt();
		 * if(color==1) { System.out.println("this is red color"); }else if(color==2) {
		 * System.out.println("this is Blue color"); }else if(color==3) {
		 * System.out.println("this is Green color"); }
		 */
		System.out.println("1.Addition");
		

		System.out.println("2.Subtraction");

		System.out.println("3.Multiplication");

		System.out.println("4.divisiot(to get quotient)");

		System.out.println("5.modulus(to get reminder)");
		System.out.println("hey optiones enter...1\2\3\4\5");
		
		int opt=s.nextInt();
		
		System.out.println("hey enter two integer values to perform task");
		int a,b;
		
		
		int c=0;
		switch(opt) {
		
		case 1:
			System.out.println("case 1");
			 a=s.nextInt();
			
			 b=s.nextInt();
			c=a+b;
			break;
		case 2:
			System.out.println("case 2");
			a=s.nextInt();
			
			 b=s.nextInt();
			c=a+-b;
			break;
		case 3:
			System.out.println("case 3");
			a=s.nextInt();
			
			 b=s.nextInt();
			c=a*b;
			break;
		case 4:
			System.out.println("case 4");
			a=s.nextInt();
			
			 b=s.nextInt();
			c=a/b;
			break;
		case 5:
			a=s.nextInt();
			
			 b=s.nextInt();
			System.out.println("case 5");
			c=a%b;
			break;
			default:
				System.out.println(" not matching");
		}
		System.out.println("Result is:\t"+c);
		/*
		 * if(opt==1) c=a+b; else if(opt==2) c=a-b; else if(opt==3) c=a*b; else
		 * if(opt==4) c=a/b; else if(opt==5) c=a%b;
		 * System.out.println("Result is:\t"+c);
		 */
		
		
	}

}
