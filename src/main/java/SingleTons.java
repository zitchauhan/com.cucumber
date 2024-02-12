
public class SingleTons {

	private static final SingleTons instance = new SingleTons(); // object of class

	private SingleTons() {
	} /// no args constructor

	public static SingleTons getSingleTon() // method which returns a Singleton instance ;

	{
		return instance;

	}

}

class Awai {

	public static void main(String[] args) {
		SingleTons singletonInstance = SingleTons.getSingleTon(); // because of static we can call this in new class

		System.out.println(singletonInstance);
	}

}