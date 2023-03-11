package com.data;

public class practise6 {

	public static void main(String[] args) {
		
		//fibanocci series 0,1,1,2,3,5,8,13
		int n=7,a=0,b=1,c;
		//a=0,1,1,2,3,5
		//c=a+b=1
		//b=1
		//c=1
		
		for(int i=0;i<=n;i++) {
			
			System.out.println(a);//0,1
			c=a+b;//3+2
			a=b;//5
			b=c;//3
			
		}
		
		
		//arm strong 153 1*1*1+5*5*5+3*3*3
		
		int n1=153,reminder,sum2=0,temp11=n1;
		while(n1>0) {
			reminder=n1%10;//3,5
			sum2=sum2+reminder*reminder*reminder;//9,125
			
			n1=n1/10;//15
			
		}
		System.out.print(sum2);
		n1=temp11;
		if(sum2==n1)
			System.out.println("its an arm strong number");
		else
			System.out.println("its not an arm strongnumber");
		
		//prime number
		
		int no=11,i=1,count=0;
		
		while(i<=no) {
			
			if(no%i==0) {
			count++;
			}
			i++;
		}
		
		if(count==2) 
			System.out.println("its a prime number");
		else
			System.out.println("its not prime number");
		//palindorme
		int number=321,i2=0,rem;
		while(number>0) {
			rem=number%10;
			number=number/10;
			System.out.print(rem);
					
		}
		System.out.println("");
		//.....................................
		//palindrome 5225
				int num=5225,i1=0,r,sum=0,result=0,temp=num;
				while(num>0) {
					r=num%10;//5 
					sum=sum*10+r;
					num=num/10;//522
					
					
				}
				num=temp;
				if(sum==num)
					System.out.println("its palindroem");
				else
					System.out.println("its not palindrom");
				
		

	}

}
