public class CompareVersion165 {
    public static void main(String[] args) {
        CompareVersion165 obj = new CompareVersion165();
        String val1 = "0.1";
        String val2 = "1.1";
        System.out.print(obj.compareVersion(val1, val2));
    }

    //Approach 1
    public int compareVersion(String version1, String version2) {
        String[] v_1 = version1.split("\\.");
        String[] v_2 = version2.split("\\.");
        int len=Math.max(v_1.length,v_2.length);
        for(int i=0;i<len;i++)
        {
            Integer val1=i<v_1.length?Integer.parseInt(v_1[i]):0;
            Integer val2=i<v_2.length?Integer.parseInt(v_2[i]):0;
            int result= val1.compareTo(val2);
            if(result!=0)
                return result;
        }
        return 0;
    }

    //Approach 2
    public int compareVersion1(String version1, String version2) {
        String[] v_1 = version1.split("\\.");
        String[] v_2 = version2.split("\\.");
        int index1 = 0, index2 = 0;
        while (index1 < v_1.length && index2 < v_2.length) {
            if (Integer.parseInt(v_1[index1]) > Integer.parseInt(v_2[index2]))
                return 1;
            else if (Integer.parseInt(v_1[index1]) < Integer.parseInt(v_2[index2]))
                return -1;
            else {
                index1++;
                index2++;
            }
        }
        if (index1 < v_1.length) {
            while (index1 < v_1.length) {
                if (Integer.parseInt(v_1[index1]) > 0)
                    return 1;
                index1++;
            }
            return 0;
        }
        if (index2 < v_2.length) {
            while (index2 < v_2.length) {
                if (Integer.parseInt(v_2[index2]) > 0)
                    return -1;
                index2++;
            }
            return 0;
        }
        if (index1 == v_1.length && index2 == v_2.length)
            return 0;
        return -2;
    }
}
