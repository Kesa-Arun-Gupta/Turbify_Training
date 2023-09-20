//Arun
//String y[]={"Monday","Tuesday","Wednesday","Thursday"};
//if loop reaches Wednesday,then display output in reverse manner "yadsendew"  in upper case.
package com.infinite.product;

public class Wednesday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String y[]={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		int h = 0;
		while(h<y.length)
		{
			String r = y[h].toUpperCase();
			char n[]=r.toCharArray();
			int u = n.length-1;
			while(u >=0 )
			{
				System.out.print(n[u]);
				u--;
			}
			System.out.println(" ");
			h++;
		}
		
		
		
	}

}
