package TestPakage;

public class A {

	int a = 10;
	int b = 20;
	int instance;

	public A() {
		System.out.println("This is constructor");
	}
	public int setX(int local) {
		return this.instance = local;
	}
	public static void main(String[] args) {
		A obj1 = new A();
		int c = obj1.setX(100);
		System.out.println(c);
	}

}
