import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
        String res = "";
        int res_count = 0;
        Map<String, Integer> values = new HashMap<>();
        List<String> banendList = new ArrayList<>();
        for (String s : banned)
            banendList.add(s);
        StringBuilder sb = new StringBuilder();
        for (char ch : paragraph.toCharArray()) {
            if (Character.isLetter(ch))
                sb.append(ch);
            else if (sb.length() > 0) {
                String key = sb.toString();
                if (!banendList.contains(key)) {
                    values.put(key,values.getOrDefault(key, 0) + 1);
                    if (values.get(key) > res_count) {
                        res = key;
                        res_count=values.get(key);
                    }
                }
                sb=new StringBuilder();
            }
        }
     return res;
    }

    public static void main(String args[]) {
        MostCommonWord819 obj = new MostCommonWord819();
        String paragraph = "Bob";
        String[] banned = new String[]{};
        System.out.println();
        System.out.println("The result: "+obj.mostCommonWord(paragraph, banned));

    }
}
