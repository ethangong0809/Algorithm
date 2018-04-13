package testtest;

public class SecondSmallest {
	
	static void print2smallest(int arr[]){
	
		int first, second, arr_size = arr.length;
		if (arr_size < 2) {
			return ;
		}
		first = second = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < first) {
				second = first;
				first = arr[i];
			}
			else if (arr[i] < second && arr[i] > first) {
				second = arr[i];
			}
		}
		System.out.println(second);
		
	}
	
	public static void main(String[] args) {
		int arr[] = {12, 1, 23, 421, 23, 77};
		print2smallest(arr);
	}

}

