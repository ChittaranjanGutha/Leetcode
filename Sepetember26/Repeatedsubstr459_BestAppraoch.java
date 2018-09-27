public class Repeatedsubstr459 {
    public static void main(String[] args) {
        Repeatedsubstr459 obj = new Repeatedsubstr459();
        String str = "abab";
        System.out.print(obj.repeatedSubstringPattern(str));
    }

    public boolean repeatedSubstringPattern(String s) {
        int check = s.length() / 2;
        int length = s.length();
        for (int i = check; i >= 1; i--) {
            if (length % i != 0)
                continue;
            else {
                String substr = s.substring(0, i);
                int index = 0;
                while (index < length) {
                    if (!s.startsWith(substr, index))
                        break;
                    index += i;
                    if (index == length)
                        return true;
                }
            }
        }
        return false;
    }
}
