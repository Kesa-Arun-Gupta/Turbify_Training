//Arun
//Functions
package com.infinite.product;
import java.util.Scanner;

public class Input {
	public  void swapping(int a, int b) //swapping Function
	{
		
		
		a = (a+b)-(b=a);
		System.out.println(a);
		System.out.println(b);
	}
	public static void table(int a) //Table Function
	{
		int i = 0;
		while(i<=10)
		{
			System.out.println(a+"x"+i+"="+a*i);
			i++;
		}
	}

	public static void main(String[] args) { //Main Function
		// TODO Auto-generated method stub
		Scanner k = new Scanner(System.in);
		Input s = new Input();
		int a = k.nextInt();
		int b = k.nextInt();
		s.swapping( a, b);
		table(67);
		return;
	}
	

}
