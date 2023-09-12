package org.java;

public class Fibonacci {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=0, b=1, c,i,n=10;
		 System.out.print("Fibonacci series"+" ");
		 System.out.print(a+" ");
		 System.out.print(" "+b);
		 for( i = 2;i<n;i++)
		 {
			c=a+b; 
			System.out.print(" "+c);
			a=b;
			b=c;
			
		 }

	}

}
