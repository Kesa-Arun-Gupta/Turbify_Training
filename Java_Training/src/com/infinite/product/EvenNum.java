package com.infinite.product;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2345;
		while(a<=5678)
		{
			if(a%2==0)
			{
				System.out.println(a + " is a Even Number");
			}
			else
			{
				System.out.println(a + "is a Odd Number");
			}
			a++;
		}
	}

}
