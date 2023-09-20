package com.infinite.product;

public class Compare3var {

	public static void main(String[] args) {
		int a = 90;
		int b = 890;
		int c = 78;
		if(a>b && a>c)
		{
			System.out.println("a is Highest");
		}
		else if((a<b && a<c))
		{
			System.out.println("a is Lowest");
		}
		if(b>a && b>c)
		{
			System.out.println("b is Highest");
		}
		else if(b<a && b<c)
		{
			System.out.println("b is Lowest");
		}
		if(c>a && c>b)
		{
			System.out.println("c is Highest");
		}
		else 
		{
			System.out.println("c is Lowest");
		}
		
	}

}
