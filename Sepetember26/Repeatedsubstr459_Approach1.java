public class Repeatedsubstr459 {
    public static void main(String[] args) {
        Repeatedsubstr459 obj = new Repeatedsubstr459();
        String str = "abab";
        System.out.print(obj.repeatedSubstringPattern(str));
    }

    public boolean repeatedSubstringPattern(String s) {
        int check = s.length() / 2;
        for (int i = 1; i <= check; i++) {
            String substr = s.substring(0, i);
            if (s.length() % substr.length() != 0)
                continue;
            else {
                int index = 0;
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == substr.charAt(index)) {
                        if (j + 1 == s.length())
                            return true;
                        if (index + 1 == substr.length())
                            index = 0;
                        else
                            index++;
                    } else {
                        break;
                    }
                }
            }
        }
        return false;
    }
}
