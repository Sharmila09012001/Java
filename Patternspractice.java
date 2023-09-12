package org.java;
import java.util.Scanner;



public class Patternspractice {

		// TODO Auto-generated constructor stub
	

public static void main(String[] args) {
		
	System.out.println("Enter no of times pattern to be printed");
	
	Scanner no = new Scanner(System.in);
			
	int n=no.nextInt();
	int num=15;	
	
	for(int i=1;i<=n;i++) 
		
	{
		System.out.println();
		for(int j=5;j>=i;j--)
		{
				
			System.out.print(num +"  ");
			num--;
			
		}
		
	}
	int nu=1;
	for(int i=1;i<=n;i++) 
	
	{
		System.out.println();
		for(int j=1;j<=i;j++)
		{
				
			System.out.print(nu);
			nu++;
			
		}
		
	}
}
}

