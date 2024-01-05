package Array_Java;

public class A {

	public static void main(String[] args) {

		A objA = new A();
		objA.m1();

		B objB = new B();
		objB.m1();

		A objA1 = new B();
		objA1.m1();

		// B objB1 = new A(); // compile time error

	}

	void m1() {

		System.out.println(" from parant ");

	}
}

class B extends A {

	void m1() {

		System.out.println(" from child ");
	}

}