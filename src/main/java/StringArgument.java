
public class StringArgument {

	public static void main(String[] args) {
		// System.out.println("j");

		vm();
		for (int i = 0; i < args.length; i++) {

			System.out.println(args[i]);
		}
	}

	static void vm() {
		// TODO Auto-generated method stub

		for (int i = 1; i <= 4; i++) {

			for (int k = 3; k >= i; k--) 
			{

				System.out.print(" ");
			}

			for (int j = 1; j <= i; j++)
			{

				System.out.print("*" + " ");

			}

			System.out.println();
		}
	}
}


