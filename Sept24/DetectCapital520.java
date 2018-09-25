public class DetectCapitals520 {
    public static void main(String args[]) {
        DetectCapitals520 obj=new DetectCapitals520();
        System.out.print(obj.detectCapitalUse("AaA"));

    }

    public boolean detectCapitalUse(String word) {
        int len = word.length();
        if (isUpper(word.charAt(0))) {
            if (1 < len && isUpper(word.charAt(1))) {
                for (int i = 2; i < len; i++) {
                    if (isUpper(word.charAt(i)) == false)
                        return false;
                }
            } else if (1 < len && isLower(word.charAt(1))) {
                for (int i = 2; i < len; i++) {
                    if (isLower(word.charAt(i)) == false)
                        return false;
                }
            }
        } else if (isLower(word.charAt(0))) {
            for (int i = 1; i < len; i++) {
                if (isLower(word.charAt(i)) == false)
                    return false;
            }
        }
        return true;
    }

    public boolean isLower(char ch) {
        if (ch >= 97 && ch <= 122)
            return true;
        return false;
    }

    public boolean isUpper(char ch) {
        if (ch >= 65 && ch <= 90)
            return true;
        return false;
    }
}
