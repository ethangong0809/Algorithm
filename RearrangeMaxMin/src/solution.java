import java.util.Arrays;

public class solution {
	/**
	 * @param nums
	 *            a list of integer
	 * @return void
	 */
	public void wiggleSort(int[] nums) {
		// Write your code here
		if (nums == null || nums.length <= 1) {
			return;
		}

		int[] temp = Arrays.copyOfRange(nums, 0, nums.length);
		int avg = partition(temp, 0, nums.length - 1, nums.length / 2);
		int[] ans = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = avg;
		}

		int l, r;
		if (nums.length % 2 == 0) {
			l = nums.length - 2;
			r = 1;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] < avg) {
					ans[l] = nums[i];
					l -= 2;
				} else if (nums[i] > avg) {
					ans[r] = nums[i];
					r += 2;
				}
			}
		} else {
			l = 0;
			r = nums.length - 2;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] < avg) {
					ans[l] = nums[i];
					l += 2;
				} else if (nums[i] > avg) {
					ans[r] = nums[i];
					r -= 2;
				}
			}
		}

		for (int i = 0; i < nums.length; i++) {
			nums[i] = ans[i];
		}
	}

	private int partition(int[] temp, int left, int right, int rank) {
		int l = left;
		int r = right;
		int now = temp[left];
		while (l < r) {
			while (l < r && temp[r] >= now) {
				r--;
			}
			temp[l] = temp[r];
			while (l < r && temp[l] <= now) {
				l++;
			}
			temp[r] = temp[l];
		}
		temp[l] = now;

		if (l - left < rank) {
			return partition(temp, l + 1, right, rank - (l - left) - 1);
		} else if (l - left > rank) {
			return partition(temp, left, r - 1, rank);
		}
		return now;
	}
}