package ThisJava;

public class Concatnation {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3};

		getConcatenation(nums);
	}

	public static int[] getConcatenation(int[] nums) {
		int []arr1 = {};
		for (int i = 0; i <= nums.length - 1; i++) {

		     arr1[i] =	nums[i];
			System.out.println(arr1[i]);	
		}
		
		
		
		for (int j = 0; j < nums.length; j++) {
			
			System.out.print(nums[j]);
		}

		return nums;

	}
}

/*
 * Input: nums = [1,2,1] Output: [1,2,1,1,2,1] Explanation: The array ans is
 * formed as follows: - ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
 * ans = [1,2,1,1,2,1]
 */