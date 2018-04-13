import java.util.PriorityQueue;

public class SmallestK {

	public static int kthSmallest(int[] array, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		
		for (int i = 0; i < array.length; i++) {
			queue.add(array[i]);
		}
		int n = -1;
		while (k > 0) {
			n = queue.poll();
			k--;
		}
		return n;
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{2,3,4,5,6,1,7,8};
		int k = 3;
		
		System.out.println(kthSmallest(array, k));
	}

}
