package Modifiers;

class A {
	public void display() {
		System.out.println("A");
	}
}
class B extends A
{
	public void display(){
		
	super.display();
	System.out.println("B");	
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.display();

	}

}
