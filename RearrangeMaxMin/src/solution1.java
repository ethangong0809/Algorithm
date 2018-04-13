public class solution1{
	
	public static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
	static void helper(int[] arr, int n) {
		for (int i = 0; i < n; i = i + 2) {
			if (i > 0 && arr[i-1] < arr[i]){
				swap(arr, i, i - 1);
			}
			if (i < n - 1 && arr[i] > arr[i + 1]) {
				swap(arr, i, i + 1);
			}
		}
	}
	public static void main(String[] args) {
		int[]arr = new int[]{7,9,4,3,2,1};
		int n = arr.length;
		helper(arr, n);
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}