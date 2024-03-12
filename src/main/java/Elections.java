class UnderAgeException extends Exception {
	UnderAgeException() {
		super();
	}

	UnderAgeException(String msg) {
		super(msg);
	}
}

public class Elections {
	public static void main(String[] args) throws UnderAgeException {
		try {

			int age = 17;

			if (age < 18)

			{
				throw new UnderAgeException(" You can't vote");
			} else {
				System.out.println("you can vote");
			}
		} catch (UnderAgeException y) {
			y.printStackTrace();

		}
	}
}