
public class Quicksort {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 6, 3, 9, 11, 7 };
		new Quicksort().Qsort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public void Qsort(int[] arr, int low, int high) {
		if (low < high) {
			int pivot = partisan(arr, low, high);
			Qsort(arr, low, pivot - 1);
			Qsort(arr, pivot + 1, high);

		}

	}

	public int partisan(int[] arr, int low, int high) {
		int start = low, end = high;
		int pivot = arr[low];
		while (start < end) {
			while (arr[start] <= pivot)
				start++;
			while (arr[end] > pivot)
				end--;
			if (start < end) {
				int temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
			}
		}
		arr[low] = arr[end];
		arr[end] = pivot;
		return end;
	}
}
