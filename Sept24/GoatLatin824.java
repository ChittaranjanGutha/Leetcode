import java.util.ArrayList;
import java.util.List;

public class GoatLatin824 {
    public String toGoatLatin(String S) {
        StringBuilder ma = new StringBuilder();
        StringBuilder result = new StringBuilder();
        ma.append("maa");
        char[] ch = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        List<Character> vowels = new ArrayList<>();
        for (char c : ch)
            vowels.add(c);
        String[] words = S.split(" ");
        for (String str : words) {
            if (vowels.contains(str.charAt(0))) {
                result.append(str + ma);
            } else {
                result.append(str.substring(1));
                result.append(str.charAt(0) +""+ ma);
            }
            ma.append("a");
            result.append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String args[]) {
        GoatLatin824 obj = new GoatLatin824();
        String value = "The quick brown fox jumped over the lazy dog";
        System.out.print(obj.toGoatLatin(value));
    }
}
