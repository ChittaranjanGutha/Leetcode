import java.util.HashSet;
import java.util.Set;

public class Pr_287 {
	public int findDuplicate(int[] nums) {
		Set<Integer> values = new HashSet<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (values.contains(nums[i]))
				return nums[i];
			else
				values.add(nums[i]);
		}
		return -1;
	}
	
	public static void main(String args[])
	{
		int[] nums= {1,2,3,4,5,2};
		Pr_287 obj= new Pr_287();
		System.out.println(obj.findDuplicate(nums));
	}

}
