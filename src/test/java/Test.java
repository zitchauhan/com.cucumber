
public class Test {
	// default constructor call by JVM if no constructor is crated
	// no arg constructor
	// Parameterized constructor
	int emp_Id; /// this is and instance variable;
	String name; // this is an instance variable

	Test() {
		// my constructor
		System.out.println("My first constructor is called from the Java");
	}

	Test(String name, int emp_Id) {
		this.name = name;
		this.emp_Id = emp_Id;
		System.out.println("\n" + "Parametzied construct is called");
	}

	public static void main(String[] args) {
		// no arge constructor
		Test t = new Test();
		System.out.println("\n" + t + " = this is an object ");
		// now calll parameterrized constructor
		Test parameter = new Test("jitendra", 101);
		System.out.println("\n" + parameter + "= This is is one more object ");
		System.out.println("\n" + parameter.emp_Id + "  " + parameter.name);
	}
}
