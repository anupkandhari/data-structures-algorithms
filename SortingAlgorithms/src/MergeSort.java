
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void mergeSort(int[] array, int left, int right) {

		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(array, left, mid);
			mergeSort(array, mid + 1, right);

			merge(array, left, mid, right);

		}

	}

	void merge(int[] array, int left, int mid, int right) {

		int s1 = mid - left + 1;
		int s2 = right - mid;

		int[] leftTemp = new int[s1];
		int[] righTemp = new int[s2];

		for (int i = 0; i < s1; i++) {
			leftTemp[i] = array[left + i];
		}

		for (int i = 0; i < s2; i++) {
			righTemp[i] = array[mid + 1 + i];
		}

		int i = 0, j = 0;
		int k = left;
		while (i < s1 & j < s2) {
			if (leftTemp[i] < righTemp[j])
				array[k++] = leftTemp[i++];
			else
				array[k++] = righTemp[j++];
		}

		while (i < s1)
			array[k++] = leftTemp[i++];
		while (j < s2)
			array[k++] = righTemp[j++];

	}

}
