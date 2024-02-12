
public interface Interface1 {

	public static final int a = 10; // by deafault public staic final hote hote hain	

	public abstract void m1(); // by deafault  abstact and public  

	/*
	 * In Java 8 we can crate concreate mthod aslo where the acess modifier will be
	 * default every time then only
	 *
	 *
	 */

	default void method1_Java8() {

	}

	static void method2Java8() {

	}
	/*
	 * In JAVA 9 WE CAN CREATE PRIVATE MEHTHOD ALSO
	 */

	// only public, abstract, default, static and strictfp are permitted

	

}
