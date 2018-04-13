
public class quickSort {

	private int array[];
	private int length;
	
	public void sort(int[] inputArr) {
		
		if (inputArr == null || inputArr.length == 0) {
			return;
		}
		this.array = inputArr;
		length = inputArr.length;
		quickSort (0, length - 1);
	}
	
	private void quickSort (int left, int right) {
		
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
				exchangeNumber (i, j);
				i++;
				j--;
			}
		}
		
		if (left < j) {
			quickSort(left, j);
		}
		if (i < right) {
			quickSort(i, right);
		}
	}
		
		private void exchangeNumber (int i, int j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		
		public static void main(String[] args) {
			quickSort sorter = new quickSort();
			int[] input = { 24, 2, 3, 1, 8, 9, 20, 11};
			sorter.sort(input);
			for (int i : input) {
				System.out.print(i + " ");
			}
	}
}





