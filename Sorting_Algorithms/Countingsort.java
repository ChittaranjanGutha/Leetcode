import javax.xml.transform.Result;

public class Countingsort {
	public static void main(String[] args) {
		int range = 10;
		int[] arr = new int[] {9,8,7,4, 3, 2, 4, 1 };
		Countingsort obj = new Countingsort();
		obj.sort(arr, range);

	}

	public void sort(int[] arr, int range) {
		int[] res = new int[arr.length];
		int[] count = new int[range];
		//Storing number of times a key is repating(Here Index of count is key)
		for (int i = 0; i < arr.length; i++)
			count[arr[i]]++;
		//Iterate over the count and calculate the exact index
		for (int i = 1; i < count.length; i++)
			count[i] = count[i] + count[i - 1];
		//
		for (int i = arr.length - 1; i >= 0; i--) {
			res[count[arr[i]] - 1] = arr[i];
			count[arr[i]] -= 1;
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}
}
