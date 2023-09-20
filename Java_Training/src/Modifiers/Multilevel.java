package Modifiers;
class A1 {
	public static void display() {
		System.out.println("display method invocated");
	}
}

 

class B1 extends A1 {
	public static void display1() {
		System.out.println("display1 method invocated");
	}
}

 

class C1 extends B1 {
	public static void display2() {
		System.out.println("display2 method invocated");
	}
}

 

public class MultiLevelExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 obj = new B1();
		obj.display();


 

	}