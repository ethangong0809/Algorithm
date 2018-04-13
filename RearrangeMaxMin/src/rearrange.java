import java.util.Arrays;

public class rearrange {

	public static void rearrange(int[] arr, int n) {

		int max = n - 1, min = 0;

		int max_elem = arr[n - 1] + 1;

		for (int i = 0; i < n; i++) {

			if (i % 2 == 0) {
				arr[i] += (arr[max] % max_elem) * max_elem;
				max--;
			}
			if (i % 2 == 1) {
				arr[i] += (arr[min] % max_elem) * max_elem;
			}
		}
		for (int i = 0; i < n; i++) {
			arr[i] = arr[i] / max_elem;
		}
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int n = arr.length;
		rearrange(arr,n);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
