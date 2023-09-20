package com.infinite.product;

public class Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		while(a<=90)
		{			
			if(a == 60)
			{
				a = a + 10;
				continue;
			}
			System.out.print(a + " ");
			a = a + 10;	
		}
	}

}
