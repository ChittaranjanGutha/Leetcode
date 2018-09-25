import java.util.Arrays;
import java.util.Comparator;

public class largestNumber179 {


    private class SortComparator implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            String val1 = o1 + o2;
            String val2 = o2 + o1;
            //returns 0 if both the strings are equal;
            //return -1 if string object precedent to  the argument String(a.compareTo(b))
            //return 1 if the comparing string is greater than the argument string;
            return val2.compareTo(val1);
        }
    }

    //Given a list of integers calculate the largest number that can be formed
    public String largerstNumber(int[] nums) {
        String[] values = new String[nums.length];
        for (int i = 0; i < nums.length; i++)
            values[i] = String.valueOf(nums[i]);
        Arrays.sort(values, new SortComparator());
        if (values[0].equals("0"))
            return "0";
        StringBuilder sb = new StringBuilder();
        for (String str : values)
            sb.append(str);
        return sb.toString();
    }

    public static void main(String args[]){
      largestNumber179 obj=new largestNumber179();
      int[] values=new int[]{1,56,32,40};
      System.out.print(obj.largerstNumber(values));
    }
}
