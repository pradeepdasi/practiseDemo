package com.data;

import java.io.IOException;
import java.util.Scanner;

public class practise5 {

	/*
	 * public int TotalMarks() {
	 * 
	 * return s1 + s2 + s3 + s4 + s5; }
	 * 
	 * public float getAvgMarks() {
	 * 
	 * return TotalMarks() / 5.00f; }
	 * 
	 * int sno; String stname; int s1, s2, s3, s4, s5, s6;
	 * 
	 * public practise5(int sno, String stname, int s1, int s2, int s3, int s4, int
	 * s5, int s6) { // TODO Auto-generated constructor stub this.sno = sno;
	 * this.stname = stname; this.s1 = s1; this.s2 = s2; this.s3 = s3; this.s4 = s4;
	 * this.s5 = s5; this.s6 = s6;
	 * 
	 * }
	 */

	/*
	 * public void getResult() {
	 * 
	 * if (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40) {
	 * 
	 * 
	 * System.out.println("Student with student No:" + sno+ "\t" +stname+
	 * " is passed"); float avg = getAvgMarks(); String grade = "no grade"; if (avg
	 * >= 90.00f) { grade = "A+";
	 * 
	 * } else if (avg >= 80.00f) { grade = "A+"; } else if (avg >= 70.00f) { grade =
	 * "A"; } else if (avg >= 60.00f) { grade = "A"; } else if (avg >= 50.00f) {
	 * grade = "B"; } else if (avg >= 40.00f) { grade = "B+"; } else if (avg >=
	 * 35.00f) { grade = "c";
	 * 
	 * } else System.out.println("Student wiht student No:" + stname + "is failed");
	 * 
	 * System.out.println("Total:" + TotalMarks()); System.out.println("Percentage"
	 * + getAvgMarks()); System.out.println("Grade:" + grade);
	 * 
	 * 
	 * } }
	 */
	/*
	 * int n=10,i=1; while(i<=n) { System.out.println("Hai...."); i++; }
	 * System.out.println("............The End..........");
	 */
	// Scanner s = new Scanner(System.in);

	// practise5 p = new practise5(1, "pradeep", 80, 90, 76, 80, 60, 75);
	/*
	 * int total=p.TotalMarks(); System.out.println(total);
	 * 
	 * float avg=p.getAvgMarks(); System.out.println(avg);
	 */
	// p.getResult();

	/*
	 * System.out.println("Enter a character");
	 * 
	 * char ch = (char) System.in.read();
	 * 
	 * System.out.println("Enter character :\t" + ch);
	 * 
	 * switch (ch) {
	 * 
	 * case 'a': case 'e': case 'i': case 'o': case 'u': case 'A': case 'E': case
	 * 'I': case 'O': case 'U': System.out.println("vowels"); break; default:
	 * System.out.println("consonants"); break; }
	 */
	/*
	 * System.out.println("Enter day in short cut");
	 * 
	 * String day = s.next();
	 * 
	 * switch (day) { case "mon":
	 * 
	 * case "tue": case "wen": case "thur": case "friday":
	 * System.out.println("week days "); break; case "saturday": case "sunday":
	 * System.out.println("WeekEnd"); break; default:
	 * System.out.println("neither weekend nor weekdays");
	 * 
	 * }
	 */

	/*
	 * int a = 100, b = 100, c = 190;
	 * 
	 * if (a > b) {
	 * 
	 * if (a > c) { System.out.println("a is big"); } else
	 * System.out.println("c  is big");
	 * 
	 * }else if(b>c) { System.out.println("b is big"); }else
	 * System.out.println("c is big");
	 * 
	 * }
	 * 
	 */
	/*
	 * public static int fact(int n) { int result=0;
	 * 
	 * if(n==0) { result=1; }else { result=result+n*fact(n-1); }
	 * 
	 * return result; }
	 */
	public static void main(String[] args) throws Exception {

		/*
		 * int n1 = 3, n2 = 3;
		 * 
		 * for (int i = 5; i >= n1; i--) {
		 * 
		 * for (int j = 1; j <= i; j++) {
		 * 
		 * System.out.print(i + "\t");
		 * 
		 * }
		 * 
		 * System.out.println(""); }
		 * 
		 * for (int i = 5; i >= n1; i--) {
		 * 
		 * for (int j = 5; j >= 3; j--) {
		 * 
		 * System.out.print(j + "\t");
		 * 
		 * }
		 * 
		 * System.out.println(""); }
		 */

		// arm stron
		// fibanocci series,palindrom,factrs,factorial,string rvers,revrse integer,prime
		//plaindrom 5225
		String str="babbu great";
		char[] y=str.toCharArray();
		int size=y.length;
		char[] a=new char[size];
		int i=0;
	while(i!=size) {
		a[size-1-i]=y[i];
		i++;
	}
		System.out.println(y);
		System.out.println(a);
		
		
	//factors 4!
		int n=123,rem,result=0;
		while(n!=0) {
			rem=n%10;//3
			
			n=n/10;//2
			System.out.println(rem);
		}
		
	
	}

	
}
