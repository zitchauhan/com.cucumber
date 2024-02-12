import java.util.Scanner;

class YoungerAgeException extends RuntimeException {
	public YoungerAgeException(String msg) {
		super(msg);
	}
}

public class Voting {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter you age ");

		int age = sc.nextInt();

		if (age < 18) {

			throw new YoungerAgeException("You are not eligible to vote");
		} else

		{

			System.out.println("you can vote");
		}

	}
}
