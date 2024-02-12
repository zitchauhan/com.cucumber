package Array_Java;

import java.util.PriorityQueue;

public class KthLargest {

	private PriorityQueue<Integer> minHeap;
	private int k;

	public KthLargest(int k, int[] nums) {
		this.k = k;
		this.minHeap = new PriorityQueue<>();
		for (int num : nums) {
			add(num);
		}
	}

	public int add(int val) {
		minHeap.offer(val);

		// Keep the heap size to k, as we only need the kth largest element
		if (minHeap.size() > k) {
			minHeap.poll();
		}

		// Peek the kth largest element
		return minHeap.peek();
	}

	public static void main(String[] args) {
		int[] operations = { 3, 5, 10, 9, 4 };
		int[][] inputs = { { 4, 5, 8, 2 }, { 3 }, { 5 }, { 10 }, { 9 }, { 4 } };

		KthLargest kthLargest = null;
		for (int i = 0; i < operations.length; i++) {
			int operation = operations[i];
			int[] input = inputs[i];

			switch (operation) {
			case 0:
				kthLargest = new KthLargest(input[0], input);
				System.out.println("null");
				break;
			case 1:
				System.out.println(kthLargest.add(input[0]));
				break;
			}
		}
	}
}

/**
 * Your KthLargest object will be instantiated and called as such: KthLargest
 * obj = new KthLargest(k, nums); int param_1 = obj.add(val);
 */