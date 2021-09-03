
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void quickSort(int[] array, int start, int end) {
		if (start < end) {
			int pivot = partition(array, start, end);

			quickSort(array, start, pivot - 1);
			quickSort(array, pivot + 1, end);
		}
	}

	private int partition(int[] array, int start, int end) {
		// end as pivot
		int i = start - 1;
		for (int j = start; j <= end; j++) {
			if (array[j] <= array[end]) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}
		}
		return i;
	}
	
	private static int partition(int[] in, int l, int r, int pindex) {
		ArrayUtils.swap(in, pindex, l);
		int pivot = in[l];
		int lastmin = l;
		for (int current = l; current <= r; ++current) {
			if (in[current] < pivot)
				ArrayUtils.swap(in, current, ++lastmin);
		}
		ArrayUtils.swap(in, l, lastmin);
		return lastmin;
	}

	
	public static int nthLargest(int[] in, int k) {
		int l = 0, r = in.length - 1;
		while (l <= r) {
			int pind = get_medianOfThree_pivot_index(in, l, r);
			int p = partition(in, l, r, pind);
			if (k == p - l + 1)
				return in[p];
			if (k < p - l + 1)
				r = p - 1;
			else {
				k = k - (p - l + 1);
				l = p + 1;
			}
		}
		return Integer.MIN_VALUE;
	}

// TC:Theta(n) avg     SC:O(1) by using Tail Recursion
// 10 20 15 30 40 50 60

}
