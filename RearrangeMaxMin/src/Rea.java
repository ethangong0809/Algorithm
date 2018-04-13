
public class Rea {

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void rearrange(int[]arr, int n) {
		for (int i = 0; i < n; i += 2) {
			if (i > 0 && arr[i - 1] < arr[i]) {
				swap(arr, i, i - 1);
			}
			if (i < n - 1 && arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};
		int n = arr.length;
		rearrange(arr, n);
		for (int i = 0; i < n; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
}
