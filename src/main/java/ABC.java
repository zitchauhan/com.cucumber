
public class ABC {

	public static void main(String[] args) {
		//search();
		
	
		String txt = "Please locate where locate occurs!";
		System.out.println(txt.indexOf("l")); // Outputs 7
		
	    int xs = 5;
	    System.out.println(! (xs > 6));
	    
	 //   System.out.println(!(xs > 3 && xs < 10));
	    System.out.println("--------------");
		 int xa = 10;
		  //  xa |= 3;
			xa = xa | 2;
		    System.out.println(xa);
		    System.out.println("--------------");

		    int x11 = 8;
	    int y11 = 7;
	    System.out.println(x11 % y11);
	    System.out.println("--------------");

		
	//	byte -> short -> char -> int -> long -> float -> double
		short s1 = 'A';
		System.out.println(s1);
		char s = 'A';
		System.out.println(s);
		System.out.println("--------------");
		char myGrade = 'B';
	//	System.out.println("\n"+myGrade);
		
		char c = 65, c1 = 66, c2 = 67;
		System.out.println(c);
		System.out.println(c1);
		System.out.println(c2);
		
		int number = -2147483648;
		int j= 2147483647;
		long myNum1 = 1234567890123456789L;
		System.out.println(myNum1);
		
		float myfloats = 5.99f;
		System.out.println(myfloats);
		
		int myNum = 5;               // Integer (whole number)
		float myFloatNum = 5.99f;    // Floating point number
		char myLetter = 'D';         // Character
		boolean myBool = true;       // Boolean
		String myText = "Hello";     // String
		
		int x1, y1, z1;
		
		x1 = y1 = z1 = 50;
		System.out.println(x1 + y1 + z1);
		int a = 5 , b = a, cc = 7;
		System.out.println(a+b+cc);
		
		int x = 5, y = 6, z = 50;
		System.out.println(x + y + z);
		
	}
	private static void search() {

		int [] arr = { 5, 2, 8, 1, 3 };
		int search = 1;
		int start  = 0;
		int end = arr.length -1;
		int mid= 0;
		
		while (start <= end) {
			
			 mid = (start + end)/2;
			 
			 if ( arr[mid]== search) {
				
			 }
			
		}
		
		
		
		
	}

	private void sort() {
		// TODO Auto-generated method stub
			int temp = 0;
			int[] arr = { 5, 2, 8, 1, 3 };
			for (int i = 0; i < arr.length; i++) {

				for (int j = 0; j < arr.length - 1 -i; j++) {

					if (arr[j] > arr[j + 1]) {

						temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;

					}
				}
			}
			for (int value : arr) {
	            System.out.print(value + " ");
	        }
		
		
		}

	}

