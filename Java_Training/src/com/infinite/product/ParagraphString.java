//Arun
//Iam bad Programmer
package com.infinite.product;

public class ParagraphString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\"");
		String a = "I am bad Programmer";
		int i = 0;
		while(i<100)       //length
		{
			int j=1;
			while(j<=100)   //width
			{
				if(i==10*j)
				{
					System.out.print("\n");
				}
				j++;
			}
			System.out.print(a+" ");
			i++;
		}
		System.out.print("\"");
	}

}
