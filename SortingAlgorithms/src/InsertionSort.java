
public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void insertionSort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int key = array[i];
			int j = i;

			while (j > 0 && key < array[j - 1]) {
				array[j] = array[j - 1];
				j--;
			}
			array[j] = key;
		}
	}

}
