import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pr_64 {

	// With using extra space;
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		int[] result = new int[nums.length];
		for (int i = 0; i < nums.length; i++)
			result[nums[i] - 1]++;
		for (int i = 0; i < result.length; i++) {
			if (result[i] == 0)
				res.add(i + 1);
		}
		return res;
	}

	// Making the array value to index and converting the value at index to negative
	// IF the value is not negative then the number is missing
	public List<Integer> findDisappearedNumbers1(int[] nums) {
		int val = 0;
		List<Integer> res = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			val = Math.abs(nums[i]) - 1;
			if (nums[val] > 0)
				nums[val] = -nums[val];
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				res.add(i + 1);
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nums = { 1, 2, 2, 3, 4, 5, 6, 7, 7, 6 };
		Pr_64 obj = new Pr_64();
		List<Integer> res = obj.findDisappearedNumbers(nums);
		System.out.println(res);
	}
}
