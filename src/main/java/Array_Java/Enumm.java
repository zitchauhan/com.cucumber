package Array_Java;

public class Enumm {
	public static void main(String[] args) {
	       MyEnum myValue = MyEnum.VALUE1;

	       switch (myValue) {
	           case VALUE1:
	               System.out.println("Value is VALUE1");
	               break;
	           case VALUE2:
	               System.out.println("Value is VALUE2");
	               break;
	           case VALUE3:
	               System.out.println("Value is VALUE3");
	               break;
	           default:
	               System.out.println("Unknown value");
	       }
	   }

}

enum MyEnum {
	VALUE1, 
	VALUE2, 
	VALUE3

}
