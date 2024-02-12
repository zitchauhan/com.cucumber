
public class My_test {

	
	public static void main(String[] args) {
		two();
	}
	
	static void  one () {
		
		System.out.println("A");
		two();
	}
	static void  two () {
		
		one();
		System.out.println("B");
	}
}
