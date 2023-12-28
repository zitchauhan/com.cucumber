import java.util.List;

public class LambdaE {

	public static void main(String[] args) {
		MyInterface myLambda = () -> {
			// Your implementation of doSomething() goes here
			System.out.println("Doing something..somthing.");
		};
		// Using the lambda expression with a functional interface
		MyInterface myLambda1 = () -> System.out.println("Doing something...");
		// Invoking the method via the lambda expression
		myLambda.doSomething();
		myLambda1.doSomething();

		 TestInterfacelambda mylambda = () ->System.out.println("Lambda");
			
		 mylambda.lambda();
	}
}

interface MyInterface {
	void doSomething();
}

interface TestInterfacelambda {

	void lambda();
}

class A implements TestInterfacelambda {
	public void lambda() {

		System.out.println("Lambda");
	}

}


