package Modifiers;

public class ExceptionHandling {
	public static void main(String[] args){
		try{
			int a=1/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally{
			System.out.print("$$$$");
		}
	}
}
