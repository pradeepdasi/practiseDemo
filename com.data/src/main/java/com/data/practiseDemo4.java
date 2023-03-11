package com.data;

public class practiseDemo4 {
	
	//reverse string
	public static String reverseString(String data){
		String result2="";
		StringBuffer sb=new StringBuffer(data);
		result2=sb.reverse().toString()+" ";
		return result2;
	}

	
	public static int fact(int n){
		int result1=0;
		if(n==0) {
			result1=1;
		}else
			result1=n*fact(n-1);
		return result1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Welcome to india";
		String result3="";
		String[] sr=str.split("\r");
		for(String srr:sr) {
		result3=result3+reverseString(srr);
		}
		System.out.println(result3.trim());
		System.out.println(fact(6));
		
		//fibanocci series
		
		int n=7;//0+1+1+2+3+5+8+13
		int a=0,b=1,c;
		for(int i=0;i<=n;i++) {
			System.out.println(a);
		c=a+b;
		a=b;
		b=c;
			
		}
		//palindrome 5225
		
		int num=5225,r,sum=0,temp=num;
		while(num>0) {
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		num=temp;
		if(sum==num) {
			System.out.println("its palindrom");
		}else {
			System.out.println("its not palindrom");
		}
		//prim number
		
		int no=11,count=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(count==2) 
			System.out.println("its prime number");
		else 
			System.out.println("its not prime number");
		
		
		//arm stronmg  number
		int number=153,rem,result,sum1=0,temp1=number;
		while(number>0) {
			rem=number%10;
			result=rem*rem*rem;
			sum1=sum1+result;
			number=number/10;
		}
		number=temp1;
		
		if(sum1==number)
		
		System.out.println("its arm strong number");
		else
			System.out.println("its not arm strong number");
		
	
		
		
		
	}
}
