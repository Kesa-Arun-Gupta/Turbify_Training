package com.infinite.product;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int u[] = new int[5];     //syntax1
		int [] u1 = new int[5];   //syntax2
		int [] u2 = {22,33,44,55};//syntax3
		
		int i =0;
		while(i<u2.length)
		{
			System.out.println(u2[i]);
			i++;
		}
		int j = 0;
		while(j<3)
		{
			System.out.println(u2[j]);
			j++;
		}
		String a = "ARUN    ";
		String b = "arun";
		System.out.println(a.length());
		String k = a.trim();//after trim
		System.out.println(k);//trimmed string
		System.out.println(k.length());//len of trimmed string
		System.out.println(k.substring(0,3));//substring
		System.out.println(k.equals(b.toUpperCase()));//comparing with case sensitive
		System.out.println(b.indexOf("n"));//index of n
		System.out.println(b.isEmpty());//false
		System.out.println(b.lastIndexOf("n"));//true
		System.out.println(b.equalsIgnoreCase(k));//true
		System.out.println(b.concat(a));//concat string
		System.out.println(b.endsWith("v"));//false
		System.out.println(b.hashCode());//
		System.out.println(b.replaceAll("u","y"));//replace
		
		
		
	}

}
