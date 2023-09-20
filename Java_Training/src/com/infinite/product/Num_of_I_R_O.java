//Arun
//count character in a string

package com.infinite.product;

public class Num_of_I_R_O {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Returns the index within this string of the first occurrence";
		 int count = 0, count1=0, count2=0;
		 char c = 'i';
		 char c1 = 'r';          
		 char c2 = 'o';
		    for(int j = 0;  j < a.length();j++ )
		    {
		        if(a.charAt(j)==c)
		        {
		            count++;
		        }
		        else if(a.charAt(j)==c1)
		        {
			    	count1++;
		        }
			    else if(a.charAt(j)==c2)
			    {
				    	count2++;
		        }
		    
		    }
		    
		System.out.println("Number of i letters in string = " + count);
		System.out.println("Number of r letters in string = " + count1);
		System.out.println("Number of o letters in string = " + count2);
	}

}
