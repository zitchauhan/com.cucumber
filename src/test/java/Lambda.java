
public class Lambda {

	public static void main(String[] args) {

		Cat mycat = new Cat();
		// mycat.print();
		// printThings( () -> {System.out.println("Meow");} ); old

		Printable labmbdapritable = (() -> System.out.println("Meow")); // final

		printThings(labmbdapritable);

	}

	static void printThings(Printable thing) {
		thing.print();
	}
}

interface Printable {
	void print();
}

class Cat implements Printable {

	public String name;
	public int age;

	public Cat() {
	}

	@Override
	public void print() {
		System.out.println("Meow");

	}

}
