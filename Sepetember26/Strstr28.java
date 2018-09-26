public class StrStr28 {
    public static void main(String[] args) {
        StrStr28 obj = new StrStr28();
        String haystack = "a";
        String needle = "";
        System.out.print(obj.strStr(haystack, needle));

    }

    public int strStr(String haystack, String needle) {
        for (int i = 0; ; i++) {
            for (int j = 0; ; j++) {
                if (j == needle.length())
                    return i;
                if (i + j == haystack.length())
                    return -1;
                if (haystack.charAt(i + j) != needle.charAt(j))
                    break;
            }
        }
    }

    // Approach2
    public int strStr1(String haystack, String needle) {
        if (haystack.equals("") && needle.equals("") || needle.equals(""))
            return 0;
        char[] str = haystack.toCharArray();
        char[] res = needle.toCharArray();
        int i = 0;
        while (i < str.length) {
            int j = i, index = 0;
            while (j < haystack.length() && index < needle.length() && str[j] == res[index]) {
                j++;
                index++;
                if (index == res.length)
                    return i;
            }
            i++;
        }
        return -1;
    }
}
