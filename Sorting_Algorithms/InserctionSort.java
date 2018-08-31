
public class InserctionSort {
	public static void main(String[] args) {
		int[] arr = { 7, 5, 4, 8, 12, 14, 16 };
		InserctionSort obj = new InserctionSort();
		int[] res = obj.inserction_sort(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

	public int[] inserction_sort(int[] arr) {
		for (int i = 1; i < arr.length - 1; i++) {
			int v = arr[i];
			int j = i;
			while (j >= 1 && arr[j - 1] > v) {
				arr[j] = arr[j - 1];
				j--;

			}
			arr[j] = v;
		}
		return arr;
	}

}
