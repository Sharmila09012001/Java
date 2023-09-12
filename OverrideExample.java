package org.java;

class Addition
{
	void override(int a ,int b)
	{
		int c=a+b;
		System.out.println("Addition of two numbers:"+c);
	}
}
class Subtraction extends Addition
{
	void override(int a ,int b)
	{
		int d=a-b;
		System.out.println("Subtraction of two numbers:"+d);
	}
}
class Multiplication extends Addition
{
	void override(int a ,int b)
	{
		int e=a*b;
		System.out.println("Multilication of two numbers:"+e);
	}
}
class Division extends Addition
{
	void override(int a ,int b)
	{
		int f=a/b;
		System.out.println("Division of two numbers:"+f);
		
	}
}

public class OverrideExample {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add=new Addition();
		add.override(3, 7);
		Subtraction sub=new Subtraction();
		sub.override(7, 3);
		Multiplication mul=new Multiplication();
		mul.override(3, 7);
		Division div=new Division();
		div.override(12,2);







	}

}
