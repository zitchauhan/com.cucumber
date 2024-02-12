
public class O {
	public static void main(String[] args) {
		SingleTon singletonInstance = SingleTon.getSingleTon(); // because of static we can call this in new class

		System.out.println(singletonInstance);
	}

}

class SingleTon {

	private static final SingleTon instance = new SingleTon(); // object of class

	private SingleTon() {
	} /// no args constructor

	public static SingleTon getSingleTon() // method which returns a Singleton instance ;

	{
		return instance;

	}

}
