package ArrayProgramms;

public class InsertAnArray {
// to inster an array on the posistion 

	/// we need to udder stand the quesiotn what is the question thay are asking
	// so basis on this need add the element on position or index

	// fir iterrent and for loop till from lengh of array - 1
	// and itrate till the posoistion of and element
	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50 };
		int posto_be_instert = 3;
		int value_to_instered = 100;

		System.out.println("lenght of an array " + arr.length); // this length of an aray hai = 5

		// for loop will represent index value
		for (int i = arr.length - 1; i > posto_be_instert - 1; i--) {

			arr[i] = arr[i - 1];

			// 50 = 40; // first iteration;

			/// 40 = 30 second iteration;

			// now the array will { 10, 20 , 30 , 30 , 40}

			/// ager koi bhi elelemnt add karwana hain hai to last ka elemet lost lo jata
			/// hain

			// so i we want to store it we need to add store into an and any of int
			// avairbale

		}
		arr[posto_be_instert - 1] = value_to_instered;

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i]);

		}
	}

}
