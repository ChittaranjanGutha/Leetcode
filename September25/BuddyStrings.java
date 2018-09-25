public class BuddyStrings {
    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length())
            return false;
        if (A.equals(B)) {
            int[] count = new int[26];
            for (int i = 0; i < A.length(); i++)
                count[A.charAt(i) - 'a']++;
            for (int i = 0; i < 26; i++) {
                if (count[i] > 1)
                    return true;
            }
            return false;
        } else {
            int index1 = -1, index2 = -1;
            for (int i = 0; i < A.length(); i++) {
                if (A.charAt(i) != B.charAt(i)) {
                    if (index1 == -1)
                        index1 = i;
                    else if (index2 == -1)
                        index2 = i;
                    else
                        return false;
                }
            }
            if (index2 != -1) {
                if (A.charAt(index1) == B.charAt(index2) && A.charAt(index2) == B.charAt(index1))
                    return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        BuddyStrings obj = new BuddyStrings();
        String A = "dd";
        String B = "dd";
        System.out.print(obj.buddyStrings(A, B));
    }
}
