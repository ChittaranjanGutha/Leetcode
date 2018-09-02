
public class Bucketsort {
	public static void main(String[] args) {
		Bucketsort obj = new Bucketsort();
		int[] arr = new int[] { 3, 5, 6, 7, 1, 4, 3, 7, 9 };
		int range = 10;
		obj.Bsort(arr, range);
	}

	public void Bsort(int[] arr, int range) {
		int[] bucket = new int[range];
		// Here bucket index acts like key
		for (int i = 0; i < arr.length; i++) {
			bucket[arr[i]]++;
		}
		int start = 0;
		for (int i = 0; i < bucket.length; i++) {
			for (int j = bucket[i]; j > 0; j--) {
				arr[start] = i;
				start++;
			}
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

	}
}
