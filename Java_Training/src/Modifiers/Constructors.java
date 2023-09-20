package Modifiers;

class Stat {

	int a;
	String name1;

	Stat() { // empty constructor
		a = 90;

		return;

	}

	Stat(String name) { // parametrised constructor
		this.name1 = name;
	}

	Stat(String uname, int q) { // Parameterized constructor

	}

	// named blocks
	public void display() {
		System.out.println(name1);
	}

	// unnamed block
	{
		System.out.println("Unnamed Blocks");
	}

	// static block
	static {
		System.out.println("static Blocks");
	}
}

public class Constructors {

	public static void main(String[] args) {

		Stat ref = new Stat("srinXivas");// object
		ref.display();
		Stat ref1 = new Stat();
		System.out.println(ref1.a);

	}

}