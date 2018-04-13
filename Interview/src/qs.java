
public class qs {
	private static int array[];

	public void sort(int[] arr) {
		if (arr == null || arr.length == 0) {
			return;
		}
		this.array = arr;
		quicksort(0, arr.length - 1);
	}

	private void quicksort(int left, int right) {
		int i = left;
		int j = right;
		int pivot = array[left + (right - left) / 2];

		while (i <= j) {
			while (array[i] < pivot) {
				i++;
			}
			while (array[j] > pivot) {
				j--;
			}
			if (i <= j) {
				swap(i, j);
				i++;
				j--;
			}
		}
		if (left < j) {
			quicksort(left, j);
		}
		if (i < right) {
			quicksort(i, right);
		}
	}

	private void swap(int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 1, 4, 5, 7 };
		quickSort sorter = new quickSort();
		sorter.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
