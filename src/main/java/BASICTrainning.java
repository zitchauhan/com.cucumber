
public class BASICTrainning

{

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer("abc");

		StringBuffer appened = sb.append("abc");

		String s = "abc";

		StringBuffer sb1 = new StringBuffer();
		StringBuffer str = sb1.append(s + s + s);

		StringBuffer rev = str.reverse();
		System.out.println(rev);
	}

}
