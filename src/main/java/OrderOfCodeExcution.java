public class OrderOfCodeExcution {
	static int    staticVar = 1;
	       int 	instanceVar = 2;

	static {
		System.out.println("Static block is executed first 1.");
		staticVar = 10;
	}
//
	{
		System.out.println("Instance block is executed before constructor.2 ");
		instanceVar = 20;
	}

	public OrderOfCodeExcution() {
		System.out.println("Constructor is executed after instance block.3 ");
	}

	public static void staticMethod() {
		System.out.println("Static method is executed without creating an instance. 4 ");
		System.out.println("Static variable value: " + staticVar);
	}

	public static void main(String[] args) {

		OrderOfCodeExcution example = new OrderOfCodeExcution();
		staticMethod();

	}
}
//When the CodeExecutionExample class is executed, the following happens:

//Static variables are initialized. In our example, staticVar is initialized to…
