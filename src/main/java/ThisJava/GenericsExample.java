package ThisJava;

public class GenericsExample<T> {
	private T data;

	public GenericsExample(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public static void main(String[] args) {
		GenericsExample<String> example1 = new GenericsExample<>("Hello");
		GenericsExample<Integer> example2 = new GenericsExample<>(123);

		System.out.println("Data in example1: " + example1.getData());
		System.out.println("Data in example2: " + example2.getData());
	}
}
