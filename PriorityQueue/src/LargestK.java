import java.util.PriorityQueue;

public class LargestK {

	private static int kthLargest(Integer[] array, int k) {
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int i = 0;
		while (i < k) {
			queue.add(array[i]);
			i++;
		}
		for (; i < array.length; i++) {
			int value = queue.peek();
			if (array[i] > value) {
				queue.poll();
				queue.add(array[i]);
			}
		}
		return queue.peek();
	}

	public static void main(String[] args) {
		Integer[] array = new Integer[]{7,6,5,4,3,2,1};
		int k = 4;
		System.out.println(kthLargest(array,k));
	}
}
