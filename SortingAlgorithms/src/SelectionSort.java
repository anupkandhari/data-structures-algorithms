
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void selectionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int minindex = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[minindex] > array[j]) {
					minindex = j;
				}
			}

			if (minindex != i) {
				int temp = array[minindex];
				array[minindex] = array[i];
				array[i] = temp;
			}

		}

	}

}
